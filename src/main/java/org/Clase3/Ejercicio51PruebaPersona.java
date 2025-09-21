package org.Clase3;

public class Ejercicio51PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Valor del atributo estático cantidad:" + Ejercicio50Persona.cantidad);
        Ejercicio50Persona per1 = new Ejercicio50Persona("Juan", 30);
        per1.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Ejercicio50Persona.cantidad);
        Ejercicio50Persona per2 = new Ejercicio50Persona("Ana", 20);
        per2.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Ejercicio50Persona.cantidad);
        Ejercicio50Persona per3 = new Ejercicio50Persona("Luis", 10);
        per3.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Ejercicio50Persona.cantidad);
    }
}
