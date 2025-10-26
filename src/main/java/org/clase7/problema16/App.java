package org.clase7.problema16;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        // Crear un TreeMap para mantener los apellidos ordenados alfabéticamente
        Map<String, Integer> alumnos = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro de Calificaciones ===\n");
        System.out.println("Instrucciones:");
        System.out.println("- Ingrese apellidos y calificaciones de alumnos");
        System.out.println("- Si ingresa un apellido que ya existe, será eliminado del registro");
        System.out.println("- Escriba 'finalizar' como apellido para terminar\n");

        // Ciclo para cargar datos hasta que se ingrese "finalizar"
        while (true) {
            System.out.print("Ingrese el apellido del alumno: ");
            String apellido = scanner.nextLine().trim();

            // Verificar si se quiere finalizar
            if (apellido.equalsIgnoreCase("finalizar")) {
                break;
            }

            // Verificar si el apellido ya existe en el mapa
            if (alumnos.containsKey(apellido)) {
                // Si existe, eliminar la entrada
                alumnos.remove(apellido);
                System.out.println("¡ATENCIÓN! El apellido '" + apellido + "' ya existía y ha sido eliminado del registro.\n");
            } else {
                // Si no existe, solicitar la calificación
                System.out.print("Ingrese la calificación: ");
                try {
                    int calificacion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    // Agregar al mapa
                    alumnos.put(apellido, calificacion);
                    System.out.println("Alumno registrado exitosamente.\n");
                } catch (Exception e) {
                    System.out.println("ERROR: Debe ingresar un número válido para la calificación.\n");
                    scanner.nextLine(); // Limpiar buffer
                }
            }
        }

        // Imprimir la lista de alumnos y sus calificaciones en orden alfabético
        System.out.println("\n=== Lista de Alumnos y Calificaciones (Orden Alfabético) ===\n");

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Apellido\t\tCalificación");
            System.out.println("----------------------------------------");

            for (Map.Entry<String, Integer> entrada : alumnos.entrySet()) {
                System.out.printf("%-20s%d%n", entrada.getKey(), entrada.getValue());
            }

            System.out.println("\nTotal de alumnos registrados: " + alumnos.size());
        }

        scanner.close();
    }
}

