package br.com.rbeletatti.com.jogadores;

public abstract class Jogador implements Comparable<Jogador> {

	private String nome;
	private int idade;
	private int numeroCamiseta;
	private String posicao;
	private double ataque;
	private double defesa;
	private double forcaGeral;

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeDoJogador) {
		this.nome = nomeDoJogador;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdadeDoJogador(int idadeDoJogador) {
		if (!idadeMaxima(idadeDoJogador)) {
			throw new IllegalArgumentException("Idade inválida.");
		}
		this.idade = idadeDoJogador;
	}

	private boolean idadeMaxima(int idade) {
		if (idade <= 40) {
			return true;
		} else {
			return false;
		}
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		if (!numeroDeCamisetaMaxima(numeroCamiseta)) {
			throw new IllegalArgumentException("Número imválido");
		}
		this.numeroCamiseta = numeroCamiseta;
	}

	private boolean numeroDeCamisetaMaxima(int numero) {
		if (numero <= 100) {
			return true;
		} else {
			return false;
		}
	}

	public String getPosicaoJogador() {
		return posicao;
	}

	public void setPosicaoJogador(String posicaoJogador) {
		this.posicao = posicaoJogador;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		if (!ataqueMaxio(ataque)) {
			throw new IllegalArgumentException("Ataque inválido.");
		}
		this.ataque = ataque;
	}

	private boolean ataqueMaxio(double ataque) {
		if (ataque <= 300) {
			return true;
		} else {
			return false;
		}
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefDoJogador(double defJogador) {
		defesa = defJogador;
	}

	public double getForcaGeral() {
		return forcaGeral;
	}

	public void setForcaGeralDoJogador() {
		this.forcaGeral = ((getAtaque() + getDefesa()) / getIdade()) * 100;
	}

	public int compareTo(Jogador o) {
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
		return Double.valueOf(o.getForcaGeral() - getForcaGeral()).intValue();
	}

	@Override
	public String toString() {
		return "nomeDoJogador = " + nome + ", idadeDoJogador = " + idade + ", numeroCamiseta = " + numeroCamiseta + "]";
	}

	public double chutarNoGol() {
		return getForcaGeral();
	}
}
