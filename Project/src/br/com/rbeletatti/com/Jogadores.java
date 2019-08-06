package br.com.rbeletatti.com;

public class Jogadores {

	private String nome;
	private int idade;
	private int numeroDaCamiseta;
	private String posicao;
	private double forcaDeAtaque;
	private double forcaDeDefesa;
	private double forcaGeral;

	public Jogadores(String nome, int idade, int numeroDaCamiseta, String posicao, double forcaDeAtaque,
			double forcaDeDefesa) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setNumeroDaCamiseta(numeroDaCamiseta);
		this.setPosicao(posicao);
		this.setForcaDeAtaque(forcaDeAtaque);
		this.setForcaDeDefesa(forcaDeDefesa);
		this.setForcaGeral(((this.forcaDeAtaque + this.forcaDeDefesa) / idade) * 100);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!qntdLetraNome(nome)) {
			throw new IllegalArgumentException("Nome inválido !");
		} else {
			this.nome = nome;
		}
	}

	private boolean qntdLetraNome(String nome) {
		return nome.length() < 7;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (maxIdade(idade)) {
			this.idade = idade;
		}
	}

	private boolean maxIdade(int idade) {
		if (idade < 40) {
			return true;
		} else {
			return false;
		}
	}

	public int getNumeroDaCamiseta() {
		return numeroDaCamiseta;
	}

	public void setNumeroDaCamiseta(int numeroDaCamiseta) {
		this.numeroDaCamiseta = numeroDaCamiseta;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		definindoPosicao(posicao);
		this.posicao = posicao;
	}

	private void definindoPosicao(String posicao) {
		if (posicao == "Zagueiro") {
			setForcaDeAtaque(forcaDeAtaque * 1.2);
			setForcaDeDefesa(forcaDeDefesa * 2.5);

		} else if (posicao == "Lateral") {
			setForcaDeAtaque(forcaDeAtaque * 1.5);
			setForcaDeDefesa(forcaDeDefesa * 2);

		} else if (posicao == "Volante") {
			setForcaDeAtaque(forcaDeAtaque * 1);
			setForcaDeDefesa(forcaDeDefesa * 1.9);

		} else if (posicao == "Meio Campo") {
			setForcaDeAtaque(forcaDeAtaque * 1.9);
			setForcaDeDefesa(forcaDeDefesa * 0.8);

		} else if (posicao == "Atacante") {
			setForcaDeAtaque(forcaDeAtaque * 2.6);
			setForcaDeDefesa(forcaDeDefesa * 0.4);
		}
	}

	public double getForcaDeAtaque() {
		return forcaDeAtaque;
	}

	public void setForcaDeAtaque(double forcaDeAtaque) {
		this.forcaDeAtaque = forcaDeAtaque;
	}

	public double getForcaDeDefesa() {
		return forcaDeDefesa;
	}

	public void setForcaDeDefesa(double forcaDeDefesa) {
		this.forcaDeDefesa = forcaDeDefesa;
	}

	public double getForcaGeral() {
		return forcaGeral;
	}

	public void setForcaGeral(double forcaGeral) {
		this.forcaGeral = calculandoforcaGeral();
	}

	private double calculandoforcaGeral() {
		return (((this.getForcaDeAtaque() + this.getForcaDeDefesa()) / this.idade) * 100);
	}
}
