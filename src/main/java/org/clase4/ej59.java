package org.clase4;

// Crear un Array de 5 elementos de tipo entero por teclado.
// Implementar un método que imprima si está ordenado de menor a mayor.

public class ej59 {
    private java.util.Scanner scanner = new java.util.Scanner(System.in);
    private int[] numeros;

    public ej59() {
        System.out.println("Ingrese cuantos elementos deses cargar:");
        int n = scanner.nextInt();
        numeros = new int[n];
    }

    public void cargarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    public boolean estaOrdenado() {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ej59 gestionNumeros = new ej59();
        gestionNumeros.cargarNumeros();
        if (gestionNumeros.estaOrdenado()) {
            System.out.println("El array está ordenado de menor a mayor.");
        } else {
            System.out.println("El array no está ordenado de menor a mayor.");
        }
    }
  
}
