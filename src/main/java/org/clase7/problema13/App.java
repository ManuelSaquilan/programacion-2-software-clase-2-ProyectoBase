package org.clase7.problema13;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        // Declarar un TreeMap con horarios (Integer) como llaves y destinos (String) como valores
        TreeMap<Integer, String> trenes = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Horarios de Trenes ===\n");
        System.out.println("Ingrese los datos de los trenes:\n");

        // Solicitar los datos de los 4 trenes
        for (int i = 1; i <= 4; i++) {
            System.out.println("Tren " + i + ":");

            System.out.print("Ingrese el horario de partida (hora en formato 24h): ");
            int horario = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingrese el destino: ");
            String destino = scanner.nextLine();

            // Agregar al mapa
            trenes.put(horario, destino);
            System.out.println();
        }

        // Imprimir todos los trenes ordenados por horario
        System.out.println("=== Horarios de Trenes (Ordenados) ===\n");
        for (Map.Entry<Integer, String> entrada : trenes.entrySet()) {
            System.out.println("Horario: " + entrada.getKey() + ":00 - Destino: " + entrada.getValue());
        }

        // Imprimir el destino del primer y el último tren
        System.out.println("\n=== Información Específica ===\n");
        System.out.println("Primer tren (más temprano): " + trenes.firstKey() + ":00 - Destino: " + trenes.firstEntry().getValue());
        System.out.println("Último tren (más tarde): " + trenes.lastKey() + ":00 - Destino: " + trenes.lastEntry().getValue());

        scanner.close();
    }
}

