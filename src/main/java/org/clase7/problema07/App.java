package org.clase7.problema07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa vacío con llaves String y valores Integer
        Map<String, Integer> alumnos = new HashMap<>();

        // Crear objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Alumnos y Calificaciones ===\n");

        // Ciclo para pedir datos de 5 alumnos
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i + ":");

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la calificación: ");
            int calificacion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            // Guardar en el mapa
            alumnos.put(nombre, calificacion);
            System.out.println();
        }

        // Imprimir los datos del mapa
        System.out.println("=== Calificaciones Registradas ===\n");
        for (String nombre : alumnos.keySet()) {
            System.out.println(nombre + ": " + alumnos.get(nombre)); // El metodo .get() recibe una llave y retorna el valor asociado a esa llave
        }

        scanner.close();
    }
}
