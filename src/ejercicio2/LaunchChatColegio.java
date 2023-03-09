package ejercicio2;

public class LaunchChatColegio {
	public static void main(String[] args) {
		ChatColegio colegio = new ChatColegio();

		colegio.addPersonal(new Docente("Eynar", "4748"));
		colegio.addPersonal(new Estudiante("Hugo", "4738"));
		colegio.addPersonal(new Administrativo("Julio", "DAAE"));

		
		//Inge pruebe mi codigo porfa
	}
}
