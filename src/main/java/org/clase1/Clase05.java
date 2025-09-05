package org.clase1;

import java.util.Locale;

public class Clase05 {
    
    public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            scanner.useLocale(Locale.US); // Usar punto como separador decimal
            
            
            // Solicitar los 3 valores por teclado
            System.out.println("Ingrese el primer valor: ");
            double valor1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo valor: ");
            double valor2 = scanner.nextDouble();
            
            System.out.println("Ingrese el tercer valor: ");
            double valor3 = scanner.nextDouble();
            
            // Calcular el promedio
            double promedio = (valor1 + valor2 + valor3) / 3;
            
            // Mostrar el promedio
            System.out.println("\nLos valores ingresados son: " + valor1 + ", " + valor2 + ", " + valor3);
            System.out.println("El promedio es: " + promedio);
            
            // Evaluar si el promedio es mayor o igual a 5, o menor
            if (promedio >= 5) {
                System.out.println("El promedio es mayor o igual a 5");
            } else {
                System.out.println("El promedio es menor a 5");
            }
            
            scanner.close();
        }
}

