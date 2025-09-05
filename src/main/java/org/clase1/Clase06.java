package org.clase1;

public class Clase06 {
    
    public static void main(String[] args) {
		int numero1 = (int)(Math.random()*10);
		int numero2 = (int)(Math.random()*10);
		int numero3 = (int)(Math.random()*10);
		int minimo = 0;
		if (numero1 < numero2) {
			if (numero1 < numero3) {
				minimo = numero1;
			}
			else {
				minimo = numero3;
			}
		} else {
			minimo = numero2;
			}
		System.out.println("Numero 1: "+numero1);
		System.out.println("Numero 2: "+numero2);
		System.out.println("Numero 3: "+numero3);
		System.out.println("El menor es ;"+minimo);
	}

}
