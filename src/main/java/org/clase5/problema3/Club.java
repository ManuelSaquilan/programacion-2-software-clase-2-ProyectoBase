package org.clase5.problema3;
// Plantear una clase Club y otra clase Socio.
// La clase Socio debe tener los siguientes atributos privados:
// nombre y la antigüedad en el club (en años).
// En el constructor pedir la carga del nombre y su antigüedad.
// La clase Club debe tener como atributos 3 objetos de la clase Socio.
// Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.

public class Club {
    private Socio socio1, socio2, socio3;
    

    public Club() {
        socio1 = new Socio();
        socio2 = new Socio();
        socio3 = new Socio();
    }

        public void cargarSocios() {
        socio1.nombre();
        socio1.antiguedad();
        socio2.nombre();
        socio2.antiguedad();
        socio3.nombre();
        socio3.antiguedad();
    }

    public void imprimirSocioConMayorAntiguedad() {
        Socio mayorAntiguedad = socio1;

        if (socio2.antiguedad() > mayorAntiguedad.antiguedad()) {
            mayorAntiguedad = socio2;
        }
        if (socio3.antiguedad() > mayorAntiguedad.antiguedad()) {
            mayorAntiguedad = socio3;
        }

        System.out.println("El socio con mayor antigüedad es: " + mayorAntiguedad.nombre() +
                          " (" + mayorAntiguedad.antiguedad() + " años)");
    }
    
    public static void main(String[] args) {
        Club club = new Club();
        club.imprimirSocioConMayorAntiguedad();
    }
}
