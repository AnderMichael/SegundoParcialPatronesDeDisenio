package ejercicio4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByCategoria implements SortLibrosStrategy {

	@Override
	public void sortLibros(List<Libro> libros) {
		Comparator<Libro> categoryComp = Comparator.comparing(Libro::getCategoria);
		Collections.sort(libros, categoryComp);
		for (Libro libro : libros) {
			libro.showInfo();
		}
	}

}
