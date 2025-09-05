package org.clase1;

public class Clase07 {
    
    public static void main(String[] args) {
		int valor = 1 + (int)(Math.random()*5);
		System.out.println("El valor numerico generado es: " + valor);
		switch(valor) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		}
	}

}

