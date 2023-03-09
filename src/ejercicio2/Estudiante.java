package ejercicio2;

public class Estudiante extends ElementoColegio {
	private String matricula;

	public Estudiante(String nombre, String matricula) {
		super(nombre, "Estudiante");
		this.matricula = matricula;
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println(String.format("===Bandeja de mensajes - %s - %s===", super.getNombre(), super.getRol()));
		System.out.println(message + "\n");
	}

	public void msgGlobal(String message) {
		super.getChat().notify(this, new Mensaje(message, "Global"));
	}

	public void msgDocentes(String message) {
		super.getChat().notify(this, new Mensaje(message, "Docentes"));
	}

	public void msgAdmins(String message) {
		super.getChat().notify(this, new Mensaje(message, "Administrativos"));
	}
}
