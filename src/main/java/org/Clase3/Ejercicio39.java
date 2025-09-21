package org.Clase3;

// Implementar la clase Operaciones.
// Se deben cargar dos valores enteros en el constructor, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados.

public class Ejercicio39 {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int valor1;
    private int valor2;

    public Ejercicio39() {
        System.out.print("Ingrese el primer valor entero: ");
        valor1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor entero: ");
        valor2 = teclado.nextInt();
    }

    public int sumar() {
        return valor1 + valor2;
    }

    public int restar() {
        return valor1 - valor2;
    }

    public int multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        if (valor2 != 0) {
            return (double) valor1 / valor2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public void imprimirResultados() {
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + dividir());
    }

    public static void main(String[] args) {
        Ejercicio39 operaciones = new Ejercicio39();
        operaciones.imprimirResultados();
    }
}
