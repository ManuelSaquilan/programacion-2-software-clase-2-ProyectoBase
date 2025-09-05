package org.clase2;

import java.util.Locale;

public class Clase16 {

    //Desarrollar un programa que permita la carga de 5 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useLocale(Locale.US); // Usar punto como separador decimal
        double suma = 0; // Cambie a double para poder ingresar valores decimales
        int i = 1;
        while (i <= 5) {
            System.out.print("Ingrese el valor " + i + ": ");
            double valor = scanner.nextDouble(); // Cambie a double para poder ingresar valores decimales
            suma += valor;
            i++;
        }
        double promedio = suma / 5.0;
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);
        scanner.close();
    }
}
