package org.clase1;

public class Clase13 {
    
    public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("ingrese un número");
		int numero = teclado.nextInt();
		if (numero == 0) {
		    System.out.println("ingreso cero");
		} else if (numero > 0) {
		    System.out.println("ingreso un número positivo");
		} else {
		    System.out.println("ingreso un número negativo");
		}

        teclado.close();
	}
}