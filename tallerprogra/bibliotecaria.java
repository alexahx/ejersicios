import java.util.List;

public class bibliotecaria {
    public void ingresarLibro(Biblioteca biblioteca, String titulo, String autor, int stock) {
        biblioteca.agregarLibro(titulo, autor, stock);
    }

    public void editarLibro(Biblioteca biblioteca, String titulo, String nuevoTitulo, String nuevoAutor) {
        biblioteca.editarLibro(titulo, nuevoTitulo, nuevoAutor);
    }

    public void prestarLibro(Biblioteca biblioteca, String titulo) {
        biblioteca.prestarLibro(titulo);
    }
}

