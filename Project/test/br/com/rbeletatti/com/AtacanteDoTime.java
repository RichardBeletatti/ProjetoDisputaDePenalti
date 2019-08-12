package br.com.rbeletatti.com;

public class AtacanteDoTime extends JogadorDoTime implements Cobrador {

	public AtacanteDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setAtkDoJogador(atkDoJogador * 2.6);
		super.setDefDoJogador(defDoJogador * 0.4);
		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}
}
