package br.com.rbeletatti.rodada;

import java.util.List;
import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;
import br.com.rbeletatti.comissaotecnica.Tecnico;

public class Time {

	private String nome;
	public List<Jogador> jogadores;
	Tecnico tecnico;
	public Goleiro goleiro;

	public String getNomeDoTime() {
		return nome;
	}

	public void setNomeDoTime(String nomeDoTime) {
		this.nome = nomeDoTime;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Time(String nomeDoTime, Tecnico tecnico, Goleiro goleiro, List<Jogador> jogadores) {
		this.nome = nomeDoTime;
		this.jogadores = jogadores;
		this.tecnico = tecnico;
		this.goleiro = goleiro;
	}

	@Override
	public String toString() {
		return "[" + nome + "]";
	}
}
