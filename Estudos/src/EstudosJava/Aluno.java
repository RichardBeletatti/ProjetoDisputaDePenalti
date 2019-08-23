package EstudosJava;

public class Aluno extends Pessoa {

	private int matricula;

	public Aluno(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public String toString() {
		return super.toString() + "\rMatricula: " + matricula;
	}
}
