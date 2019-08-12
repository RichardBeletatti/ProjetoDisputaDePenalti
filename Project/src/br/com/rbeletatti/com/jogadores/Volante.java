package br.com.rbeletatti.com.jogadores;

public class Volante extends Jogador implements Cobrador {

	public Volante(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNome(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtaque(atkDoJogador * 1);
		super.setDefDoJogador(defDoJogador * 1.9);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeral();
	}

}
