package org.clase2;

public class Clase30 {

    // Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
    // Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto
    // cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Ingrese la cantidad de puntos a procesar: ");
        int cantidadPuntos = teclado.nextInt();

        int puntosPrimerCuadrante = 0;
        int puntosSegundoCuadrante = 0;
        int puntosTercerCuadrante = 0;
        int puntosCuartoCuadrante = 0;

        for (int i = 1; i <= cantidadPuntos; i++) {
            System.out.print("Ingrese las coordenadas del punto " + i + " (x): ");
            int x = teclado.nextInt();
            System.out.print("Ingrese las coordenadas del punto " + i + " (y): ");
            int y = teclado.nextInt();

            if (x > 0 && y > 0) {
                puntosPrimerCuadrante++;
            } else if (x < 0 && y > 0) {
                puntosSegundoCuadrante++;
            } else if (x < 0 && y < 0) {
                puntosTercerCuadrante++;
            } else if (x > 0 && y < 0) {
                puntosCuartoCuadrante++;
            }
        }

        System.out.println("Puntos en el primer cuadrante: " + puntosPrimerCuadrante);
        System.out.println("Puntos en el segundo cuadrante: " + puntosSegundoCuadrante);
        System.out.println("Puntos en el tercer cuadrante: " + puntosTercerCuadrante);
        System.out.println("Puntos en el cuarto cuadrante: " + puntosCuartoCuadrante);

        teclado.close();
    }
}
