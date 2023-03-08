package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pagina {
	private List<Usuario> usuario = new ArrayList<>();

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public abstract void notifyUsuarios(ElementoPagina elementoPagina);
}
