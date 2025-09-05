package org.clase1;

public class Clase10 {
    
    public static void main(String[] args) {
		java.util.Scanner teclado=new java.util.Scanner(System.in);
		System.out.println("Ingrese el lado del cuadrado");
		int lado = teclado.nextInt();
		int perimetro = lado * 4;
		System.out.println("El perimetro del cuadrado es :" + perimetro);

		teclado.close();
	}

}