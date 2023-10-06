import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List catalogo = new ArrayList<>();

    public void agregarLibro(String titulo, String autor, int stock) {
        Libro libro = new Libro(titulo, autor, stock);
        catalogo.add(libro);
    }

    public void editarLibro(String titulo, String nuevoTitulo, String nuevoAutor) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                return;
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.getStock() > 0) {
                    libro.setStock(libro.getStock() - 1);
                    return;
                }
            }
        }
    }

    public List obtenerCatalogo() {
        return catalogo;
    }
}






