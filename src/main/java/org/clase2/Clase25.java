package org.clase2;

public class Clase25 {

    // Desarrollar un programa que permita la carga de 10 valores por teclado y 
    // nos muestre posteriormente la suma de los valores ingresados y su promedio.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);{
        int suma = 0, i, valor;
        double promedio;
        for (i = 1; i <= 10; i++) {
            System.out.print("Ingrese el " + i + "° valor: ");
            valor = teclado.nextInt();
            suma += valor;
        }
        promedio = suma / 10.0;
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("El promedio de los valores ingresados es: " + promedio);

        teclado.close();
    }

    }
}
