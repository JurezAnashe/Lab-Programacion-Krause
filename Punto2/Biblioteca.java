import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<>();
	}

	public void agregarL(Libro l) {
		libros.add(l);
	}

	public void mostrarL() {
		for (Libro ll : libros) {
			System.out.println("titulo: " + ll.titulo);
			System.out.println("isbn: " + ll.isbn);
			System.out.println("cantpag: " + ll.cantpag);
		}
	}

	public void cantidadL() {
		System.out.println("Libros: " + libros.size());
	}
}
