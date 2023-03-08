package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BDLibros {
	private List<Libro> libros = new ArrayList<>();
	private SortLibrosStrategy librosStrategy;

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public SortLibrosStrategy getLibrosStrategy() {
		return librosStrategy;
	}

	public void setLibrosStrategy(SortLibrosStrategy librosStrategy) {
		this.librosStrategy = librosStrategy;
	}

	public void addLibro(Libro libro) {
		libros.add(libro);
	}

	public void sortStrategy() {
		librosStrategy.sortLibros(libros);
	}
}
