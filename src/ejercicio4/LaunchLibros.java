package ejercicio4;

public class LaunchLibros {

	public static void main(String[] args) {
		BDLibros bdLibros = new BDLibros();

		bdLibros.addLibro(new Libro("Harry Potter", "F-126", "Fantasia"));
		bdLibros.addLibro(new Libro("El Hobbit", "F-125", "Fantasia"));
		bdLibros.addLibro(new Libro("IT", "T-15", "Terror"));
		bdLibros.addLibro(new Libro("Peter Jackson", "A-15", "Aventura"));

		bdLibros.setLibrosStrategy(new SortByTitulo());
		System.out.println("Sort by Titulo");
		bdLibros.sortStrategy();

		bdLibros.setLibrosStrategy(new SortByID());
		System.out.println("\nSort by ID");
		bdLibros.sortStrategy();

		bdLibros.setLibrosStrategy(new SortByCategoria());
		System.out.println("\nSort by Categoria");
		bdLibros.sortStrategy();

	}

}
