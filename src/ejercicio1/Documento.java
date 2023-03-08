package ejercicio1;

public class Documento {
	private String nombre;
	private String contenido;

	public Documento(String nombre) {
		this.nombre = nombre;
		contenido = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void addContenido(String addition) {
		contenido = contenido + addition + "\n";
	}

	public void showInfo() {
		System.out.println("¨*****Documento*****");
		System.out.println(String.format("Nombre Doc: %s", nombre));
		System.out.println(String.format("Contenido:\n%s", contenido));
		System.out.println("********************");
	}

	@Override
	public Documento clone() {
		Documento docClon = new Documento(nombre);
		docClon.setContenido(contenido);
		return docClon;
	}

}
