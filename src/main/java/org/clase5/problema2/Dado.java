package org.clase5.problema2;

public class Dado {
    private int valor;

    public void tirar() {
        this.valor = 1 + (int) (Math.random() * 6); // Genera un número entre 1 y 6
    }

    public void imprimirValor() {
        System.out.println("El valor del dado es: " + valor);
    }

    public int retornarValor() {
        return valor;
    }
}