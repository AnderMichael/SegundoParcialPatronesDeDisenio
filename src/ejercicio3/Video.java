package ejercicio3;

public class Video implements ElementoPagina {

	private String nombre;
	private String fecha;
	private int duracionMin;

	public Video(String nombre, String fecha, int duracionMin) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracionMin = duracionMin;
	}

	@Override
	public void showInfo() {
		System.out.println("===Video===");
		System.out.println(String.format("NombrePost: %s", nombre));
		System.out.println(String.format("Fecha: %s", fecha));
		System.out.println(String.format("Duracion: %d min", duracionMin));
	}

	@Override
	public boolean isImg() {
		return false;
	}

}
