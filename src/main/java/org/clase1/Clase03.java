package org.clase1;

public class Clase03 {

	public static void main(String[] args) {
		int valor1=(int)(Math.random()*10);
		int valor2=(int)(Math.random()*10);
		System.out.println("El primer valor aleatorio es "+valor1);
		System.out.println("El primer valor aleatorio es "+valor2);
		if (valor1==valor2) {
			System.out.println("Los valores son iguales");
		} else {
			if (valor1>valor2) {
				System.out.println("El mayor es "+valor1);
			} else {
				System.out.println("El mayor es "+valor2);
			}
		}
	}
}