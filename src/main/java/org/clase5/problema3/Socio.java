package org.clase5.problema3;

import java.util.Scanner;

public class Socio {
    private Scanner teclado = new Scanner(System.in);
    private String nombre;
    private int antiguedad;

    public Socio() {
        System.out.print("Ingrese el nombre del socio: ");
        this.nombre = teclado.nextLine();
        System.out.print("Ingrese la antigüedad del socio (en años): ");
        this.antiguedad = teclado.nextInt();System.out.println("El socio " + nombre + " tiene " + antiguedad + " años de antigüedad en el club.");
    }

    public String nombre() {
        return nombre;
    }

    public int antiguedad() {
        return antiguedad;
    }

}
