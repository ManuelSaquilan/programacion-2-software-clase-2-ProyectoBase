package org.clase4;

// Crear un Array de n elementos de tipo entero. Cargar valores aleatorios comprendidos entre 1 y 100.
// Implementar dos métodos, uno que imprima el mayor valor y otro el menor valor del vector.

public class ej60 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[] arreglo;
    
    private void cargarArreglo() {
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = teclado.nextInt();
        arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }
    }

    private void imprimirMayor() {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El mayor valor del arreglo es: " + mayor);
    }

    private void imprimirMenor() {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El menor valor del arreglo es: " + menor);
    }

    public static void main(String[] args) {
        ej60 programa = new ej60();
        programa.cargarArreglo();
        programa.imprimirMayor();
        programa.imprimirMenor();
    }
    
}
