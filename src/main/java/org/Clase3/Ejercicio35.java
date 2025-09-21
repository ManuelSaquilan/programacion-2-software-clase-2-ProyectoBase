package org.Clase3;

// Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. 
// Confeccionar los métodos para la carga, otro para imprimir sus datos 
// Confeccionar los métodos para la carga, otro para imprimir sus datos 

public class Ejercicio35 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private String nombre;
    private double sueldo;

    public void cargarDatos() {
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextDouble();
    }

    public void imprimirDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo del empleado: " + sueldo);
    }

    public void pagaImpuestos() {
        if (sueldo > 3000) {
            double impuesto = sueldo * 0.18;
            sueldo -= impuesto;
            System.out.println("Debe pagar impuestos.");
        } else {
            System.out.println("No debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Ejercicio35 empleado = new Ejercicio35();
        empleado.cargarDatos();
        empleado.imprimirDatos();
        empleado.pagaImpuestos();
        teclado.close();
    }

}
