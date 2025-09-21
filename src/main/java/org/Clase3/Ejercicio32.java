package org.Clase3;

// Desarrollar un programa que permita:
// Cargar los lados de un triángulo.
// Inicializar los atributos.
// Imprimir el valor del lado mayor.
// Imprimir un método que muestre si es equilátero o no.
public class Ejercicio32 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private double lado1, lado2, lado3;

    public void cargarLados() {
        System.out.print("Ingrese el valor del lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.print("Ingrese el valor del lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.print("Ingrese el valor del lado 3: ");
        lado3 = teclado.nextDouble();
    }

    public void mostrarLadoMayor() {
        double mayor = lado1;
        if (lado1 > lado2 && lado1 > lado3) {
            mayor = lado1;
        } else if (lado2 > lado1 && lado2 > lado3) {
            mayor = lado2;
        } else if (lado3 > lado1 && lado3 > lado2) {
            mayor = lado3;
        }
        if (mayor <= 0) {
            System.out.println("Los lados deben ser mayores que cero.");
            return;
        }
        System.out.println("El lado mayor es: " + mayor);
    }

    public void esEquilatero() {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else {
            System.out.println("El triángulo no es equilátero.");
        }
    }

    public static void main(String[] args) {
        Ejercicio32 triangulo = new Ejercicio32();
        triangulo.cargarLados();
        triangulo.mostrarLadoMayor();
        triangulo.esEquilatero();
        teclado.close();
    }
}
