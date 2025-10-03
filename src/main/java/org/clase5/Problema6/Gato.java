package org.clase5.Problema6;

public class Gato extends Animal {
    public Gato(String foto, int tamaño, String localizacion) {
        super(foto, tamaño, localizacion);
    }

    public void comer() {
        System.out.println("El gato está comiendo pescado o croquetas");
    }

    public void hacerRuido() {
        System.out.println("El gato está maullando suavemente");
    }

    public void vacunar() {
        System.out.println("El gato está siendo vacunado");
    }
    
}
