package org.clase7.problema02;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa que relacione nombres de constantes (String) con valores (Double)
        Map<String, Double> constantes = new HashMap<>();

        // Cargar el mapa con las constantes matemáticas
        constantes.put("pi", 3.1415);
        constantes.put("e", 2.7182);
        constantes.put("GoldenRatio", 1.6180);

        // Imprimir los contenidos del mapa con el formato "Llave = valor"
        System.out.println("=== Contenidos del Mapa ===");
        for (Map.Entry<String, Double> entrada : constantes.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        // Imprimir el tamaño del mapa utilizando .size()
        System.out.println("\n=== Tamaño del Mapa ===");
        System.out.println("Tamaño: " + constantes.size());

        // Imprimir el resultado de ejecutar .containsValue(1.6180)
        System.out.println("\n=== containsValue(1.6180) ===");
        System.out.println("¿Contiene el valor 1.6180?: " + constantes.containsValue(1.6180));

        // Imprimir el resultado de ejecutar .containsKey("phi")
        System.out.println("\n=== containsKey(\"phi\") ===");
        System.out.println("¿Contiene la llave \"phi\"?: " + constantes.containsKey("phi"));

        // Imprimir el resultado de ejecutar isEmpty()
        System.out.println("\n=== isEmpty() ===");
        System.out.println("¿El mapa está vacío?: " + constantes.isEmpty());
    }
}
