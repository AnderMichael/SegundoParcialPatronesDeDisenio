package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GoogleDrive {
	private List<Documento> versionesDocumento = new ArrayList<>();
	private int index;

	public void addVersionDocumento(Documento documento) {
		versionesDocumento.add(documento);
		index = versionesDocumento.size() - 1;
	}

	public Documento crtlz() {
		System.out.println("CRTL+Z");
		index--;
		if (index >= 0) {
			return versionesDocumento.get(index);
		} else {
			System.out.println("No hay mas cambios se te muestra la primera version!");
			index = 0;
			return versionesDocumento.get(0);

		}
	}

	public Documento crtly() {
		System.out.println("CRTL+Y");
		index++;
		if (index < versionesDocumento.size()) {
			return versionesDocumento.get(index);
		} else {
			System.out.println("No hay mas cambios se te muestra la ultima version!");
			index = versionesDocumento.size() - 1;
			return versionesDocumento.get(versionesDocumento.size() - 1);
		}
	}
}
