package br.com.rbeletatti.com.jogadores;

public class Lateral extends Jogador implements Cobrador {

	public Lateral(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtaque(atkDoJogador * 1.5);
		super.setDefDoJogador(defDoJogador * 2);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeral();
	}
}
