package org.clase5.problema2;

public class JuegoDeDados {
    private Dado dado1, dado2, dado3;

    public JuegoDeDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
    }

    public void jugar() {
        dado1.tirar();
        dado1.imprimirValor();
        dado2.tirar();
        dado2.imprimirValor();
        dado3.tirar();
        dado3.imprimirValor();
        if (dado1.retornarValor() == dado2.retornarValor() && dado2.retornarValor() == dado3.retornarValor()) {
            System.out.println("¡Ganaste! Los tres dados tienen el mismo valor.");
        } else {
            System.out.println("No ganaste. Los valores de los dados son diferentes.");
        }
    }

    public static void main(String[] args) {
        JuegoDeDados juego = new JuegoDeDados();
        juego.jugar();
    }
}