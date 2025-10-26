package org.clase7.problema20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear el inventario con códigos (Integer) como llaves y Artículos como valores
        Map<Integer, Articulo> inventario = new HashMap<>();

        // Cargar los artículos en el inventario
        inventario.put(10, new Articulo("Harina", 100));
        inventario.put(11, new Articulo("Fideos", 150));
        inventario.put(12, new Articulo("Aceite", 400));
        inventario.put(13, new Articulo("Yerba", 700));
        inventario.put(20, new Articulo("Fernet", 900));
        inventario.put(30, new Articulo("Coca-Cola", 400));

        // Crear un mapa para almacenar el código del artículo y la cantidad
        Map<Integer, Integer> factura = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Facturación ===\n");
        System.out.println("Artículos disponibles:");
        System.out.println("Código\tNombre\t\tPrecio");
        System.out.println("----------------------------------------------");
        for (Map.Entry<Integer, Articulo> entrada : inventario.entrySet()) {
            System.out.println(entrada.getKey() + "\t" + entrada.getValue());
        }

        System.out.println("\nIngrese códigos de artículos (0 para finalizar):\n");

        // Ciclo para ingresar códigos hasta que se ingrese 0
        while (true) {
            System.out.print("Código: ");
            int codigo = 0;

            try {
                codigo = scanner.nextInt();

                // Si se ingresa 0, finalizar
                if (codigo == 0) {
                    break;
                }

                // Verificar si el código existe en el inventario
                if (inventario.containsKey(codigo)) {
                    // Si el artículo ya está en la factura, incrementar la cantidad
                    if (factura.containsKey(codigo)) {
                        factura.put(codigo, factura.get(codigo) + 1);
                    } else {
                        // Si no está, agregarlo con cantidad 1
                        factura.put(codigo, 1);
                    }
                    System.out.println("✓ Artículo agregado: " + inventario.get(codigo).getNombre());
                } else {
                    System.out.println("✗ Código inválido. Intente nuevamente.");
                }

            } catch (Exception e) {
                System.out.println("✗ Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar buffer
            }
        }

        // Imprimir la factura
        System.out.println("\n" + "=".repeat(50));
        System.out.println("                    FACTURA");
        System.out.println("=".repeat(50));

        if (factura.isEmpty()) {
            System.out.println("\nNo se agregaron artículos a la factura.");
        } else {
            System.out.println();
            double total = 0;

            // Recorrer la factura e imprimir cada artículo
            for (Map.Entry<Integer, Integer> entrada : factura.entrySet()) {
                int codigo = entrada.getKey();
                int cantidad = entrada.getValue();
                Articulo articulo = inventario.get(codigo);
                double subtotal = articulo.getPrecio() * cantidad;

                System.out.println("- " + cantidad + " x " + articulo.getNombre() + " " + (int)subtotal);
                total += subtotal;
            }

            System.out.println("-".repeat(50));
            System.out.println("- Total " + (int)total);
        }

        System.out.println("=".repeat(50));

        scanner.close();
    }
}

