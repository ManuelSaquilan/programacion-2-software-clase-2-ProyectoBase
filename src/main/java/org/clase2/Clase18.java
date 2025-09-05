package org.clase2;

import java.util.Locale;

public class Clase18 {
    
    // Se ingresan un conjunto de n alturas de personas por teclado,
    // ingresar n por teclado. Mostrar la altura promedio de las personas

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(Locale.US); // Usar punto como separador decimal

        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();

        double sumaAlturas = 0;
        int contador = 0;
        while (n > contador) {
            System.out.print("Ingrese la altura de la persona " + (contador + 1) + ": ");
            double altura = scanner.nextDouble();
            sumaAlturas += altura;
            contador++;
        }

        double promedioAlturas = sumaAlturas / contador;
        System.out.println("La altura promedio es: " + String.format("%.2f", promedioAlturas));

        scanner.close();
    }
}
