package br.com.rbeletatti.com;

public class VolanteDoTime extends JogadorDoTime implements Cobrador {

	public VolanteDoTime(String nomeDoJogador, int idadeDoJogador, int numeroCamiseta, int atkDoJogador,
			int defDoJogador) {
		super.setNomeDoJogador(nomeDoJogador);
		super.setIdadeDoJogador(idadeDoJogador);
		super.setNumeroCamiseta(numeroCamiseta);
		super.setAtkDoJogador(atkDoJogador * 1);
		super.setDefDoJogador(defDoJogador * 1.9);
		super.setForcaGeralDoJogador();
	}

	@Override
	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}

}
