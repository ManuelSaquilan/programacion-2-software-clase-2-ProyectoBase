package org.clase2;

public class Clase21 {
    
    //Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de cuántos dígitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un número entre 0 y 999 (0 para salir): ");
            valor = scanner.nextInt();
            if (valor < 1000) {
                if (valor == 0) {
                    System.out.println("Ha salido del programa.");
                } else if (valor < 10) {
                    System.out.println("El número tiene 1 dígito.");
                } else if (valor < 100) {
                    System.out.println("El número tiene 2 dígitos.");
                } else {
                    System.out.println("El número tiene 3 dígitos.");
                }
            } else if (valor != 0) {
                System.out.println("Número fuera de rango. Intente nuevamente.");
            }
        } while (valor != 0);
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
