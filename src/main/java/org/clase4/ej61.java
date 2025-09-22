package org.clase4;

// Confeccionar una clase que permita definir dos vectores paralelos, en uno se almacenan los nombres de distintos paises de América del Sur y en otro la cantidad de habitantes.
// Mostrar por pantalla los dos vectores y el nombre del país con mayor población.

public class ej61 {
    private String[] paises = { "Argentina", "Chile", "Uruguay", "Brasil", "Colombia" };
    private int[] habitantes = { 45_000_000, 19_000_000, 3_500_000, 212_000_000, 50_000_000 };

    public void imprimir() {
        for (int x = 0; x < paises.length; x++) {
        System.out.println(paises[x] + " - " + habitantes[x]);
        }
        System.out.println("-------------------------------");
    }

    public void paisMasHabitantes() {
        int pos = 0;
        for (int x = 1; x < habitantes.length; x++) {
            if (habitantes[x] > habitantes[pos]) {
                 pos = x;
            }
        }
        System.out.println("El pais con mayor cantidad de habitantes es:" + paises[pos]);
    }
    public static void main(String[] args) {
        ej61 america = new ej61();
        america.imprimir();
        america.paisMasHabitantes();
    }
}
