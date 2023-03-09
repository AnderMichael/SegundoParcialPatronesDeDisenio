package ejercicio2;

public class Administrativo extends ElementoColegio {
	private String cargo;

	public Administrativo(String nombre, String cargo) {
		super(nombre, "Administrativo");
		this.cargo = cargo;
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println(String.format("===Bandeja de mensajes - %s - %s===", super.getNombre(), super.getRol()));
		System.out.println(message + "\n");
	}

	public void msgGlobal(String message) {
		super.getChat().notify(this, new Mensaje(message, "Global"));
	}

	public void msgEstudiantes(String message) {
		super.getChat().notify(this, new Mensaje(message, "Estudiantes"));
	}

	public void msgDocentes(String message) {
		super.getChat().notify(this, new Mensaje(message, "Docentes"));
	}

	public void msgAdmins(String message) {
		super.getChat().notify(this, new Mensaje(message, "Administrativos"));
	}
}
