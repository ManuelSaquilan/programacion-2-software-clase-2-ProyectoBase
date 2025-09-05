package org.clase2;

public class Clase22 {
    
    //Escribir un programa que solicite la carga de números por teclado, obtener su promedio. Finalizar la carga de valores cuando se cargue el valor 0.
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int numero, contador = 0;
        double suma = 0.0;
        double promedio = 0.0;

        do {
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = teclado.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            promedio = suma / contador;
            System.out.println("El promedio es: " + String.format("%.2f", promedio));
        } else {
            System.out.println("No se ingresaron números.");
        }

        teclado.close();
    }
}
