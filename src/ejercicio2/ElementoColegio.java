package ejercicio2;

public abstract class ElementoColegio {
	private String nombre;
	private String rol;
	private Chat chat;

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public ElementoColegio(String nombre, String rol) {
		this.nombre = nombre;
		this.rol = rol;
	}

	public abstract void recieveMessage(String message);

	public String getRol() {
		return rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
