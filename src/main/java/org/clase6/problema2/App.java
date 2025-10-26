package org.clase6.problema2;

public class App {
    public static void main(String[] args) {
        // Crear un ArrayList de String
        java.util.ArrayList<Nombre> nombres = new java.util.ArrayList<>();

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
    }
}
