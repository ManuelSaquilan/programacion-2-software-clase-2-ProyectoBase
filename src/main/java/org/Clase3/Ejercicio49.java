package org.Clase3;

// Plantear una clase Dado que tenga como atributo el valor del mismo. En el constructor llamar al método tirar e imprimir.
// Crear dos objetos de la clase Dado.

public class Ejercicio49 {
    private int valor;

    public Ejercicio49() {
        tirar();
        imprimir();
    }

    public void tirar() {
        valor = (int) (Math.random() * 6) + 1;
    }

    public void imprimir() {
        System.out.println("El valor obtenido es: " + valor);
    }

    public static void main(String[] args) {
        Ejercicio49 dado1 = new Ejercicio49();
        Ejercicio49 dado2 = new Ejercicio49();
    }
}
