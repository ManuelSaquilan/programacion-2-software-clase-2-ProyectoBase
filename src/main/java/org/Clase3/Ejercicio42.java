package org.Clase3;

// Declarar una clase llamada Cuadrado. Considerar que:
// Al constructor debe llegar la medida del lado (no se ingresa por teclado)
// Se necesita definir un método que retorne un String indicando que el cuadrado es “grande” si la superficie es mayor a 100 en caso contrario retornar un String indicando que es “chico”.
// Mostrar en la main el valor retornardo.

public class Ejercicio42 {
    private double lado;

    public Ejercicio42(double la) {
        lado = la;
    }

    public String evaluarTamano() {
        double superficie = lado * lado;
        if (superficie > 100) {
            return "El cuadrado es grande.";
        } else {
            return "El cuadrado es chico.";
        }
    }

    public static void main(String[] args) {
        Ejercicio42 cuadrado = new Ejercicio42(42);
        System.out.println(cuadrado.evaluarTamano());
    }
}
