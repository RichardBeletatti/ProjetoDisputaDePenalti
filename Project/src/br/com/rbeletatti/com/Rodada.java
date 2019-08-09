package br.com.rbeletatti.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	

public class Rodada {

	List<Time> sorteio = new ArrayList<>();
	Time timeAtacante;
	Time timeDefensor;
	int placarAtacante;
	int placarDefensor;

	public void rodada(List<Time> sorteio, Time timeAtacante, Time timeDefensor) {
		this.timeAtacante = timeAtacante;
		this.timeDefensor = timeDefensor;
		this.sorteio = sorteio;

		sorteio.add(timeAtacante);
		sorteio.add(timeDefensor);

		Collections.shuffle(sorteio);

		executarCobranca(timeAtacante, timeDefensor);
		partidaExtra(timeAtacante, timeDefensor);
	}

	private JogadorDoTime getMelhorJogadorPorIndice(int indice, Time time) {
		return time.getTecnico().getJogadoresOrdenadosPelosMelhores(time.jogadores).get(indice);
	}

	private boolean batida(JogadorDoTime batedor, GoleiroDoTime goleiro) {
		if (batedor.chutarNoGol() > goleiro.defender()) {
			System.out.println(batedor.getNomeDoJogador() + " vai para cobrança e... Gool !");
			return true;
		} else {
			if (batedor.chutarNoGol() < goleiro.defender()) {
				System.out.println("Defesa do goleiro " + goleiro.getNomeDoJogador() + " !");
				return false;
			}
		}
		return false;
	}

	private boolean executarCobranca(Time timeAtacante, Time timeDefensor) {
		placarAtacante = 1;
		placarDefensor = 1;

		GoleiroDoTime goleiroDoTimeAtacante = timeAtacante.goleiro;
		GoleiroDoTime goleiroDoTimeDefensor = timeDefensor.goleiro;
		for (int i = 0; i < 5; i++) {
			JogadorDoTime jogadorDoTimeAtacante = getMelhorJogadorPorIndice(i, timeAtacante);
			JogadorDoTime jogadorDoTimeDefensor = getMelhorJogadorPorIndice(i, timeDefensor);

			System.out.println("Rodada " + (i + 1));

			if (batida(jogadorDoTimeAtacante, goleiroDoTimeDefensor))
				;
			if (batida(jogadorDoTimeDefensor, goleiroDoTimeAtacante)) {
				System.out.println((placarAtacante++) + " X " + (placarDefensor++));
			}
		}
		return false;
	}

	private void partidaExtra(Time timeAtacante, Time timeDefensor) {
		int j = 4;
		j++;

		JogadorDoTime jogadorDoTimeAtacante = getMelhorJogadorPorIndice(j, timeAtacante);
		JogadorDoTime jogadorDoTimeDefensor = getMelhorJogadorPorIndice(j, timeDefensor);

		GoleiroDoTime goleiroDoTimeAtacante = timeAtacante.goleiro;
		GoleiroDoTime goleiroDoTimeDefensor = timeDefensor.goleiro;

		if (executarCobranca(timeAtacante, timeDefensor) == executarCobranca(timeDefensor, timeAtacante)) {
			System.out.println("Rodada Extra " + (j + 1));

			if (batida(jogadorDoTimeAtacante, goleiroDoTimeDefensor)) {
				this.placarAtacante++;

				if (batida(jogadorDoTimeDefensor, goleiroDoTimeAtacante)) {
					this.placarDefensor++;
				} else if (batida(jogadorDoTimeDefensor, goleiroDoTimeAtacante) == false) {
					resultado(timeAtacante, timeDefensor);
				}
			}
		} else if (batida(jogadorDoTimeAtacante, goleiroDoTimeDefensor) == false) {
			resultado(timeAtacante, timeDefensor);
		}
	}

	private void resultado(Time timeAtacante, Time timeDefensor) {
		if (this.placarAtacante > this.placarDefensor) {

			System.out.println("Parabéns ao " + timeAtacante.getNomeDoTime() + " vencedor da disputa de Penalti !");
		} else {
			System.out.println("Parabens ao " + timeDefensor.getNomeDoTime() + " vecendor da disputa de Penalti !");
		}
	}

}
