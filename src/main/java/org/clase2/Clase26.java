package org.clase2;

public class Clase26 {

    // Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron múltiplos de 3 y cuántos de 5.
    // Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int mul3 = 0;
        int mul5 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            int number = teclado.nextInt();

            if (number % 3 == 0) {
                mul3++;
            }
            if (number % 5 == 0) {
                mul5++;
            }
        }

        System.out.println("Cantidad de múltiplos de 3: " + mul3);
        System.out.println("Cantidad de múltiplos de 5: " + mul5);

        teclado.close();
    }
}
