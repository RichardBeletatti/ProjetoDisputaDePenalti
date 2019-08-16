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

		executarCobranca(timeAtacante, timeDefensor);
		partidaExtra(timeAtacante, timeDefensor);
	}

	protected Jogador getMelhorJogadorPorIndice(int indice, Time time) {
		return time.getTecnico().getJogadoresOrdenadosPelosMelhores(time.jogadores).get(indice);
	}

	protected boolean batida(Jogador batedor, Goleiro goleiro) {
		if (batedor.chutarNoGol() > goleiro.defender()) {
			System.out.println(batedor.getNome() + " vai para cobrança e... Gool !");
			return true;
		} else if (batedor.chutarNoGol() < goleiro.defender()) {
			System.out.println("Defesa do goleiro " + goleiro.getNome() + " !");
		}
		return false;
	}

	protected void executarCobranca(Time timeAtacante, Time timeDefensor) {
		placarAtacante = 1;
		placarDefensor = 1;

		Goleiro goleiroTimeAtacante = timeAtacante.goleiro;
		Goleiro goleiroTimeDefensor = timeDefensor.goleiro;
		for (int i = 0; i < 5; i++) {
			Jogador jogadorDoTimeAtacante = getMelhorJogadorPorIndice(i, timeAtacante);
			Jogador jogadorDoTimeDefensor = getMelhorJogadorPorIndice(i, timeDefensor);

			System.out.println("Rodada " + (i + 1));

			if (batida(jogadorDoTimeAtacante, goleiroTimeDefensor))

				if (batida(jogadorDoTimeDefensor, goleiroTimeAtacante))

					System.out.println((placarAtacante++) + " X " + (placarDefensor++));
		}
	}

	protected void partidaExtra(Time timeAtacante, Time timeDefensor) {
		int j = 4;
		j++;

		Jogador jogadorTimeAtacante = getMelhorJogadorPorIndice(j, timeAtacante);
		Jogador jogadorTimeDefensor = getMelhorJogadorPorIndice(j, timeDefensor);

		Goleiro goleiroTimeAtacante = timeAtacante.goleiro;
		Goleiro goleiroTimeDefensor = timeDefensor.goleiro;

		System.out.println("Rodada Extra " + (j + 1));

		while (this.placarAtacante == this.placarDefensor) {
			if (batida(jogadorTimeAtacante, goleiroTimeDefensor)) {
				this.placarAtacante++;
			}
			if (batida(jogadorTimeDefensor, goleiroTimeAtacante)) {
				this.placarDefensor++;
			}
		}
		resultado(timeAtacante, timeDefensor);
	}

	protected void resultado(Time timeAtacante, Time timeDefensor) {
		if (this.placarAtacante > this.placarDefensor) {
			System.out.println("Parabéns ao " + timeAtacante.getNomeDoTime() + " vencedor da disputa de Penalti !");
		} else {
			System.out.println("Parabens ao " + timeDefensor.getNomeDoTime() + " vecendor da disputa de Penalti !");
		}
	}
}
