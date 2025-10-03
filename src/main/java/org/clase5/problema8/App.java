package org.clase5.problema8;

public class App {
    public static void main(String[] args) {
        Punto2D puntoA = new Punto2D(1.0, 2.0);
        Punto3D puntoB = new Punto3D(3.0, 4.0, 5.0);
        System.out.println("Punto A (2D): (" + puntoA.getX() + ", " + puntoA.getY() + ")");
        System.out.println("Punto B (3D): (" + puntoB.getX() + ", " + puntoB.getY() + ", " + puntoB.getZ() + ")");
        
    }
}
