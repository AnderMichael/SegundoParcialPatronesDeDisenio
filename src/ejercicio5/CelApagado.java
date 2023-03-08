package ejercicio5;

public class CelApagado implements StateCel {

	@Override
	public void changeStateCel(Celular celular) {
		celular.getProgramas().clear();
		celular.setCpuConsume(1);
		celular.setMemoryRamConsume(1);
		celular.showInfo();
	}

}
