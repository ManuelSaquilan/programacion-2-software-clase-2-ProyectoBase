package org.clase5.Problema6;

public class Animal {
    private String foto;
    private int tamaño;
    private String localizacion;

    public Animal(String foto, int tamaño, String localizacion) {
        this.foto = foto;
        this.tamaño = tamaño;
        this.localizacion = localizacion;
    }

    public String getFoto() {
        return foto;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public void hacerRuido() {
        System.out.println("El animal está haciendo ruido.");
    }

    public void caer() {
        System.out.println("El animal está cayendo.");
    }
}
