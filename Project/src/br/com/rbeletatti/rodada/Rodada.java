package br.com.rbeletatti.rodada;

import java.util.ArrayList;
import java.util.List;

import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;

public class Rodada {

	List<Time> sorteio = new ArrayList<>();
	Time timeAtacante;
	Time timeDefensor;
	int placarAtacante;
	int placarDefensor;

	public Rodada(Time timeAtacante, Time timeDefensor) {
		this.timeAtacante = timeAtacante;
		this.timeDefensor = timeDefensor;

	}

	private Jogador getMelhorJogadorPorIndice(int indice, Time time) {
		return time.getTecnico().getJogadoresOrdenadosPelosMelhores(time.jogadores).get(indice);
	}

	private boolean batida(Jogador batedor, Goleiro goleiro) {
		if (batedor.chutarNoGol() > goleiro.defender()) {
			System.out.println(batedor.getNome() + " vai para cobrança e... Gool !");
			return true;
		} else if (batedor.chutarNoGol() < goleiro.defender()) {
			System.out.println("Defesa do goleiro " + goleiro.getNome() + " !");
		}
		return false;
	}

	public void executarCobranca(Time timeAtacante, Time timeDefensor) {
		placarAtacante = 1;
		placarDefensor = 1;

		Goleiro goleiroTimeAtacante = timeAtacante.goleiro;
		Goleiro goleiroTimeDefensor = timeDefensor.goleiro;

		System.out.println("========== DISPUTA DE PENALTI ========== \n");

		for (int i = 0; i < 5; i++) {
			Jogador jogadorDoTimeAtacante = getMelhorJogadorPorIndice(i, timeAtacante);
			Jogador jogadorDoTimeDefensor = getMelhorJogadorPorIndice(i, timeDefensor);

			System.out.println("Rodada " + (i + 1) + "\n");

			batida(jogadorDoTimeAtacante, goleiroTimeDefensor);
			batida(jogadorDoTimeDefensor, goleiroTimeAtacante);

			System.out.println((placarAtacante++) + " X " + (placarDefensor++));
		}
		if (placarAtacante == placarDefensor) {
			partidaExtra(timeAtacante, timeDefensor);
		}
	}

	private void partidaExtra(Time timeAtacante, Time timeDefensor) {
		int j = 4;
		j++;

		Jogador jogadorTimeAtacante = getMelhorJogadorPorIndice(j, timeAtacante);
		Jogador jogadorTimeDefensor = getMelhorJogadorPorIndice(j, timeDefensor);

		Goleiro goleiroTimeAtacante = timeAtacante.goleiro;
		Goleiro goleiroTimeDefensor = timeDefensor.goleiro;

		System.out.println("========== RODADA EXTRA " + (j + 1) + (" ========== \n"));

		while (this.placarAtacante == this.placarDefensor) {
			if (batida(jogadorTimeAtacante, goleiroTimeDefensor)) {
				this.placarAtacante++;
			}
			if (batida(jogadorTimeDefensor, goleiroTimeAtacante)) {
				this.placarDefensor++;
			}
			break;
		}
		resultado(timeAtacante, timeDefensor);
	}

	private void resultado(Time timeAtacante, Time timeDefensor) {
		if (this.placarAtacante > this.placarDefensor) {
			System.out.println("Parabéns ao " + timeAtacante.getNomeDoTime() + " vencedor da disputa de Penalti !");
		} else {
			System.out.println("Parabens ao " + timeDefensor.getNomeDoTime() + " vecendor da disputa de Penalti !");
		}
	}
}
