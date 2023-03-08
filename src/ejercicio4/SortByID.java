package ejercicio4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByID implements SortLibrosStrategy {

	@Override
	public void sortLibros(List<Libro> libros) {
		Comparator<Libro> idComp = Comparator.comparing(Libro::getId);
		Collections.sort(libros, idComp);
		for (Libro libro : libros) {
			libro.showInfo();
		}
	}

}
