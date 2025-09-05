package org.clase2;

public class Clase27 {

    // Desarrollar un programa que solicite la carga de 10 números e 
    // imprima la suma de los últimos 5 valores ingresados

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int sumaUltimosCinco = 0;
        int numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = teclado.nextInt();

            if (i > 5) { // Solo sumamos los últimos 5 números
                sumaUltimosCinco += numero;
            }
        }

        System.out.println("La suma de los últimos 5 números ingresados es: " + sumaUltimosCinco);
        teclado.close();
    }
}
