package org.clase4;

// Hacer una prueba de rendimiento o comparativa (en inglés benchmark) que permita ordenar una lista en Python y un vector en Java de 10_000 elementos enteros.
// Calcular el tiempo en milisegundos que requiere su ejecución.

public class ej63 {
    private int[] array;

    public ej63() {
        array = new int[10_000];
    }

    public void cargar() {
        for (int x = 0; x < array.length; x++) {
            array[x] = 1 + (int) (Math.random() * 5000);
        }
    }

    public void ordenar() {
        for (int k = 0; k < array.length; k++) {
            for (int f = 0; f < array.length - 1 - k; f++) {
                if (array[f] > array[f + 1]) {
                    int aux;
                    aux = array[f];
                    array[f] = array[f + 1];
                    array[f + 1] = aux;
                }
            }
        }
    }

    public void imprimirPrimeros10() {
        for (int f = 0; f < 10; f++) {
        System.out.print(array[f] + " - ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ej63 po = new ej63();
        po.cargar();
        po.imprimirPrimeros10();
        // Tiempo de inicio en milisegundos
        long milesimaInicio = System.currentTimeMillis();
        po.ordenar();
        // Tiempo de fin en milisegundos
        long milesimaFin = System.currentTimeMillis();
        // Tiempo total
        long milisegundos = (milesimaFin - milesimaInicio);
        System.out.println("Tiempo de ejecucion: " + milisegundos + " ms");
        po.imprimirPrimeros10();
    }  
}
