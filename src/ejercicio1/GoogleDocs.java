package ejercicio1;

public class GoogleDocs {
	private Documento lastVersionDoc;

	public Documento getLastVersionDoc() {
		return lastVersionDoc;
	}

	public void setLastVersionDoc(Documento lastVersionDoc) {
		this.lastVersionDoc = lastVersionDoc.clone();
	}

}
