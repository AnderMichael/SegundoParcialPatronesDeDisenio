package ejercicio3;

public class LaunchFacebook {
	public static void main(String[] args) {
		PaginaFacebook facebook = new PaginaFacebook();
		facebook.addUsuario(new UsuarioFacebook("Andersaurio", false));
		facebook.addUsuario(new UsuarioFacebook("Amy", true));
		facebook.addUsuario(new UsuarioFacebook("Enrique", false));
		facebook.addUsuario(new UsuarioFacebook("Vivs", true));
		facebook.addUsuario(new UsuarioFacebook("Huguito", false));

		facebook.sendPublication(new Imagen("Monalisa", "11/1/2021"));
		facebook.sendPublication(new Imagen("Monalisa 4", "23/2/2021"));
		facebook.sendPublication(new Video("Mi compa el Hugo", "11/1/2021", 20));

	}
}
