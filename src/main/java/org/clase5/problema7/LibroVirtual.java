package org.clase5.problema7;

public class LibroVirtual extends Libro {
    private int cantidadVentas;
    private String formato;
    
    public LibroVirtual(String titulo, String autor, String editorial, int numeroPaginas, String formato) {
        super(titulo, autor, editorial, numeroPaginas);
        this.formato = formato;
        this.cantidadVentas = 0;
    }
    
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    public int getCantidadVentas() { return cantidadVentas; }
    
    public void vender() {
        cantidadVentas++;
    }
}