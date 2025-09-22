package org.clase4;

// Crear una clase con un Array de 100 elementos enteros.
// Almacenar valores aleatorios comprendidos entre 1 y 10. Imprimir el Array y mostrar la cantidad de elementos que tienen almacenado el valor 10.

public class ej55 {
    private int[] array;

    public ej55() {
        array = new int[100];
    }

    public void cargarValoresAleatorios() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void imprimir() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();
    }

    public void contarIguales10() {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                contador++;
            }
        }
        System.out.println("Cantidad de elementos con valor 10: " + contador);
    }

    public static void main(String[] args) {
        ej55 ejercicio = new ej55();
        ejercicio.cargarValoresAleatorios();
        ejercicio.imprimir();
        ejercicio.contarIguales10();
    }
}
