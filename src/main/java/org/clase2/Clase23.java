package org.clase2;

public class Clase23 {
    
    //Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
    // Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número (9999 para finalizar): ");
            numero = teclado.nextInt();
            if (numero != 9999) {
                suma += numero;
            }
        } while (numero != 9999);

        System.out.println("La suma acumulada es: " + suma);

        if (suma > 0) {
            System.out.println("El valor es mayor a cero.");
        } else if (suma < 0) {
            System.out.println("El valor es menor a cero.");
        } else {
            System.out.println("El valor es cero.");
        }

        teclado.close();
    }
}
