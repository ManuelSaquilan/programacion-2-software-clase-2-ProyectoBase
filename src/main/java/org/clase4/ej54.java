package org.clase4;

// Se desea guardar los sueldos de 5 operarios.
// Según lo conocido deberíamos definir 5 variables de tipo float, 
// si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.

public class ej54 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int[] sueldos;

    public ej54() {
        teclado = new java.util.Scanner(System.in);
        sueldos = new int[5];
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo del operario " + (i + 1) + ": ");
            sueldos[i] = teclado.nextInt();
        }
    }

    public void imprimirSueldos() {
        System.out.println("Los sueldos ingresados son:");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Operario " + (i + 1) + ": " + sueldos[i]);
        }
    };

    public static void main(String[] args) {
        ej54 programa = new ej54();
        programa.imprimirSueldos();
    }

}
