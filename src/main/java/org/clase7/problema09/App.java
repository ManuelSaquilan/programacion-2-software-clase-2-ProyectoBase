package org.clase7.problema09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa con nombre de usuario (String) como llave y PIN hasheado (Integer) como valor
        Map<String, Integer> usuarios = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro con Función Hash ===\n");
        System.out.println("Función Hash: numeroHash = (numeroOriginal * 2) + 256\n");

        // Solicitar nombre de usuario
        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        int pin = 0;
        boolean pinValido = false;

        // Ciclo para solicitar PIN hasta que sea válido (4 dígitos)
        while (!pinValido) {
            System.out.print("Ingrese un PIN de 4 dígitos: ");
            try {
                pin = scanner.nextInt();

                // Validar que sea de 4 dígitos (entre 1000 y 9999)
                if (pin >= 1000 && pin <= 9999) {
                    pinValido = true;
                } else {
                    System.out.println("ERROR: El PIN debe tener exactamente 4 dígitos.\n");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ingresar solo números.\n");
                scanner.nextLine(); // Limpiar buffer
            }
        }

        // Aplicar la función Hash al PIN
        int pinHasheado = funcionHash(pin);

        // Almacenar en el mapa
        usuarios.put(nombreUsuario, pinHasheado);

        System.out.println("\n¡Usuario registrado exitosamente!\n");
        System.out.println("PIN original: " + pin);
        System.out.println("PIN hasheado: " + pinHasheado);

        // Imprimir los contenidos del mapa
        System.out.println("\n=== Contenidos del Mapa ===\n");
        for (Map.Entry<String, Integer> entrada : usuarios.entrySet()) {
            System.out.println("Usuario: " + entrada.getKey());
            System.out.println("PIN Hasheado: " + entrada.getValue());
        }

        // Análisis de resultados
        System.out.println("\n=== Análisis ===");
        System.out.println("La función Hash transformó el PIN de 4 dígitos en un número mayor.");
        System.out.println("Esto dificulta que alguien pueda conocer el PIN original simplemente");
        System.out.println("viendo el valor almacenado en el mapa.");
        System.out.println("Nota: Esta es una función Hash simplificada, en sistemas reales se");
        System.out.println("utilizan algoritmos mucho más complejos y seguros (SHA-256, bcrypt, etc.)");

        scanner.close();
    }

    // Metodo que implementa la función Hash
    private static int funcionHash(int numeroOriginal) {
        return (numeroOriginal * 2) + 256;
    }
}
