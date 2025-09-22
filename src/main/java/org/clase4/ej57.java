package org.clase4;

// Desarrollar un programa que permita ingresar un Array de 4 elementos de tipo int, e implemente los siguientes métodos:
// a) El constructor donde creamos el Arreglo.
// b) Un método para cargar sus componentes.
// c) Calcular el valor acumulado de todos los elementos del Array.
// d) Cantidad de valores mayores a 50.

public class ej57 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[] arreglo;

    public ej57() {
        arreglo = new int[4];
    }

    public void cargarElementos(int[] elementos) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = teclado.nextInt();
        }
    }

    public int calcularAcumulado() {
        int acumulado = 0;
        for (int num : arreglo) {
            acumulado += num;
        }
        return acumulado;
    }

    public int contarMayoresA50() {
        int contador = 0;
        for (int num : arreglo) {
            if (num > 50) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ej57 miArreglo = new ej57();
        int[] elementos = {10, 60, 30, 80};
        miArreglo.cargarElementos(elementos);
        
        int acumulado = miArreglo.calcularAcumulado();
        int cantidadMayoresA50 = miArreglo.contarMayoresA50();
        
        System.out.println("Valor acumulado: " + acumulado);
        System.out.println("Cantidad de valores mayores a 50: " + cantidadMayoresA50);
    }
}
