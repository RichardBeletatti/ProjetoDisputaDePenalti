package br.com.rbeletatti.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TecnicoDoTime implements Escalador {

	private String nomeDoTecnico;

	public String getNomeDoTecnico() {
		return nomeDoTecnico;
	}

	public void setNomeDoTecnico(String nomeDoTecnico) {
		this.nomeDoTecnico = nomeDoTecnico;
	}

	@Override
	public List<JogadorDoTime> getCincoMelhoresJogadores(List<JogadorDoTime> jogadores) {
		List<JogadorDoTime> retorno = new ArrayList<JogadorDoTime>();

		Collections.sort(jogadores);

		// retorno.add(jogadores.get(0));
		// retorno.add(jogadores.get(1));
		// retorno.add(jogadores.get(2));
		// retorno.add(jogadores.get(3));
		// retorno.add(jogadores.get(4));

		for (int i = 0; i < 5; i++) {
			retorno.add(jogadores.get(i));
		}
		return retorno;
	}

	public List<JogadorDoTime> getJogadoresOrdenadosPelosMelhores(List<JogadorDoTime> jogadores) {
		List<JogadorDoTime> retorno = new ArrayList<JogadorDoTime>();

		Collections.sort(jogadores);

		for (int i = 0; i < jogadores.size(); i++) {
			retorno.add(jogadores.get(i));
		}
		return retorno;
	}

}
