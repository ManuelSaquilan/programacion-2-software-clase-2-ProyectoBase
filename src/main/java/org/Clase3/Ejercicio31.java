package org.Clase3;
//Confeccionar una clase que permita:
// Cargar el nombre y la edad de una persona.
// Mostrar los datos cargados.
// Imprimir un mensaje si es mayor de edad (edad>=18)



public class Ejercicio31 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private String nombre;
    private int edad;

    public void cargarDatos() {
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void verificarMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio31 persona = new Ejercicio31();
        persona.cargarDatos();
        persona.mostrarDatos();
        persona.verificarMayorEdad();
        teclado.close();
    }
}
