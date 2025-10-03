package org.clase5.problema5;

// Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
// Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.

import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected int edad;
    protected Scanner teclado;

    public Persona() {
        teclado = new Scanner(System.in);
    }

    public void cargarDatos() {
        System.out.print("Ingrese nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Ingrese edad: ");
        this.edad = Integer.parseInt(teclado.nextLine());
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
}
