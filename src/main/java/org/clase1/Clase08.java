package org.clase1;

public class Clase08 {

    public static void main(String[] args) {
		int valor = 1 + (int)(Math.random()*10);
		System.out.println("El numero generado es: " + valor);
		switch (valor) {
		case 5:
			System.out.println("Gano un auto");
			break;
		
		case 7:
			System.out.println("Gano un heladera");
			break;
		case 9:
			System.out.println("Gano un televisor");
			break;
		default:
			System.out.println("No gano");

		}
	}

}

