package ejercicio3;

public class LaunchFacebook {
	public static void main(String[] args) {
		PaginaFacebook facebook = new PaginaFacebook();
		facebook.addUsuario(new UsuarioFacebook("Andersaurio", false));
		facebook.addUsuario(new UsuarioFacebook("Amy", true));
		facebook.addUsuario(new UsuarioFacebook("Enrique", false));
		facebook.addUsuario(new UsuarioFacebook("Vivs", false));
		facebook.addUsuario(new UsuarioFacebook("Huguito", false));




	}
}
