package org.clase7.problema01;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa que relacione modelos de autos (Key) con fabricantes (Value)
        Map<String, String> autos = new HashMap<>();

        // Cargar 5 modelos de autos utilizando .put(K, V)
        autos.put("Corolla", "Toyota");
        autos.put("Civic", "Honda");
        autos.put("Mustang", "Ford");
        autos.put("Golf", "Volkswagen");
        autos.put("Accord", "Honda");

        // Imprimir modelo y fabricante de todos los autos usando .get(K)
        System.out.println("=== Modelos de Autos y sus Fabricantes ===\n");

        System.out.println("Modelo: Corolla - Fabricante: " + autos.get("Corolla"));
        System.out.println("Modelo: Civic - Fabricante: " + autos.get("Civic"));
        System.out.println("Modelo: Mustang - Fabricante: " + autos.get("Mustang"));
        System.out.println("Modelo: Golf - Fabricante: " + autos.get("Golf"));
        System.out.println("Modelo: Accord - Fabricante: " + autos.get("Accord"));
    }
}
