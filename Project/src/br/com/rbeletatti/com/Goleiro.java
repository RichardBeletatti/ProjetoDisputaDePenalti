package br.com.rbeletatti.com;

public class Goleiro {

	private String nome;
	private int idade;
	private int numeroDaCamiseta;
	private double forcaDeAtaque;
	private double forcaDeDefesa;

	public Goleiro(String nome, int idade, int numeroDaCamiseta, double forcaDeAtaque, double forcaDeDefesa) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setNumeroDaCamiseta(numeroDaCamiseta);
		this.setForcaDeAtaque(forcaDeAtaque);
		this.setForcaDeDefesa(forcaDeDefesa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idadeMax(idade)) {
			this.idade = idade;
		}
	}

	private boolean idadeMax(int idade) {
		if (idade <= 40) {
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

	public double getForcaDeAtaque() {
		return forcaDeAtaque;
	}

	public void setForcaDeAtaque(double forcaDeAtaque) {
		this.forcaDeAtaque = forcaDeAtaque;
	}
	
	private void calculaForcaGeral() {
		
	}
	
	public double getForcaDeDefesa() {
		return forcaDeDefesa;
	}

	public void setForcaDeDefesa(double forcaDeDefesa) {
		this.forcaDeDefesa = forcaDeDefesa;
	}
}
