package org.clase2;

public class Clase28 {
    
    //Desarrollar un programa que muestre la tabla de multiplicar del 3 (del 3 al 30)

    public static void main(String[] args) {
        int numero = 3;
        
        System.out.println("Tabla de multiplicar del 3:");
        for (int i = 1; i <= 30; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
