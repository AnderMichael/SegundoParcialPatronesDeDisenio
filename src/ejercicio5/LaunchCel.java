package ejercicio5;

public class LaunchCel {
	public static void main(String[] args) {
		Celular celular = new Celular();
		
		celular.setEstadoActual(new CelApagado());
		
		celular.setEstadoActual(new CelEncendido());

		celular.setEstadoActual(new CelReiniciando());
	}
}
