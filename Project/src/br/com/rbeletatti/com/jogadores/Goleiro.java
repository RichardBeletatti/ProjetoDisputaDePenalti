package br.com.rbeletatti.com.jogadores;

public class Goleiro extends Jogador implements Defensor {

	public Goleiro(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {

		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtaque(atkDoJogador * 0.5);
		super.setDefDoJogador(defDoJogador * 3);

		super.setForcaGeralDoJogador();
	}

	@Override
	public double defender() {
		return getForcaGeral();
	}

}
