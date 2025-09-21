package org.Clase3;

// Definir un atributo estático que almacene la cantidad de objetos creados de dicha clase.
// Archivo: Persona.java
public class Ejercicio50Persona {
    private String nombre;
    private int edad;
    public static int cantidad;

    public Ejercicio50Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }
    
    public void imprimir() {
    System.out.println(nombre + " " + edad);
    }
}
