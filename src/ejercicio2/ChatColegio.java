package ejercicio2;

import java.util.List;

public class ChatColegio implements Chat {
	private List<ElementoColegio> global;
	private List<ElementoColegio> docentes;
	private List<ElementoColegio> estudiantes;
	private List<ElementoColegio> administrativos;

	@Override
	public void notify(ElementoColegio emisor, Mensaje message) {
		if (message.getDestinatario().equals("Docentes")) {
			for (ElementoColegio docente : docentes) {
				docente.recieveMessage(message.getContenido());
			}
		} else if (message.getDestinatario().equals("Estudiantes")) {
			for (ElementoColegio estudiante : estudiantes) {
				estudiante.recieveMessage(message.getContenido());
			}
		} else if (message.getDestinatario().equals("Administrativos")) {
			for (ElementoColegio admin : administrativos) {
				admin.recieveMessage(message.getContenido());
			}
		} else {
			for (ElementoColegio globaly : global) {
				globaly.recieveMessage(message.getContenido());
			}
		}

	}

	public void addPersonal(ElementoColegio elementoColegio) {
		if (elementoColegio.getRol().equals("Estudiante")) {
			estudiantes.add(elementoColegio);
		} else if (elementoColegio.getRol().equals("Docente")) {
			docentes.add(elementoColegio);
		} else {
			administrativos.add(elementoColegio);
		}
		global.add(elementoColegio);
	}

}
