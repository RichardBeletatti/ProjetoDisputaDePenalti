package br.com.rbeletatti.com.jogadores;

public class Atacante extends Jogador implements Cobrador {

	public Atacante(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setAtaque(atkDoJogador * 2.6);
		super.setDefDoJogador(defDoJogador * 0.4);
		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeral();
	}
}
