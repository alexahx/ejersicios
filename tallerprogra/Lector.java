import java.util.List;

public class Lector<Libro> {
    public void pedirLibro(Biblioteca biblioteca, String titulo) {
        List<Libro> catalogo = biblioteca.obtenerCatalogo();
        for (Libro libro : catalogo) {
            if (((Object) libro).getTitulo().equals(titulo)) {
                System.out.println("Libro prestado: " + libro.getTitulo());
                return;
            }
        }
        System.out.println("Libro no encontrado en la biblioteca.");
    }

    public void verCatalogo(Biblioteca biblioteca) {
        List<Libro> catalogo = biblioteca.obtenerCatalogo();
        System.out.println("Catálogo de libros:");
        for (Libro libro : catalogo) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Stock disponible: " + libro.getStock());
            System.out.println("-------------");
        }
    }
}
}
