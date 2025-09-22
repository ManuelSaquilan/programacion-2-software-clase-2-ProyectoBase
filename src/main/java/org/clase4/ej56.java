package org.clase4;

// Crear un Array con la cantidad de elementos que ingresa el operador por teclado. Luego cargar valores aleatorios comprendidos entre 1 y 10. Imprimir el Array.

public class ej56 {
    private java.util.Scanner teclado;
    private int[] array;

    public ej56(int tamaño) {    
        teclado = new java.util.Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del array: ");
        tamaño = teclado.nextInt();
        array = new int[tamaño];
    }

    public void cargarArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void imprimirArray() {
        System.out.print("Elementos del array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ej56 ejercicio = new ej56(0);
        ejercicio.cargarArray();
        ejercicio.imprimirArray();
    }
}

