package org.clase5.Problema6;

public class Perro extends Canino {

    public Perro(String foto, int tamaño, String localizacion, String raza) {
        super(foto, tamaño, localizacion, raza);
    }

    public void comer() {
        System.out.println("El perro está comiendo croquetas o huesos");
    }

    public void hacerRuido() {
        System.out.println("El perro está ladrando alegremente");
    }

    public void vacunar() {
        System.out.println("El perro está siendo vacunado");
    }

    public void sacarPasear() {
        System.out.println("El perro está saliendo a pasear");
    }
}
    

