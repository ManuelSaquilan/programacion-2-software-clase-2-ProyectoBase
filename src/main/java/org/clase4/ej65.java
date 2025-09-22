package org.clase4;

// Crear un Array bidimensional de 8 filas por 8 columnas que represente un tablero de ajedrez. Proceder a definir y crear inmediatamente el Arreglo bidimensional indicando donde se encuentran cada pieza .
// Imprimir el tablero.
// Definir un método público que permita mover una pieza de una celda cualquiera a otra celda.

public class ej65 {
    
    private String[][] tablero = { { "TN", "CN", "AN", "DN", "RN", "AN", "CN", "TN" },
        { "PN", "PN", "PN", "PN", "PN", "PN", "PN", "PN" },
        { " ", " ", " ", " ", " ", " ", " ", " " },
        { " ", " ", " ", " ", " ", " ", " ", " " },
        { " ", " ", " ", " ", " ", " ", " ", " " },
        { " ", " ", " ", " ", " ", " ", " ", " " },
        { "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB" },
        { "TB", "CB", "AB", "DB", "RB", "AB", "CB", "TB" }
    };

    public void imprimir() {
        for (int f = 0; f < tablero.length; f++) {
            for (int c = 0; c < tablero[f].length; c++) {
                System.out.print(tablero[f][c]+" ");
            }
            System.out.println();
        }
        System.out.println("*******************************************************");
    }

    public void mover(int fila,int columna,int filanueva,int columnanueva) {
        tablero[filanueva][columnanueva]=tablero[fila][columna];
        tablero[fila][columna]=" ";
        imprimir();
    }
    public static void main(String[] args) { ej65 tablero=new ej65();
        tablero.imprimir();
        tablero.mover(1, 0, 3, 0);
        tablero.mover(6, 7, 4, 7);
    }
}
