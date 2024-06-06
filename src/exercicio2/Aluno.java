package exercicio2;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;

	public Aluno(String nome, String cpf, String dataNascimento, String matricula, String curso) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.curso = curso;
	}

	public void estudar() {
		System.out.println("O aluno está ESTUDANDO.");
	}

	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
