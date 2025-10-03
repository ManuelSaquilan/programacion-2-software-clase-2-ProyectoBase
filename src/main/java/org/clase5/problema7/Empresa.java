package org.clase5.problema7;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<LibroFisico> librosFisicos;
    private List<LibroVirtual> librosVirtuales;
    
    public Empresa() {
        this.librosFisicos = new ArrayList<>();
        this.librosVirtuales = new ArrayList<>();
    }
    
    public void agregarLibroFisico(LibroFisico libro) {
        librosFisicos.add(libro);
    }
    
    public void agregarLibroVirtual(LibroVirtual libro) {
        librosVirtuales.add(libro);
    }
    
    // Cantidad de libros físicos que tiene la empresa
    public int cantidadLibrosFisicos() {
        return librosFisicos.size();
    }
    
    // Cantidad de libros virtuales que tiene la empresa
    public int cantidadLibrosVirtuales() {
        return librosVirtuales.size();
    }
    
    // Cantidad total de libros físicos vendidos
    public int cantidadTotalLibrosFisicosVendidos() {
        int total = 0;
        for (LibroFisico libro : librosFisicos) {
            total += libro.getCantidadVendidos();
        }
        return total;
    }
    
    // Cantidad total de libros virtuales vendidos
    public int cantidadTotalLibrosVirtualesVendidos() {
        int total = 0;
        for (LibroVirtual libro : librosVirtuales) {
            total += libro.getCantidadVentas();
        }
        return total;
    }
    
    // Cantidad de libros físicos sin stock
    public int cantidadLibrosFisicosSinStock() {
        int count = 0;
        for (LibroFisico libro : librosFisicos) {
            if (!libro.tieneStock()) {
                count++;
            }
        }
        return count;
    }
}