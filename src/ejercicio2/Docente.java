package ejercicio2;

public class Docente extends ElementoColegio {
	private String ci;

	public Docente(String nombre, String ci) {
		super(nombre, "Estudiante");
		this.ci = ci;
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println(String.format("===Bandeja de mensajes - %s - %s===", super.getNombre(), super.getRol()));
		System.out.println(message + "\n");
	}

	public void msgEstudiantes(String message) {
		super.getChat().notify(this, new Mensaje(message, "Estudiantes"));
	}

	public void msgDocentes(String message) {
		super.getChat().notify(this, new Mensaje(message, "Docentes"));
	}
}
