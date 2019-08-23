package br.com.rbeletatti.com.main;

import java.util.ArrayList;
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
import br.com.rbeletatti.rodada.Time;

public class MainCriaTime {

	public static void main(String[] args) {

		// Criando Goleiros
		Goleiro goleiroTime1 = new Goleiro("Cassio", 32, 12, 70, 85);
		Goleiro goleiroTime2 = new Goleiro("Sidão", 34, 12, 68, 75);

		// Criando Lista dos Jogadores
		List<Jogador> jogadores = new ArrayList<>();
		List<Jogador> jogadoresTime2 = new ArrayList<>();

		// Criando Tecnicos
		Tecnico tecnico = new Tecnico();
		tecnico.setNomeDoTecnico("Carille");
		Tecnico tecnicoTime2 = new Tecnico();
		tecnicoTime2.setNomeDoTecnico("Cuca");

		// Criando Times
		Time time = new Time("Corinthians", jogadores, tecnico, goleiroTime1);
		Time time2 = new Time("São Paulo", jogadoresTime2, tecnicoTime2, goleiroTime2);

		jogadores.add(new Zagueiro("Manoel", 32, 13, 65, 73));
		jogadores.add(new Zagueiro("Henrique", 32, 3, 63, 70));
		jogadores.add(new Lateral("Avelar", 25, 20, 68, 70));
		jogadores.add(new Lateral("Fagner", 30, 23, 71, 69));
		jogadores.add(new Volante("Urso", 28, 19, 73, 62));
		jogadores.add(new Volante("Ralf", 35, 15, 60, 78));
		jogadores.add(new MeioCampo("Pedrinho", 21, 28, 80, 40));
		jogadores.add(new MeioCampo("Jadson", 36, 10, 83, 47));
		jogadores.add(new Atacante("Gustavo", 25, 19, 87, 45));
		jogadores.add(new Atacante("Vagner Love", 35, 9, 80, 55));

		// Lista dos Jogadores Time 2
		jogadoresTime2.add(new Zagueiro("Èder Militão", 19, 13, 71, 76));
		jogadoresTime2.add(new Zagueiro("Lucas Perri", 20, 40, 63, 66));
		jogadoresTime2.add(new Lateral("Junior", 21, 22, 70, 76));
		jogadoresTime2.add(new Lateral("Edimar Fraga", 31, 16, 74, 61));
		jogadoresTime2.add(new Volante("Cícero", 33, 8, 75, 59));
		jogadoresTime2.add(new Volante("Shaylon", 20, 20, 72, 58));
		jogadoresTime2.add(new MeioCampo("Lucas", 20, 29, 71, 58));
		jogadoresTime2.add(new MeioCampo("Thomaz", 31, 19, 66, 58));
		jogadoresTime2.add(new Atacante("Cueva", 32, 10, 78, 54));
		jogadoresTime2.add(new Atacante("Gilberto", 28, 17, 72, 52));

		Collections.sort(time.jogadores);
		Collections.sort(time2.jogadores);

	}
}
