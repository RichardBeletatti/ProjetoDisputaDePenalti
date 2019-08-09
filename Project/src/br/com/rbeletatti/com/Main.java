package br.com.rbeletatti.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		GoleiroDoTime goleiroTime1 = new GoleiroDoTime("Cassio", 32, 12, 70, 85);
		List<JogadorDoTime> jogadores = new ArrayList<>();
		TecnicoDoTime tecnico = new TecnicoDoTime();

		Time time = new Time("Corinthians", jogadores, tecnico, goleiroTime1);

		tecnico.setNomeDoTecnico("Carille");

		ZagueiroDoTime zagueiro = new ZagueiroDoTime("Manoel", 32, 13, 65, 73);
		ZagueiroDoTime zagueiro2 = new ZagueiroDoTime("Henrique", 32, 3, 63, 70);
		LateralDoTime lateral = new LateralDoTime("Avelar", 25, 20, 68, 70);
		LateralDoTime lateral2 = new LateralDoTime("Fagner", 30, 23, 71, 69);
		VolanteDoTime volante = new VolanteDoTime("Urso", 28, 19, 73, 62);
		VolanteDoTime volante2 = new VolanteDoTime("Ralf", 35, 15, 60, 78);
		MeioCampoDoTime meiocampo = new MeioCampoDoTime("Pedrinho", 21, 28, 80, 40);
		MeioCampoDoTime meiocampo2 = new MeioCampoDoTime("Jadson", 36, 10, 83, 47);
		AtacanteDoTime atacante = new AtacanteDoTime("Gustavo", 25, 19, 87, 45);
		AtacanteDoTime atacante2 = new AtacanteDoTime("Vagner Love", 35, 9, 80, 55);

		jogadores.add(zagueiro);
		jogadores.add(zagueiro2);
		jogadores.add(lateral);
		jogadores.add(lateral2);
		jogadores.add(volante);
		jogadores.add(volante2);
		jogadores.add(meiocampo);
		jogadores.add(meiocampo2);
		jogadores.add(atacante);
		jogadores.add(atacante2);

		Collections.sort(time.jogadores);
//==================================================================================================================================================================================================================================================================================================	

		GoleiroDoTime goleiroTime2 = new GoleiroDoTime("Sidão", 34, 12, 68, 75);
		TecnicoDoTime tecnicoTime2 = new TecnicoDoTime();
		List<JogadorDoTime> jogadoresTime2 = new ArrayList<>();

		Time time2 = new Time("São Paulo", jogadoresTime2, tecnicoTime2, goleiroTime2);

		tecnicoTime2.setNomeDoTecnico("Cuca");

		ZagueiroDoTime zagueiroTime2 = new ZagueiroDoTime("Èder Militão", 19, 13, 71, 76);
		ZagueiroDoTime zagueiro2Time2 = new ZagueiroDoTime("Lucas Perri", 20, 40, 63, 66);
		LateralDoTime lateralTime2 = new LateralDoTime("Junior", 21, 22, 70, 76);
		LateralDoTime lateral2Time2 = new LateralDoTime("Edimar Fraga", 31, 16, 74, 61);
		VolanteDoTime volanteTime2 = new VolanteDoTime("Cícero", 33, 8, 75, 59);
		VolanteDoTime volante2Time2 = new VolanteDoTime("Shaylon", 20, 20, 72, 58);
		MeioCampoDoTime meioCampoTime2 = new MeioCampoDoTime("Lucas", 20, 29, 71, 58);
		MeioCampoDoTime meioCampo2Time2 = new MeioCampoDoTime("Thomaz", 31, 19, 66, 58);
		AtacanteDoTime atacanteTime2 = new AtacanteDoTime("Cueva", 32, 10, 78, 54);
		AtacanteDoTime atacante2Time2 = new AtacanteDoTime("Gilberto", 28, 17, 72, 52);

		jogadoresTime2.add(zagueiroTime2);
		jogadoresTime2.add(zagueiro2Time2);
		jogadoresTime2.add(lateralTime2);
		jogadoresTime2.add(lateral2Time2);
		jogadoresTime2.add(volanteTime2);
		jogadoresTime2.add(volante2Time2);
		jogadoresTime2.add(meioCampoTime2);
		jogadoresTime2.add(meioCampo2Time2);
		jogadoresTime2.add(atacanteTime2);
		jogadoresTime2.add(atacante2Time2);

		Collections.sort(time2.jogadores);

//================================================================================================================================================================================================================================================================================================================
		System.out.println("===========DISPUTA DE PENALTI==========");

		List<Time> sorteio = new ArrayList<>();

		sorteio.add(time);
		sorteio.add(time2);

		Time timeAtacante = sorteio.get(0);
		Time timeDefensor = sorteio.get(1);

		Rodada rodada = new Rodada();

		rodada.rodada(sorteio, timeAtacante, timeDefensor);

	}

}
