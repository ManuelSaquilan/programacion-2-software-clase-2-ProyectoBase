package org.clase5.problema5;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("Cargando datos de la persona:");
        persona1.cargarDatos();
        persona1.imprimirDatos();

        Empleado empleado1 = new Empleado();
        System.out.println("Cargando datos del empleado:");
        empleado1.cargarDatos();
        empleado1.esMayorDeEdad();
        empleado1.imprimirDatos();
        empleado1.imprimirSueldo();
        empleado1.debePagarImpuesto();
    }
}
