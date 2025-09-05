package org.clase1;

public class Clase09 {
    
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.print("Ingrese la cantidad de horas trabajadas");
		int horas=teclado.nextInt();
		System.out.print("Ingrese el valor de la hora trabajada");
		int valor_hora=teclado.nextInt();
		int sueldo = valor_hora*horas;
		System.out.println("El sueldo es :" + sueldo);

        teclado.close();
	}

}
