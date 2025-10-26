package org.clase7.problema14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa con llaves String (países) y valores String (capitales)
        Map<String, String> paises = new HashMap<>();

        System.out.println("=== Países y sus Capitales ===\n");

        // Cargar el mapa con 5 países y sus capitales
        paises.put("Argentina", "Buenos Aires");
        paises.put("Brasil", "Brasilia");
        paises.put("Chile", "Santiago");
        paises.put("Colombia", "Bogotá");
        paises.put("Perú", "Lima");

        // Imprimir los países y sus capitales obteniendo los datos desde el mapa
        System.out.println("País\t\t\tCapital");
        System.out.println("----------------------------------------");

        for (Map.Entry<String, String> entrada : paises.entrySet()) {
            System.out.println(entrada.getKey() + "\t\t\t" + entrada.getValue());
        }
    }
}

