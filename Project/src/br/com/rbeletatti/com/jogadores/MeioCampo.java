package br.com.rbeletatti.com.jogadores;

public class MeioCampo extends Jogador implements Cobrador {

	public MeioCampo(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtaque(atkDoJogador * 1.9);
		super.setDefDoJogador(defDoJogador * 0.8);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeral();
	}
}
