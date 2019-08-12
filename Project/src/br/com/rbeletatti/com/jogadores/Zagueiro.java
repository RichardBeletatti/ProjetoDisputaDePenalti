package br.com.rbeletatti.com.jogadores;

public class Zagueiro extends Jogador implements Cobrador {

	public Zagueiro(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtaque(atkDoJogador * 1.2);
		super.setDefDoJogador(defDoJogador * 2.5);
		super.setForcaGeralDoJogador();
	}

	public double chutarNoGol() {
		return getForcaGeral();
	}
}
