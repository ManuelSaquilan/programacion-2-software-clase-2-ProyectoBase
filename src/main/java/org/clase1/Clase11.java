package org.clase1;

public class Clase11 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.print("Ingrese precio:");
		int precio = teclado.nextInt();
		System.out.print("Ingrese la cantidad:");
		int cantidad = teclado.nextInt();
		int total = precio * cantidad;
		System.out.print("El total a aboanr es: " + total);

        teclado.close();
	}

}
