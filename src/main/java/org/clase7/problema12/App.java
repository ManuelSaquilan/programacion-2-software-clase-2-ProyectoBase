package org.clase7.problema12;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        // Declarar un TreeMap con llaves Integer y valores String
        TreeMap<Integer, String> mapa = new TreeMap<>();

        System.out.println("=== TreeMap - Demostración de Ordenamiento Automático ===\n");

        // Agregar elementos en el orden propuesto
        System.out.println("Agregando elementos en este orden:");
        System.out.println("1. Key: 3,  Value: Tres");
        mapa.put(3, "Tres");

        System.out.println("2. Key: 2,  Value: Dos");
        mapa.put(2, "Dos");

        System.out.println("3. Key: 44, Value: Cuarenta y Cuatro");
        mapa.put(44, "Cuarenta y Cuatro");

        // Imprimir los contenidos del mapa utilizando un ciclo for
        System.out.println("\n=== Contenidos del TreeMap ===\n");
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Key: " + entrada.getKey() + " - Value: " + entrada.getValue());
        }

        // Discusión del resultado
        System.out.println("\n=== DISCUSIÓN DEL RESULTADO ===\n");
        System.out.println("OBSERVACIÓN:");
        System.out.println("Los elementos se agregaron en el orden: 3, 2, 44");
        System.out.println("Sin embargo, se imprimen en el orden: 2, 3, 44\n");

        System.out.println("EXPLICACIÓN:");
        System.out.println("TreeMap es una implementación de Map que mantiene sus elementos");
        System.out.println("ORDENADOS AUTOMÁTICAMENTE por sus llaves (keys).");
        System.out.println();
        System.out.println("Diferencias entre HashMap y TreeMap:");
        System.out.println("- HashMap: No garantiza ningún orden específico");
        System.out.println("- TreeMap: Mantiene las llaves ordenadas de forma natural (ascendente)");
        System.out.println();
        System.out.println("En este caso, las llaves Integer se ordenan numéricamente:");
        System.out.println("2 < 3 < 44");
        System.out.println();
        System.out.println("VENTAJAS de TreeMap:");
        System.out.println("- Elementos siempre ordenados");
        System.out.println("- Útil cuando necesitas iterar en orden");
        System.out.println("- Métodos adicionales: firstKey(), lastKey(), etc.");
        System.out.println();
        System.out.println("DESVENTAJAS de TreeMap:");
        System.out.println("- Ligeramente más lento que HashMap");
        System.out.println("- Requiere más memoria para mantener el orden");
    }
}

