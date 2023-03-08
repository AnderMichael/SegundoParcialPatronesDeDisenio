package ejercicio3;

public class Imagen implements ElementoPagina {
	private String nombre;
	private String fecha;

	public Imagen(String nombre, String fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}

	@Override
	public void showInfo() {
		System.out.println("===Imagen===");
		System.out.println(String.format("NombrePost: %s", nombre));
		System.out.println(String.format("Fecha: %s", fecha));
	}

	@Override
	public boolean isImg() {
		return true;
	}

}
