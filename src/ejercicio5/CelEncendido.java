package ejercicio5;

import java.util.Random;

public class CelEncendido implements StateCel {

	@Override
	public void changeStateCel(Celular celular) {
		String programasCel[] = { "CandyCrush", "Spotify", "ClashRoyale", "ClickUp", "Snapseed", "Weather", "Maps",
				"Pokedex", "Youtube", "Music" };
		Random random = new Random();
		int randomProgram = random.nextInt(9) + 1;
		for (int i = 0; i < randomProgram; i++) {
			System.out.println(String.format("Abriendo programa: %s", programasCel[i]));
			celular.openProgram(programasCel[i]);
			celular.setCpuConsume(celular.getCpuConsume() + 5);
			celular.setMemoryRamConsume(celular.getMemoryRamConsume() + 5);
		}
		celular.showInfo();
	}

}
