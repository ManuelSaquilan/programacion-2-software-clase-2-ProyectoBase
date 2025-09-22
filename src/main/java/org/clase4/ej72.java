package org.clase4;

// Confeccionar una clase para administrar una Array irregular de 5 filas y 1 columna la primer fila,
// 2 columnas la segunda fila y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador)
// Realizar la carga por teclado e imprimir posteriormente.

public class ej72 {
    private int[][] matriz = new int[5][];
    private java.util.Scanner teclado = new java.util.Scanner(System.in);

    public ej72() {
        for (int fila = 0; fila < matriz.length; fila++) {
            matriz[fila] = new int[fila + 1];
        }
    }

    private void cargarMatriz() {
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
    }

    public static void main(String[] args) {
        ej72 programa = new ej72();
        programa.cargarMatriz();
        programa.imprimirMatriz();
    }
}
