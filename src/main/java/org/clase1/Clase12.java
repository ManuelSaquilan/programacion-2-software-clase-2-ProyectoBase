package org.clase1;


public class Clase12 {
    
    public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Ingrese la 1° nota: ");
		int nota1 = teclado.nextInt();
		System.out.println("Ingrese la 2° nota: ");
		int nota2 = teclado.nextInt();
		System.out.println("Ingrese la 3° nota: ");
		int nota3 = teclado.nextInt();
		float promedio = (nota1 + nota2 + nota3)/3.0f;
		System.out.println("El promedio es: "+ promedio);

        teclado.close();
	}

}

