package org.clase7.problema19;

public class Articulo {
    private String nombre;
    private double precio;

    // Constructor
    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Método toString para facilitar la impresión
    @Override
    public String toString() {
        return String.format("%-15s $%.2f", nombre, precio);
    }
}

