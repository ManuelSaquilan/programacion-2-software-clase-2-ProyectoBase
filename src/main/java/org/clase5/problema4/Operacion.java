package org.clase5.problema4;

import java.util.Scanner;

public class Operacion {
    protected Scanner teclado;
    protected int num1;
    protected int num2;
    protected int resultado;

    public Operacion() {
        teclado = new Scanner(System.in);
    }

    public void cargar1() {
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();
    }

    public void cargar2() {
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + resultado);
    }

}
