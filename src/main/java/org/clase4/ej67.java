package org.clase4;

// Crear un Array bidimensional de 2 filas y 5 columnas.
// Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente, por teclado)
// Imprimir luego el Array bidimensional.

public class ej67 {
    private java.util.Scanner teclado;
    private int[][] matriz;

    public ej67() {
        matriz = new int[2][5];
        cargarMatriz();
    }

    private void cargarMatriz() {
        teclado = new java.util.Scanner(System.in);
        for (int col = 0; col < 5; col++) {
            for (int fila = 0; fila < 2; fila++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("Contenido de la matriz:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(matriz[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ej67 ejemplo = new ej67();
        ejemplo.imprimirMatriz();
    }
}
