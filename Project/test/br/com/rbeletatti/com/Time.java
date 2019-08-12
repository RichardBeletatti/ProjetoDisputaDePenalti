package br.com.rbeletatti.com;

import java.util.List;

public class Time {

	private String nomeDoTime;
	List<JogadorDoTime> jogadores;
	TecnicoDoTime tecnico;
	GoleiroDoTime goleiro;

	public String getNomeDoTime() {
		return nomeDoTime;
	}

	public void setNomeDoTime(String nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}

	public TecnicoDoTime getTecnico() {
		return tecnico;
	}

	public void setTecnico(TecnicoDoTime tecnico) {
		this.tecnico = tecnico;
	}

	public Time(String nomeDoTime, List<JogadorDoTime> jogadores, TecnicoDoTime tecnico, GoleiroDoTime goleiro) {
		this.nomeDoTime = nomeDoTime;
		this.jogadores = jogadores;
		this.tecnico = tecnico;
		this.goleiro = goleiro;
	}

	@Override
	public String toString() {
		return "[" + nomeDoTime + "]";
	}
}
