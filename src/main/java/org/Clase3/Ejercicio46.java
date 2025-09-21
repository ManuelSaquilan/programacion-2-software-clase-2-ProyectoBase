package org.Clase3;

// Plantear una clase Dado que tenga como atributo el valor del mismo. Definir dos constructores.
// El primer CONSTRUCTOR que no tenga parámetros (inicializar el valor del dado con 1)
// El segundo CONSTRUCTOR que tenga un parámetro con el valor inicial del dado.
// Crear dos objetos de la clase Dado y llamar para cada objeto a un constructor distinto.
// Dado
// +valor
// +Dado()
// +Dado(valor)
// +imprimir()
// main()

public class Ejercicio46 {
    private int valor;

    public Ejercicio46() {
        valor = 1;
    }

    public Ejercicio46(int valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Valor del dado: " + valor);
    }

    public static void main(String[] args) {
        Ejercicio46 dado1 = new Ejercicio46();
        Ejercicio46 dado2 = new Ejercicio46(6);

        dado1.imprimir();
        dado2.imprimir();
    }
}
