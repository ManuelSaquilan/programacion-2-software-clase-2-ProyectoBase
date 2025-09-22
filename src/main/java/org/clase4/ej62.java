package org.clase4;

// Crear una clase que administre un Array con los nombres de los meses del año y otro paralelo con la cantidad de días del mismo.
// Mostrar todos los meses que tienen 31 días.

public class ej62 {
    private String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    private int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public void imprimir() {
        for (int x = 0; x < meses.length; x++) {
            System.out.println(meses[x] + " - " + dias[x]);
        }
        System.out.println("-------------------------------");
    }

    public void mesesCon31Dias() {
        System.out.println("Los meses con 31 dias son:");
        for (int x = 0; x < dias.length; x++) {
            if (dias[x] == 31) {
                System.out.println(meses[x]);
            }
        }
    }

    public static void main(String[] args) {
        ej62 anio = new ej62();
        anio.imprimir();
        anio.mesesCon31Dias();
    }  
}
