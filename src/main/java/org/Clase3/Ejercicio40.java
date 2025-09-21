package org.Clase3;

// Plantear una clase TablaMultiplicación que al constructor llegue como parámetro el valor de la tabla de multiplicación que debe generar.
// En un segundo método llamado imprimir proceder a mostrar la tabla de multiplicación indicada en el constructor.

public class Ejercicio40 {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    private int tabla;

    public Ejercicio40() {
        System.out.print("Ingrese el valor de la tabla de multiplicación que desea generar: ");
        tabla = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("Tabla de multiplicación del " + tabla + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
    public static void main(String[] args) {
        Ejercicio40 tablaMultiplicacion = new Ejercicio40();
        tablaMultiplicacion.imprimir();
    }
    
}
