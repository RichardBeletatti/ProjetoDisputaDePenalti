package br.com.rbeletatti.com;

public class GoleiroDoTime extends JogadorDoTime implements Defensor {

	public GoleiroDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {

		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtkDoJogador(atkDoJogador * 0.5);
		super.setDefDoJogador(defDoJogador * 3);

		super.setForcaGeralDoJogador();
	}

	@Override
	public double defender() {
		return getForcaGeralDoJogador();
	}

}
