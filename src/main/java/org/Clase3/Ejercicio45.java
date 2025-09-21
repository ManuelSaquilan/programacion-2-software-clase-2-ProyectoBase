package org.Clase3;

// Plantear una clase llamada “Naipe”, definir como atributo el número y el tipo de naipe (oros, copas, espadas y bastos)
// El tipo de naipe debe ser String y el número de la carta int.
// Al constructor llegan como dato el tipo y el número. Crear un segundo método que imprimir tanto el tipo como su número.
// En el main() crear 3 objetos de la clase Naipe y llamar al imprimir, el código a implementar debe ser similar a:
// Naipe 
// +tipo
// +numero
//
// +Naipe()
// +imprimir()
// main()

public class Ejercicio45 {
    private String tipo;
    private int numero;

    public Ejercicio45(String ti, int nu) {
        tipo = ti;
        numero = nu;
    }
    public void imprimir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Número: " + numero);
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Ejercicio45 naipe1 = new Ejercicio45("Oros", 5);
        Ejercicio45 naipe2 = new Ejercicio45("Copas", 10);
        Ejercicio45 naipe3 = new Ejercicio45("Espadas", 1);

        naipe1.imprimir();
        naipe2.imprimir();
        naipe3.imprimir();
    }
}
