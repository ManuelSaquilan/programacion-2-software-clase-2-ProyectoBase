package org.Clase3;

// Declarar una clase que represente un Articulo, sus atributos son el nombre, precio y stock.
// Al constructor llegan los tres datos como parámetro: nombre, precio y stock.
// Definir los siguientes métodos:
// Imprimir todos los atributos.
// Retornar el stock actual del producto.
// En el método main() definir 2 objetos de la clase artículo y mostrar un mensaje que hay que reponer el stock si está por debajo de 10.

public class Ejercicio44 {
    private String nombre;
    private double precio;
    private int stock;

    public Ejercicio44(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("----------------------");
    }

    public int getStock() {
        return stock;
    }

    public static void main(String[] args) {
        Ejercicio44 articulo1 = new Ejercicio44("Articulo 1", 100.0, 5);
        Ejercicio44 articulo2 = new Ejercicio44("Articulo 2", 200.0, 15);

        articulo1.imprimir();
        articulo2.imprimir();

        if (articulo1.getStock() < 10) {
            System.out.println("Hay que reponer el stock del " + articulo1.nombre);
        }

        if (articulo2.getStock() < 10) {
            System.out.println("Hay que reponer el stock del " + articulo2.nombre);
        }
    }
}
