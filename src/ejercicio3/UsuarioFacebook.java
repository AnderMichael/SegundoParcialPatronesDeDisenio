package ejercicio3;

public class UsuarioFacebook implements Usuario {
	private String nombre;
	private boolean imagenes;

	public UsuarioFacebook(String nombre, boolean imagenes) {
		this.nombre = nombre;
		this.imagenes = imagenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean wantImagenes() {
		return imagenes;
	}

	public void setImagenes(boolean imagenes) {
		this.imagenes = imagenes;
	}

	@Override
	public void receiveNotificacion(ElementoPagina elementoPagina) {
		System.out.println(String.format("===Bandeja de mensajes de %s===", nombre));
		elementoPagina.showInfo();
	}

}
