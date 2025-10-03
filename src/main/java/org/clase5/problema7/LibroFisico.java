package org.clase5.problema7;

public class LibroFisico extends Libro {
    private int stock;
    private int cantidadVendidos;
    
    public LibroFisico(String titulo, String autor, String editorial, int numeroPaginas, int stock) {
        super(titulo, autor, editorial, numeroPaginas);
        this.stock = stock;
        this.cantidadVendidos = 0;
    }
    
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
    public int getCantidadVendidos() { return cantidadVendidos; }
    
    public boolean tieneStock() {
        return stock > 0;
    }
    
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            cantidadVendidos += cantidad;
        }
    }
}