package org.Clase3;

// Plantear una clase TablaMultiplicación que al constructor llegue como parámetro el valor de la tabla de multiplicación que debe generar.
// Definir 2 métodos con el mismo nombre llamado ‘imprimir’.
// primero no debe tener parámetros y tiene por objetivo mostrar 10 términos de la tabla de multiplicación
// y el segundo método ‘imprimir’ tiene un parámetro entero que indica la cantidad de términos que debe mostrar.

public class Ejercicio47 {
    private int tabla;

    public Ejercicio47(int tabla) {
        this.tabla = tabla;
    }

    public void imprimir() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }

    public void imprimir(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }

    public static void main(String[] args) {
        Ejercicio47 tabla5 = new Ejercicio47(5);
        tabla5.imprimir();
        tabla5.imprimir(15);
    }
}
