package br.com.rbeletatti.com;

public abstract class JogadorDoTime implements Comparable<JogadorDoTime> {

	private String nomeDoJogador;
	private int idadeDoJogador;
	private int numeroCamiseta;
	private String posicaoJogador;
	private double atkDoJogador;
	private double defDoJogador;
	private double forcaGeralDoJogador;

	public String getNomeDoJogador() {
		return nomeDoJogador;
	}

	public void setNomeDoJogador(String nomeDoJogador) {
		this.nomeDoJogador = nomeDoJogador;
	}

	public int getIdadeDoJogador() {
		return idadeDoJogador;
	}

	public void setIdadeDoJogador(int idadeDoJogador) {
		this.idadeDoJogador = idadeDoJogador;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPosicaoJogador() {
		return posicaoJogador;
	}

	public void setPosicaoJogador(String posicaoJogador) {
		this.posicaoJogador = posicaoJogador;
	}

	public double getAtkDoJogador() {
		return atkDoJogador;
	}

	public void setAtkDoJogador(double atkJogador) {
		atkDoJogador = atkJogador;
	}

	public double getDefDoJogador() {
		return defDoJogador;
	}

	public void setDefDoJogador(double defJogador) {
		defDoJogador = defJogador;
	}

	public double getForcaGeralDoJogador() {
		return forcaGeralDoJogador;
	}

	public void setForcaGeralDoJogador() {
		this.forcaGeralDoJogador = ((getAtkDoJogador() + getDefDoJogador()) / getIdadeDoJogador()) * 100;
	}

	public int compareTo(JogadorDoTime o) {
		// if (o.getForcaGeralDoJogador() == getForcaGeralDoJogador()) {
		// return 0;
		// } else {
		// if (o.getForcaGeralDoJogador() > getForcaGeralDoJogador()) {
		// return 1;
		// } else {
		// if (o.getForcaGeralDoJogador() < getForcaGeralDoJogador()) {
		// return -1;
		// }
		// }
		// }
		return Double.valueOf(o.getForcaGeralDoJogador() - getForcaGeralDoJogador()).intValue();
	}

	@Override
	public String toString() {
		return "nomeDoJogador = " + nomeDoJogador + ", idadeDoJogador = " + idadeDoJogador + ", numeroCamiseta = "
				+ numeroCamiseta + "]";
	}

	public double chutarNoGol() {
		return getForcaGeralDoJogador();
	}
}
