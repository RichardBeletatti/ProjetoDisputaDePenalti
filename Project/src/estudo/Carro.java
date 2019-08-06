package estudo;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private String marca;
	private String chassi;
	private Proprietario proprietario;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private int nrDePortas;
	private boolean cambioAutomatico;
	private double combustivel;

	public Carro(String marca, String cor, int ano) {
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNrDePortas() {
		return nrDePortas;
	}

	public void setNrDePortas(int nrDePortas) {
		this.nrDePortas = nrDePortas;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public boolean acelera(double velocidade) {
		while (velocidade < getVelocidadeMaxima()) {
			velocidade++;
		}
		return false;
	}

	public void freia(double velocidade) {
		velocidade = 0;
	}

	public void trocaDeMarcha(int marcha) {

		while (velocidadeAtual <= velocidadeMaxima) {
			if (velocidadeAtual >= 0 && velocidadeAtual <= 10) {
				System.out.println(marcha++);
			} else if (velocidadeAtual >= 10 && velocidadeAtual <= 50) {
				System.out.println(marcha = +2);
			} else if (velocidadeAtual >= 50 && velocidadeAtual <= 80) {
				System.out.println(marcha = +3);
			} else if (velocidadeAtual >= 80 && velocidadeAtual <= 120) {
				System.out.println(marcha = +4);
			} else if (velocidadeAtual >= 120 && velocidadeAtual <= 180) {
				System.out.println(marcha = +5);
			}
		}
	}

	public void reduzAMarcha() {
		while (velocidadeAtual <= velocidadeMaxima) {
			if(velocidadeAtual <= 180 && velocidadeAtual >= 120) {
				marcha = +
			}
		}
	}
}
