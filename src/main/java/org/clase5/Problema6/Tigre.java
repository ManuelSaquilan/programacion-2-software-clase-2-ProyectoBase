package org.clase5.Problema6;

public class Tigre  extends Animal {
    public Tigre(String foto, int tamaño, String localizacion) {
        super(foto, tamaño, localizacion);
    }

    public void comer() {
        System.out.println("El tigre está cazando sigilosamente");
    }

    public void hacerRuido() {
        System.out.println("El tigre está rugiendo territorialmente");
    }
    
}
