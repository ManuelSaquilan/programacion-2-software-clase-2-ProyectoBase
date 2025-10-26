package org.clase7.problema15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa con llaves String (nombres de colores) y valores int[] (componentes RGB)
        Map<String, int[]> colores = new HashMap<>();

        System.out.println("=== Sistema de Colores RGB ===\n");
        System.out.println("Formato: (Rojo, Verde, Azul) - Valores de 0 a 255\n");

        // Cargar los colores básicos
        colores.put("rojo", new int[]{255, 0, 0});
        colores.put("verde", new int[]{0, 255, 0});
        colores.put("azul", new int[]{0, 0, 255});

        // Cargar dos colores personalizados
        colores.put("naranja", new int[]{255, 165, 0});      // Naranja
        colores.put("morado", new int[]{128, 0, 128});       // Morado/Púrpura

        // Imprimir todos los colores almacenados en el mapa
        System.out.println("=== Colores Almacenados ===\n");

        for (Map.Entry<String, int[]> entrada : colores.entrySet()) {
            String nombreColor = entrada.getKey();
            int[] componentesRGB = entrada.getValue();

            System.out.printf("%-15s RGB(%d, %d, %d)%n",
                              nombreColor.toUpperCase() + ":",
                              componentesRGB[0],
                              componentesRGB[1],
                              componentesRGB[2]);
        }

        // Información adicional
        System.out.println("\n=== Información Adicional ===\n");
        System.out.println("Colores básicos:");
        System.out.println("- Rojo:   Rojo máximo (255), Verde y Azul en 0");
        System.out.println("- Verde:  Verde máximo (255), Rojo y Azul en 0");
        System.out.println("- Azul:   Azul máximo (255), Rojo y Verde en 0");

        System.out.println("\nColores personalizados:");
        System.out.println("- Naranja: Mezcla de rojo (255) y verde (165)");
        System.out.println("- Morado:  Mezcla de rojo (128) y azul (128)");

        // Demostrar cómo acceder a un color específico
        System.out.println("\n=== Ejemplo de Acceso ===");
        String colorBuscado = "naranja";
        if (colores.containsKey(colorBuscado)) {
            int[] rgb = colores.get(colorBuscado);
            System.out.println("El color '" + colorBuscado + "' tiene componentes:");
            System.out.println("  R: " + rgb[0]);
            System.out.println("  G: " + rgb[1]);
            System.out.println("  B: " + rgb[2]);
        }
    }
}

