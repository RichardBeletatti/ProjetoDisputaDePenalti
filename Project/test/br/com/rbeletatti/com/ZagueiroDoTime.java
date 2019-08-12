package br.com.rbeletatti.com;

public class ZagueiroDoTime extends JogadorDoTime implements Cobrador {

	public ZagueiroDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtkDoJogador(atkDoJogador * 1.2);
		super.setDefDoJogador(defDoJogador * 2.5);
		super.setForcaGeralDoJogador();
	}

	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}

}
