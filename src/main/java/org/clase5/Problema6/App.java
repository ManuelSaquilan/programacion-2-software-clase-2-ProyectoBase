package org.clase5.Problema6;

public class App {
    public static void main(String[] args) {
        Leon leon = new Leon("leon.jpg", 200, "África");
        Perro perro = new Perro("perro.jpg", 30, "Casa", "Golden Retriever");
        Gato gato = new Gato("gato.jpg", 5, "Departamento");
        Tigre tigre = new Tigre("tigre.jpg", 180, "Asia");

        System.out.println("=== LEÓN ===");
        leon.comer();
        leon.hacerRuido();
        leon.dormir();
        leon.caer();

        System.out.println("\n=== PERRO ===");
        perro.comer();
        perro.hacerRuido();
        perro.vacunar();
        perro.sacarPasear();

        System.out.println("\n=== GATO ===");
        gato.comer();
        gato.hacerRuido();
        gato.vacunar();
        gato.caer();

        System.out.println("\n=== TIGRE ===");
        tigre.comer();
        tigre.hacerRuido();
        tigre.dormir();
    }
}
