package org.clase6.problema3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Crear un ArrayList de Nombre
        ArrayList<Nombre> nombres = new ArrayList<>();

        // Agregar tres nombres a la lista utilizando .add()
        nombres.add(new Nombre("Juan"));
        nombres.add(new Nombre("María"));
        nombres.add(new Nombre("Pedro"));

        // Imprimir los nombres en la lista utilizando .get()
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i).getNombre());
        }

        // Imprimir el tamaño de la lista utilizando .size()
        System.out.println("Tamaño de la lista: " + nombres.size());

        nombres.remove(nombres.size() - 1); // Eliminar el último elemento de la lista
        nombres.set(0, new Nombre("Ana")); // Reemplazar el primer elemento por otro

        // Imprimir los nombres en la lista después de las modificaciones
        System.out.println("Después de las modificaciones:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i).getNombre());
        }
        // Imprimir el tamaño de la lista después de las modificaciones
        System.out.println("Tamaño de la lista después de las modificaciones: " + nombres.size());
    }   
}
