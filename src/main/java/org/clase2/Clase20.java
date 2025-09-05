package org.clase2;

public class Clase20 {
    
    // Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
    // Emplear el operador % en la condición de la estructura condicional:
	// if (valor%2==0)   Si el if da verdadero luego es par

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n, cargados, contadorPares, contadorImpares;
        contadorPares = 0;
        contadorImpares = 0;
        cargados = 0;
        System.out.print("Ingrese la cantidad de números a procesar: ");
        n = scanner.nextInt();

        while (cargados < n) {
            System.out.print("Ingrese el número " + (cargados + 1) + ": ");
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
            cargados++;
        }

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
        scanner.close();
    }
}
