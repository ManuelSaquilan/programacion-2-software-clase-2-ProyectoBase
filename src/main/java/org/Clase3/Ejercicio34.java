package org.Clase3;

// Desarrollar una clase que represente un Cuadrado y tenga los métodos para:
// Cargar el valor de su lado
// Imprimir su perímetro.
// Imprimir su superficie.

public class Ejercicio34 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private double lado;

    public void cargarLado() {
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        lado = teclado.nextDouble();
    }

    public void imprimirPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    public void imprimirSuperficie() {
        double superficie = lado * lado;
        System.out.println("La superficie del cuadrado es: " + superficie);
    }
    public static void main(String[] args) {
        Ejercicio34 cuadrado = new Ejercicio34();
        cuadrado.cargarLado();
        cuadrado.imprimirPerimetro();
        cuadrado.imprimirSuperficie();
        teclado.close();
    }
}
