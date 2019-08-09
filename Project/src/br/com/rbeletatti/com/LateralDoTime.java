package br.com.rbeletatti.com;

public class LateralDoTime extends JogadorDoTime implements Cobrador {

	public LateralDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtkDoJogador(atkDoJogador * 1.5);
		super.setDefDoJogador(defDoJogador * 2);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}
}
