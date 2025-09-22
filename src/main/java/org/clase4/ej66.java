package org.clase4;

// Se pide crear una Array bidimensional de 4×4 de números enteros.
// a) Rellenar el Array bidimensional con valores aleatorios comprendidos entre 1 y 9.
// b) Sumar la diagonal principal.
// x - - -
// - x - -
// - - x -
// - - - x
// c) Sumar la diagonal secundaria.
// - - - x
// - - x -
// - x - -
// x - - -
// d) Suma de una fila que debe llegar como parámetro al método.
// e) Calcular el promedio de todos sus elementos del Array bidimensional

public class ej66 {
    
    private int[][] matriz;
    private int filas;
    private int columnas;

    public ej66(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
        rellenarMatriz();
    }

    private void rellenarMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1; // Valores entre 1 y 9
            }
        }
    }

    public int sumarDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public int sumarDiagonalSecundaria() {
        int suma = 0;
        for (int i = 0; i < Math.min(filas, columnas); i++) {
            suma += matriz[i][columnas - 1 - i];
        }
        return suma;
    }

    public int sumarFila(int fila) {
        if (fila < 0 || fila >= filas) {
            throw new IllegalArgumentException("Fila fuera de rango");
        }
        int suma = 0;
        for (int j = 0; j < columnas; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public double calcularPromedio() {
        int sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        return (double) sumaTotal / (filas * columnas);
    }

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ej66 matriz = new ej66(4, 4);
        matriz.imprimirMatriz();
        System.out.println("Suma diagonal principal: " + matriz.sumarDiagonalPrincipal());
        System.out.println("Suma diagonal secundaria: " + matriz.sumarDiagonalSecundaria());
        System.out.println("Suma fila 2: " + matriz.sumarFila(2));
        System.out.println("Promedio de todos los elementos: " + matriz.calcularPromedio());
    }
}
