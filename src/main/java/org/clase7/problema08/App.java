package org.clase7.problema08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa vacío con llaves String (nombre) y valores Tarjeta
        Map<String, Tarjeta> tarjetas = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro de Tarjetas ===\n");
        System.out.println("Reglas de validación:");
        System.out.println("- El número debe estar entre 4000000000000000 y 6000000000000000");
        System.out.println("- Si comienza con 4 es Visa");
        System.out.println("- Si comienza con 5 es Master\n");

        // Solicitar nombre del titular
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = scanner.nextLine();

        String numeroTarjeta = "";
        boolean numeroValido = false;

        // Ciclo para solicitar número de tarjeta hasta que sea válido
        while (!numeroValido) {
            System.out.print("Ingrese el número de tarjeta (sin espacios): ");
            numeroTarjeta = scanner.nextLine();

            // Validar el número de tarjeta
            try {
                long numero = Long.parseLong(numeroTarjeta);

                // Validar que esté en el rango correcto
                if (numero >= 4000000000000000L && numero < 6000000000000000L) {
                    // Validar que comience con 4 o 5
                    if (numeroTarjeta.startsWith("4") || numeroTarjeta.startsWith("5")) {
                        numeroValido = true;
                        // Crear y guardar la tarjeta en el mapa
                        Tarjeta tarjeta = new Tarjeta(numeroTarjeta);
                        tarjetas.put(nombre, tarjeta);
                        System.out.println("\n¡Tarjeta válida y registrada exitosamente!\n");
                    } else {
                        System.out.println("ERROR: La tarjeta debe comenzar con 4 (Visa) o 5 (Master).\n");
                    }
                } else {
                    System.out.println("ERROR: El número debe estar entre 4000000000000000 y 6000000000000000.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debe ingresar solo números.\n");
            }
        }

        // Imprimir las tarjetas almacenadas usando un iterador y entrySet
        System.out.println("=== Tarjetas Registradas ===\n");
        Iterator<Map.Entry<String, Tarjeta>> iterador = tarjetas.entrySet().iterator();

        while (iterador.hasNext()) {
            Map.Entry<String, Tarjeta> entrada = iterador.next();
            System.out.println("Titular: " + entrada.getKey());
            System.out.println(entrada.getValue());
        }

        scanner.close();
    }
}
