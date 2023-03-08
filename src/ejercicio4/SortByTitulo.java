package ejercicio4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByTitulo implements SortLibrosStrategy {

	@Override
	public void sortLibros(List<Libro> libros) {
		Comparator<Libro> tituloComp = Comparator.comparing(Libro::getTitulo);
		Collections.sort(libros, tituloComp);
		for (Libro libro : libros) {
			libro.showInfo();
		}
	}

}
