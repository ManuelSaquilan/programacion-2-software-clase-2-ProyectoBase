package org.clase7.problema06;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa con llaves y valores de tipo Integer
        Map<Integer, Integer> numerosYCubos = new HashMap<>();

        // Con un ciclo cargar los números del 1 al 5 como llaves y el cubo de cada uno como valor
        System.out.println("=== Cargando números y sus cubos ===");
        for (int i = 1; i <= 5; i++) {
            int cubo = i * i * i;
            numerosYCubos.put(i, cubo); // numero como LLAVE y su cubo como VALOR
            System.out.println("Número: " + i + " -> Cubo: " + cubo);
        }

        // Utilizando otro ciclo imprimir solo los valores del mapa
        System.out.println("\n=== Valores del mapa (cubos) ===");
        for (Integer valor : numerosYCubos.values()) { // Iterar sobre los valores del mapa
            System.out.println(valor);
        }
    }
}
