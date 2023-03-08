package ejercicio5;

public class CelReiniciando implements StateCel {

	@Override
	public void changeStateCel(Celular celular) {
		for (String programa : celular.getProgramas()) {
			System.out.println(String.format("Cerrando programa: %s", programa));
		}
		celular.getProgramas().clear();
		celular.setCpuConsume(0);
		celular.setMemoryRamConsume(0);
		celular.showInfo();
	}

}
