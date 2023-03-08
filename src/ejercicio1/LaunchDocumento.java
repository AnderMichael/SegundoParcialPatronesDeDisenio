package ejercicio1;

public class LaunchDocumento {
	public static void main(String[] args) {
		Documento documento = new Documento("Ander y los Andersaurios");
		documento.addContenido("1. Titulo");

		GoogleDocs docs = new GoogleDocs();
		GoogleDrive drive = new GoogleDrive();

		docs.setLastVersionDoc(documento);
		drive.addVersionDocumento(docs.getLastVersionDoc());

		documento.addContenido("2. Introduccion");
		docs.setLastVersionDoc(documento);
		drive.addVersionDocumento(docs.getLastVersionDoc());

		documento.addContenido("3. Desarrollo");
		docs.setLastVersionDoc(documento);
		drive.addVersionDocumento(docs.getLastVersionDoc());

		documento.addContenido("4. Conclusion");
		docs.setLastVersionDoc(documento);
		drive.addVersionDocumento(docs.getLastVersionDoc());

		for (int i = 0; i < 4; i++)
			docs.setLastVersionDoc(drive.crtlz());

		docs.getLastVersionDoc().showInfo();

		for (int i = 0; i < 4; i++)
			docs.setLastVersionDoc(drive.crtly());

		docs.getLastVersionDoc().showInfo();
	}
}
