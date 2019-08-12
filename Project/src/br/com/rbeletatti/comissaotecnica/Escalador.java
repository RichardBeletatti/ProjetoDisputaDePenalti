package br.com.rbeletatti.comissaotecnica;

import java.util.List;

import br.com.rbeletatti.com.jogadores.Jogador;

public interface Escalador {

	public List<Jogador> getCincoMelhoresJogadores(List<Jogador> jogadores);

}
