package ejercicio3;

public class PaginaFacebook extends Pagina {

	@Override
	public void notifyUsuarios(ElementoPagina elementoPagina) {
		if (elementoPagina.isImg()) {
			for (Usuario usuario : super.getUsuario()) {
				if (usuario.wantImagenes()) {
					usuario.receiveNotificacion(elementoPagina);
				}
			}
		} else {
			for (Usuario usuario : super.getUsuario()) {
				usuario.receiveNotificacion(elementoPagina);
			}
		}

	}

	public void addUsuario(UsuarioFacebook usuarioFacebook) {
		super.getUsuario().add(usuarioFacebook);
	}

	public void sendPublication(ElementoPagina elementoPagina) {
		notifyUsuarios(elementoPagina);
	}

}
