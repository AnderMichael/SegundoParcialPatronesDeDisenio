package ejercicio4;

public class Libro {
	private String titulo;
	private String id;
	private String categoria;

	public Libro(String nombre, String id, String categoria) {
		this.titulo = nombre;
		this.id = id;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void showInfo() {
		System.out.println("=====Libro=====");
		System.out.println(String.format("Titulo: %s", titulo));
		System.out.println(String.format("ID: %s", id));
		System.out.println(String.format("Categoria: %s", categoria));

	}
}
