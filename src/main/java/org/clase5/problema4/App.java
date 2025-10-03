package org.clase5.problema4;

public class App {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        
        System.out.println("Operación de Suma:");
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        suma1.mostrarResultado();

        Resta resta1 = new Resta();
        System.out.println("\nOperación de Resta:");
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        resta1.mostrarResultado();
    }
}
