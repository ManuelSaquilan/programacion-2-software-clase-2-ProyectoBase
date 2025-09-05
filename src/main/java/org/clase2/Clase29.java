package org.clase2;

public class Clase29 {

    // Confeccionar un programa que permita ingresar un valor del 1 al 10
    // y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
    // Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Ingrese un valor del 1 al 10: ");
        int numero = teclado.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        teclado.close();
    }
}

