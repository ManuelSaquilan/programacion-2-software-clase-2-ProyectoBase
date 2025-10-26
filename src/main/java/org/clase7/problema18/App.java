package org.clase7.problema18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un mapa con usuarios cifrados (String) como llaves y contraseñas cifradas (Integer) como valores
        Map<String, Integer> usuarios = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro Ultra Seguro de Usuarios ===\n");
        System.out.println("Algoritmos de seguridad:");
        System.out.println("1. Contraseña cifrada = Contraseña original + (cantidad de letras del usuario * 5)");
        System.out.println("2. Usuario cifrado = Se suma 1 a cada letra del nombre de usuario");
        System.out.println("   Ejemplo: 'laura' se convierte en 'mbvsb'\n");

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

            // Aplicar el algoritmo de seguridad a la contraseña
            int contrasenaCifrada = cifrarContrasena(nombreUsuario, contrasena);

            // Aplicar el algoritmo de seguridad al nombre de usuario
            String usuarioCifrado = cifrarUsuario(nombreUsuario);

            // Almacenar en el mapa con el usuario cifrado
            usuarios.put(usuarioCifrado, contrasenaCifrada);

            System.out.println("\nUsuario registrado exitosamente:");
            System.out.println("Usuario original: " + nombreUsuario);
            System.out.println("Usuario cifrado: " + usuarioCifrado);
            System.out.println("Contraseña original: " + contrasena);
            System.out.println("Contraseña cifrada: " + contrasenaCifrada + "\n");
        }

        // Imprimir los contenidos del mapa con las modificaciones
        System.out.println("=== Usuarios Registrados en el Sistema (Cifrados) ===\n");
        System.out.println("Usuario Cifrado\t\t\tContraseña Cifrada");
        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entrada : usuarios.entrySet()) {
            System.out.printf("%-30s%d%n", entrada.getKey(), entrada.getValue());
        }

        // Información adicional de seguridad
        System.out.println("\n=== Información de Seguridad ===\n");
        System.out.println("Tanto los nombres de usuario como las contraseñas se almacenan cifrados.");
        System.out.println("Se utiliza un algoritmo de desplazamiento de caracteres para el usuario:");
        System.out.println("- Cada letra se desplaza +1 en el código ASCII");
        System.out.println("- 'a' se convierte en 'b', 'z' se convierte en '{', etc.");
        System.out.println("\nLas contraseñas se cifran sumando un valor basado en la longitud del usuario.");
        System.out.println("Este doble cifrado proporciona una capa adicional de seguridad.");

        // Demostración práctica del cifrado de usuario
        System.out.println("\n=== Ejemplo de Cifrado de Usuario ===");
        String ejemplo = "laura";
        String ejemploCifrado = cifrarUsuario(ejemplo);
        System.out.println("Original: " + ejemplo);
        System.out.println("Cifrado:  " + ejemploCifrado);
        System.out.println("\nDesglose letra por letra:");
        for (int i = 0; i < ejemplo.length(); i++) {
            char original = ejemplo.charAt(i);
            char cifrado = ejemploCifrado.charAt(i);
            System.out.println("  '" + original + "' (ASCII " + (int)original + ") -> '" + cifrado + "' (ASCII " + (int)cifrado + ")");
        }

        scanner.close();
    }

    // Método que implementa el algoritmo de cifrado de contraseña
    // Fórmula: contraseña cifrada = contraseña original + (cantidad de letras del usuario * 5)
    private static int cifrarContrasena(String usuario, int contrasenaOriginal) {
        int cantidadLetras = usuario.length();
        int modificador = cantidadLetras * 5;
        return contrasenaOriginal + modificador;
    }

    // Método que implementa el algoritmo de cifrado de usuario
    // Suma 1 a cada carácter del nombre de usuario
    private static String cifrarUsuario(String usuario) {
        StringBuilder usuarioCifrado = new StringBuilder();

        for (int i = 0; i < usuario.length(); i++) {
            char letraOriginal = usuario.charAt(i);
            char letraCifrada = (char)(letraOriginal + 1);
            usuarioCifrado.append(letraCifrada);
        }

        return usuarioCifrado.toString();
    }
}

