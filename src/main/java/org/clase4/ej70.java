package org.clase4;

// Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila. Utilizar el atributo length.

public class ej70 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[][] matriz;

    private void cargarMatriz() {
        System.out.print("Ingrese el número de filas: ");
        int n = teclado.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int m = teclado.nextInt();
        matriz = new int[n][m];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print("Fila " + fila + " Columna " + col + " Ingrese un numero: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }
    }

    private void imprimirMatriz() {
        System.out.println("Matriz completa:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Última fila:");
        for (int col = 0; col < matriz[matriz.length - 1].length; col++) {
            System.out.print(matriz[matriz.length - 1][col] + " ");
        }
    }

    public static void main(String[] args) {
        ej70 programa = new ej70();
        programa.cargarMatriz();
        programa.imprimirMatriz();
    }
}
