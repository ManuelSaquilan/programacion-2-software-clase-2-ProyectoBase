package org.clase4;

// Crear y cargar una matriz de 3 filas por 4 columnas.
// Imprimir la primer fila.
// Imprimir la última fila e imprimir la primer columna.

public class ej69 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[][] matriz = new int[3][4];

    private void cargarMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print("Fila " + fila + " Columna " + col + " Ingrese un numero: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }
    }

    private void imprimirMatriz() {
        System.out.println("Primer fila:");
        for (int col = 0; col < matriz[0].length; col++) {
            System.out.print(matriz[0][col] + " ");
        }
        System.out.println("\nUltima fila:");
        for (int col = 0; col < matriz[matriz.length - 1].length; col++) {
            System.out.print(matriz[matriz.length - 1][col] + " ");
        }
        System.out.println("\nPrimer columna:");
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print(matriz[fila][0] + " ");
        }
    }

    public static void main(String[] args) {
        ej69 programa = new ej69();
        programa.cargarMatriz();
        programa.imprimirMatriz();
    }
}
