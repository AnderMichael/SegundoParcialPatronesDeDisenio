package ejercicio4;

public class LaunchLibros {

	public static void main(String[] args) {
		BDLibros bdLibros = new BDLibros();
		
		bdLibros.addLibro(new Libro("Harry Potter","F-124", "Fantasia"));
		bdLibros.addLibro(new Libro("El Hobbit","F-125", "Fantasia"));
		bdLibros.addLibro(new Libro("IT","A-15", "Terror"));

	}

}
