package br.com.rbeletatti.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.rbeletatti.com.jogadores.Atacante;
import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;
import br.com.rbeletatti.com.jogadores.Lateral;
import br.com.rbeletatti.com.jogadores.MeioCampo;
import br.com.rbeletatti.com.jogadores.Volante;
import br.com.rbeletatti.com.jogadores.Zagueiro;
import br.com.rbeletatti.comissaotecnica.Tecnico;
import br.com.rbeletatti.rodada.Rodada;
import br.com.rbeletatti.rodada.Time;

public class Main {

	public static void main(String[] args) {

		Goleiro goleiroTime1 = new Goleiro("Cassio", 32, 12, 70, 85);
		List<Jogador> jogadores = new ArrayList<>();
		Tecnico tecnico = new Tecnico();

		Time time = new Time("Corinthians", jogadores, tecnico, goleiroTime1);

		tecnico.setNomeDoTecnico("Carille");

		Zagueiro zagueiro = new Zagueiro("Manoel", 32, 13, 65, 73);
		Zagueiro zagueiro2 = new Zagueiro("Henrique", 32, 3, 63, 70);
		Lateral lateral = new Lateral("Avelar", 25, 20, 68, 70);
		Lateral lateral2 = new Lateral("Fagner", 30, 23, 71, 69);
		Volante volante = new Volante("Urso", 28, 19, 73, 62);
		Volante volante2 = new Volante("Ralf", 35, 15, 60, 78);
		MeioCampo meiocampo = new MeioCampo("Pedrinho", 21, 28, 80, 40);
		MeioCampo meiocampo2 = new MeioCampo("Jadson", 36, 10, 83, 47);
		Atacante atacante = new Atacante("Gustavo", 25, 19, 87, 45);
		Atacante atacante2 = new Atacante("Vagner Love", 35, 9, 80, 55);

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

		Goleiro goleiroTime2 = new Goleiro("Sidão", 34, 12, 68, 75);
		Tecnico tecnicoTime2 = new Tecnico();
		List<Jogador> jogadoresTime2 = new ArrayList<>();

		Time time2 = new Time("São Paulo", jogadoresTime2, tecnicoTime2, goleiroTime2);

		tecnicoTime2.setNomeDoTecnico("Cuca");

		Zagueiro zagueiroTime2 = new Zagueiro("Èder Militão", 19, 13, 71, 76);
		Zagueiro zagueiro2Time2 = new Zagueiro("Lucas Perri", 20, 40, 63, 66);
		Lateral lateralTime2 = new Lateral("Junior", 21, 22, 70, 76);
		Lateral lateral2Time2 = new Lateral("Edimar Fraga", 31, 16, 74, 61);
		Volante volanteTime2 = new Volante("Cícero", 33, 8, 75, 59);
		Volante volante2Time2 = new Volante("Shaylon", 20, 20, 72, 58);
		MeioCampo meioCampoTime2 = new MeioCampo("Lucas", 20, 29, 71, 58);
		MeioCampo meioCampo2Time2 = new MeioCampo("Thomaz", 31, 19, 66, 58);
		Atacante atacanteTime2 = new Atacante("Cueva", 32, 10, 78, 54);
		Atacante atacante2Time2 = new Atacante("Gilberto", 28, 17, 72, 52);

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
		System.out.println("==============DISPUTA DE PENALTI=============");

		List<Time> sorteio = new ArrayList<Time>();

		sorteio.add(time);
		sorteio.add(time2);

		Time timeAtacante = sorteio.get(0);
		Time timeDefensor = sorteio.get(1);

		Rodada rodada = new Rodada();

		rodada.rodada(sorteio, timeAtacante, timeDefensor);
	}

}
