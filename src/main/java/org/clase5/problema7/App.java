package org.clase5.problema7;

public class App {
    public static void main(String[] args) {
        // Crear empresa
        Empresa libreria = new Empresa();
        
        // Crear libros físicos
        LibroFisico libroFisico1 = new LibroFisico("Don Quijote", "Cervantes", "Planeta", 500, 10);
        LibroFisico libroFisico2 = new LibroFisico("Cien años de soledad", "García Márquez", "Sudamericana", 400, 0);
        
        // Crear libros virtuales
        LibroVirtual libroVirtual1 = new LibroVirtual("El Principito", "Saint-Exupéry", "Salamandra", 200, "PDF");
        LibroVirtual libroVirtual2 = new LibroVirtual("1984", "Orwell", "Debolsillo", 350, "EPUB");
        
        // Agregar libros a la empresa
        libreria.agregarLibroFisico(libroFisico1);
        libreria.agregarLibroFisico(libroFisico2);
        libreria.agregarLibroVirtual(libroVirtual1);
        libreria.agregarLibroVirtual(libroVirtual2);
        
        // Simular algunas ventas
        libroFisico1.vender(3);
        libroVirtual1.vender();
        libroVirtual1.vender();
        libroVirtual2.vender();
        
        // Mostrar estadísticas
        System.out.println("Cantidad de libros físicos: " + libreria.cantidadLibrosFisicos());
        System.out.println("Cantidad de libros virtuales: " + libreria.cantidadLibrosVirtuales());
        System.out.println("Total libros físicos vendidos: " + libreria.cantidadTotalLibrosFisicosVendidos());
        System.out.println("Total libros virtuales vendidos: " + libreria.cantidadTotalLibrosVirtualesVendidos());
        System.out.println("Libros físicos sin stock: " + libreria.cantidadLibrosFisicosSinStock());
    }
}