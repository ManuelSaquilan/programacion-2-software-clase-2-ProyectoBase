package org.clase5.problema1;

public class Cliente {
    private String nombre;
    private int monto;


    public Cliente(String nombre) {
        this.nombre = nombre;
        monto = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void depositar(int m) {
        this.monto += m;
    }

    public void extraer(int m) {
        if (m <= monto) {
            this.monto -= m;
        } else {
            System.out.println("No tiene saldo suficiente");
        }
    }

    public int retornarMonto() {
        return monto;
    }

    public void mostrar() {
        System.out.println("Cliente: " + nombre + " - Monto: " + monto);
    }
}

