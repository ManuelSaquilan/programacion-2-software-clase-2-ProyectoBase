package org.Clase3;

// Confeccionar una clase que represente un empleado.
// Definir como atributos su nombre y su sueldo.
// En el constructor cargar los atributos y luego en otro método imprimir sus datos
//  y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)

public class Ejercicio38 {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    private String nombre;
    private double sueldo;

    public Ejercicio38() {
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextDouble();
    }

    public void imprimirDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo del empleado: " + sueldo);
    }

    public void verificarImpuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado debe pagar impuestos.");
        } else {
            System.out.println("El empleado no debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Ejercicio38 empleado = new Ejercicio38();
        empleado.imprimirDatos();
        empleado.verificarImpuestos();
    }
    
}
