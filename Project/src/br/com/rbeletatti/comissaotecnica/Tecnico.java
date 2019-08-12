package br.com.rbeletatti.comissaotecnica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.rbeletatti.com.jogadores.Jogador;

public class Tecnico implements Escalador {

	private String nomeDoTecnico;

	public String getNomeDoTecnico() {
		return nomeDoTecnico;
	}

	public void setNomeDoTecnico(String nomeDoTecnico) {
		this.nomeDoTecnico = nomeDoTecnico;
	}

	@Override
	public List<Jogador> getCincoMelhoresJogadores(List<Jogador> jogadores) {
		List<Jogador> retorno = new ArrayList<Jogador>();

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

	public List<Jogador> getJogadoresOrdenadosPelosMelhores(List<Jogador> jogadores) {
		List<Jogador> retorno = new ArrayList<Jogador>();

		Collections.sort(jogadores);

		for (int i = 0; i < jogadores.size(); i++) {
			retorno.add(jogadores.get(i));
		}
		return retorno;
	}

}
