package org.Clase3;

//Desarrollar una clase que represente un punto en el plano y tenga los métodos para:
// Cargar los valores de x e y.
// Imprimir en que cuadrante se encuentra dicho punto (concepto matemático, primer cuadrante si x e y son positivas, si x<0 e y>0 segundo cuadrante, etc.)
public class Ejercicio33 {
    private static java.util.Scanner teclado = new java.util.Scanner(System.in);
    private double x, y;

    public void cargarCoordenadas() {
        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Ingrese el valor de y: ");
        y = teclado.nextDouble();
    }

    public void mostrarCuadrante() {
        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el cuarto cuadrante.");
        } else if (x == 0 && y != 0) {
            System.out.println("El punto se encuentra sobre el eje Y.");
        } else if (y == 0 && x != 0) {
            System.out.println("El punto se encuentra sobre el eje X.");
        } else {
            System.out.println("El punto se encuentra en el origen.");
        }
    }

    public static void main(String[] args) {
        Ejercicio33 punto = new Ejercicio33();
        punto.cargarCoordenadas();
        punto.mostrarCuadrante();
        teclado.close();
    }

}
