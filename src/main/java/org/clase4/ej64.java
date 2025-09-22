package org.clase4;

// Crear una Array de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes por teclado y luego imprimirlas.

public class ej64 {
    
    private java.util.Scanner teclado;
    private int[][] array;

    public ej64() {
        teclado = new java.util.Scanner(System.in);
        array = new int[3][5];
    }

    public void cargar() {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print("[fila " + (fila+1) + ", columna " + (columna+1) + "] Ingrese un numero entero: ");
                array[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna] + " - ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ej64 po = new ej64();
        po.cargar();
        po.imprimir();
    }
}
