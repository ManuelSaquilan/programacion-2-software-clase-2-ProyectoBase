package org.clase4;

// Confeccionaremos un programa que permita crear una Array irregular y luego imprimir el Array en forma completo.

public class ej71 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[][] matriz;

    private void cargarMatriz() {
        System.out.print("Ingrese el número de filas: ");
        int n = teclado.nextInt();
        matriz = new int[n][];
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("Ingrese el número de columnas para la fila " + fila + ": ");
            int m = teclado.nextInt();
            matriz[fila] = new int[m];
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
    }

    public static void main(String[] args) {
        ej71 programa = new ej71();
        programa.cargarMatriz();
        programa.imprimirMatriz();
    }
}
