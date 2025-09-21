package org.Clase3;

// Plantear una clase llamada Usuario. En el constructor realizar la carga de su nombre y clave.
// Definir otros dos métodos para imprimir los datos ingresados y un mensaje si la clave tiene menos de 6 caracteres.

public class Ejercicio37 {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    private String nombre;
    private String clave;

    public Ejercicio37() {
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su clave: ");
        clave = teclado.nextLine();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clave: " + clave);
    }

    public void verificarClave() {
        if (clave.length() < 6) {
            System.out.println("La clave tiene menos de 6 caracteres.");
        } else {
            System.out.println("La clave es válida.");
        }
    }

    public static void main(String[] args) {
        Ejercicio37 usuario = new Ejercicio37();
        usuario.imprimirDatos();
        usuario.verificarClave();
    }
}
