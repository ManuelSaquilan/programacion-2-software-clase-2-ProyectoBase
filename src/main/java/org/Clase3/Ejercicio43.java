package org.Clase3;

// Plantear una clase Dado que tenga como atributo el valor del mismo.
// En el constructor inicializar el mismo con el valor 1.
// Plantear otros dos métodos, el primero que almacene un valor aleatorio comprendido entre 1 y 6, y el segundo método que muestre el valor del dado.
// En el método main() definir 3 objetos de la clase Dado, generar el valor de cada uno e imprimir dicho valor.

public class Ejercicio43 {
    private int valor;

    public Ejercicio43() {
        this.valor = 1;
    }

    public void tirar() {
        this.valor = 1 + (int) (Math.random() * 6);
    }

    public void imprimir() {
        System.out.println(this.valor);
    }

    public static void main(String[] args) {
        Ejercicio43 dado1 = new Ejercicio43();
        dado1.tirar();
        dado1.imprimir();

        Ejercicio43 dado2 = new Ejercicio43();
        dado2.tirar();
        dado2.imprimir();

        Ejercicio43 dado3 = new Ejercicio43();
        dado3.tirar();
        dado3.imprimir();
    }
}
