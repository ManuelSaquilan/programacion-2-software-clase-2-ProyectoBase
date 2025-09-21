package org.Clase3;

// Implementar la clase operaciones. Se deben escribir los métodos para:
// Cargar dos valores enteros.
// Calcular e imprimir la suma
// Calcular e imprimir la resta
// Calcular e imprimir la multiplicación.
// Calcular e imprimir la división.

public class Ejercicio36 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int valor1;
    private int valor2;

    public void cargarValores() {
        System.out.print("Ingrese el primer valor entero: ");
        valor1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor entero: ");
        valor2 = teclado.nextInt();
    }

    public void imprimirValores() {
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }

    public void sumar() {
        int suma = valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }

    public void restar() {
        int resta = valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar() {
        int multiplicacion = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicacion);
    }

    public void dividir() {
        if (valor2 != 0) {
            double division = (double) valor1 / valor2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("Error: División por cero no es permitida.");
        }
    }

    public static void main(String[] args) {
        Ejercicio36 operaciones = new Ejercicio36();
        operaciones.cargarValores();
        operaciones.imprimirValores();
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();
        teclado.close();
    }    
}
