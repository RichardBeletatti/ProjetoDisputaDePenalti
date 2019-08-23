package br.com.rbeletatti.com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;
import br.com.rbeletatti.comissaotecnica.Tecnico;
import br.com.rbeletatti.rodada.Rodada;
import br.com.rbeletatti.rodada.Time;

public class Main extends CriaTime {

	public static void main(String[] args) throws IOException {

		System.out.println("======== Dados Time 1 ========");

		Time timeAtacante = null;
		Time timeDefensor = null;

		// Corker Dads do Time 1

		try {
			br = new BufferedReader(new FileReader("C://Users/rbeletatti/Downloads/PlanilhaTime1.csv"));

			String nomeTime = nomeDoTime();
			Tecnico tecnico = criacaoDoTecnico();
			Goleiro goleiro = criacaoDoGoleiro();
			List<Jogador> jogadores = criaJogadores();

			timeAtacante = new Time(nomeTime, tecnico, goleiro, jogadores);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("======== Dados Time 2 ========");

		// Corker Dads Time 2
		try {
			br = new BufferedReader(new FileReader("C://Users/rbeletatti/Downloads/PlanilhaTime2.csv"));

			String nome = nomeDoTime();
			Tecnico tecnico = criacaoDoTecnico();
			Goleiro goleiro = criacaoDoGoleiro();
			List<Jogador> jogadores = criaJogadores();

			timeDefensor = new Time(nome, tecnico, goleiro, jogadores);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Rodada.executarCobranca(timeAtacante, timeDefensor);
	}
}