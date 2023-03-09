package ejercicio2;

public class Mensaje {
	private String contenido;
	private String destinatario;

	public Mensaje(String contenido, String destinatario) {
		this.contenido = contenido;
		this.destinatario = destinatario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

}
