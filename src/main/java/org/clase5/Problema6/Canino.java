package org.clase5.Problema6;

public class Canino extends Animal {

    public Canino(String foto, int tamaño, String localizacion, String raza) {
        super(foto, tamaño, localizacion);
    }

    public void hacerRuido() {
        System.out.println("El canino está ladrando");
    }

    public void caer() {
        System.out.println("El canino se cae y se levanta rápidamente");
    }

}
