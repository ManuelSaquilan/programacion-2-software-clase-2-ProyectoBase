package org.clase7.problema11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa con nombre de usuario (String) como llave y PIN hasheado (Integer) como valor
        Map<String, Integer> usuarios = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro y Login con Función Hash ===\n");
        System.out.println("Función Hash: numeroHash = (numeroOriginal * 2) + 256\n");

        // --- FASE DE REGISTRO ---
        System.out.println("--- REGISTRO DE USUARIO ---\n");

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
                scanner.nextLine(); // Limpiar buffer

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
        System.out.println("PIN hasheado almacenado: " + pinHasheado);

        // Imprimir los contenidos del mapa
        System.out.println("\n=== Usuarios Registrados en el Sistema ===");
        for (Map.Entry<String, Integer> entrada : usuarios.entrySet()) {
            System.out.println("Usuario: " + entrada.getKey() + " - PIN Hasheado: " + entrada.getValue());
        }

        // --- FASE DE LOGIN ---
        System.out.println("\n--- LOGIN ---\n");

        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioLogin = scanner.nextLine();

        System.out.print("Ingrese su PIN: ");
        int pinLogin = 0;
        try {
            pinLogin = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Acceso incorrecto");
            scanner.close();
            return;
        }

        // Aplicar función Hash al PIN ingresado para comparar
        int pinLoginHasheado = funcionHash(pinLogin);

        // Verificar si el usuario existe
        if (usuarios.containsKey(usuarioLogin)) {
            // El usuario existe, verificar si el PIN es correcto
            if (usuarios.get(usuarioLogin).equals(pinLoginHasheado)) {
                System.out.println("\nAcceso correcto");
            } else {
                System.out.println("\nEl usuario existe pero la contraseña es incorrecta");
            }
        } else {
            // El usuario no existe
            System.out.println("\nEl usuario no existe");
        }

        scanner.close();
    }

    // Método que implementa la función Hash
    private static int funcionHash(int numeroOriginal) {
        return (numeroOriginal * 2) + 256;
    }
}

