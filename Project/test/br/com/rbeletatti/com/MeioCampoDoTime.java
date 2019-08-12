package br.com.rbeletatti.com;

public class MeioCampoDoTime extends JogadorDoTime implements Cobrador {

	public MeioCampoDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtkDoJogador(atkDoJogador * 1.9);
		super.setDefDoJogador(defDoJogador * 0.8);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}
}
