package org.clase7.problema08;

public class Tarjeta {
    private String numero;
    private String tipo; // "Visa" o "Master"

    // Constructor
    public Tarjeta(String numero) {
        this.numero = numero;
        this.tipo = determinarTipo(numero);
    }

    // Método para determinar el tipo de tarjeta según el primer dígito
    private String determinarTipo(String numero) {
        if (numero.startsWith("4")) {
            return "Visa";
        } else if (numero.startsWith("5")) {
            return "Master";
        }
        return "Desconocido";
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    // Método toString para imprimir la tarjeta
    @Override
    public String toString() {
        return "Tarjeta " + tipo + " - Número: " + numero;
    }
}

