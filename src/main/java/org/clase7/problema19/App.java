package org.clase7.problema19;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa con códigos (Integer) como llaves y Artículos como valores
        Map<Integer, Articulo> inventario = new HashMap<>();

        System.out.println("=== Sistema de Inventario ===\n");

        // Cargar los artículos en el inventario
        inventario.put(10, new Articulo("Harina", 100));
        inventario.put(11, new Articulo("Fideos", 150));
        inventario.put(12, new Articulo("Aceite", 400));
        inventario.put(13, new Articulo("Yerba", 700));
        inventario.put(20, new Articulo("Fernet", 900));
        inventario.put(30, new Articulo("Coca-Cola", 400));

        // Imprimir el inventario
        System.out.println("INVENTARIO DE PRODUCTOS\n");
        System.out.println("Código\tNombre\t\tPrecio");
        System.out.println("----------------------------------------------");

        for (Map.Entry<Integer, Articulo> entrada : inventario.entrySet()) {
            Integer codigo = entrada.getKey();
            Articulo articulo = entrada.getValue();
            System.out.println(codigo + "\t" + articulo);
        }

        System.out.println("\nTotal de artículos en inventario: " + inventario.size());
    }
}

