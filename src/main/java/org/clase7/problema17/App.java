package org.clase7.problema17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un mapa con usuarios (String) como llaves y contraseñas cifradas (Integer) como valores
        Map<String, Integer> usuarios = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro Seguro de Usuarios ===\n");
        System.out.println("Algoritmo de seguridad:");
        System.out.println("Contraseña cifrada = Contraseña original + (cantidad de letras del usuario * 5)\n");

        // Solicitar 3 pares usuario-contraseña
        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuario " + i + ":");

            System.out.print("Ingrese el nombre de usuario: ");
            String nombreUsuario = scanner.nextLine().trim();

            int contrasena = 0;
            boolean contrasenaValida = false;

            // Ciclo para solicitar contraseña válida (5 cifras: 10000-99999)
            while (!contrasenaValida) {
                System.out.print("Ingrese la contraseña (5 cifras): ");
                try {
                    contrasena = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    // Validar que sea de 5 cifras (entre 10000 y 99999)
                    if (contrasena >= 10000 && contrasena <= 99999) {
                        contrasenaValida = true;
                    } else {
                        System.out.println("ERROR: La contraseña debe tener exactamente 5 cifras.\n");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: Debe ingresar solo números.\n");
                    scanner.nextLine(); // Limpiar buffer
                }
            }

            // Aplicar el algoritmo de seguridad
            int contrasenaCifrada = cifrarContrasena(nombreUsuario, contrasena);

            // Almacenar en el mapa
            usuarios.put(nombreUsuario, contrasenaCifrada);

            System.out.println("Usuario registrado exitosamente.");
            System.out.println("Contraseña original: " + contrasena);
            System.out.println("Contraseña cifrada: " + contrasenaCifrada + "\n");
        }

        // Imprimir los contenidos del mapa
        System.out.println("=== Usuarios Registrados en el Sistema ===\n");
        System.out.println("Usuario\t\t\tContraseña Cifrada");
        System.out.println("------------------------------------------------");

        for (Map.Entry<String, Integer> entrada : usuarios.entrySet()) {
            System.out.printf("%-25s%d%n", entrada.getKey(), entrada.getValue());
        }

        // Información adicional de seguridad
        System.out.println("\n=== Información de Seguridad ===\n");
        System.out.println("Las contraseñas se almacenan cifradas usando nuestro algoritmo propietario.");
        System.out.println("Nunca se almacena la contraseña original en el sistema.");
        System.out.println("Para validar un login, se cifraría la contraseña ingresada y se compararía");
        System.out.println("con la contraseña cifrada almacenada en el mapa.");

        scanner.close();
    }

    // Método que implementa el algoritmo de cifrado
    // Fórmula: contraseña cifrada = contraseña original + (cantidad de letras del usuario * 5)
    private static int cifrarContrasena(String usuario, int contrasenaOriginal) {
        int cantidadLetras = usuario.length();
        int modificador = cantidadLetras * 5;
        return contrasenaOriginal + modificador;
    }
}

