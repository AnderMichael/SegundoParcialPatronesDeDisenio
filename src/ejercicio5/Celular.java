package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Celular {
	private List<String> programas = new ArrayList<>();
	private double memoryRamConsume = 0;
	private double cpuConsume = 0;
	private StateCel estadoActual;

	public List<String> getProgramas() {
		return programas;
	}

	public void setProgramas(List<String> programas) {
		this.programas = programas;
	}

	public double getMemoryRamConsume() {
		return memoryRamConsume;
	}

	public void setMemoryRamConsume(double memoryRamConsume) {
		this.memoryRamConsume = memoryRamConsume;
	}

	public double getCpuConsume() {
		return cpuConsume;
	}

	public void setCpuConsume(double cpuConsume) {
		this.cpuConsume = cpuConsume;
	}

	public StateCel getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(StateCel estadoActual) {
		this.estadoActual = estadoActual;
		this.estadoActual.changeStateCel(this);
	}

	public void openProgram(String program) {
		programas.add(program);
	}

	public void showInfo() {
		System.out.println("===Celular===");
		System.out.println(String.format("Ram consume: %.2f", memoryRamConsume));
		System.out.println(String.format("CPU consume: %.2f", cpuConsume));
		System.out.println("Programas abiertos:");
		for (String program : programas) {
			System.out.println("- " + program);
		}
		System.out.println("============");
	}

}
