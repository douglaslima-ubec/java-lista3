package exercicio2;

public class Professor extends Pessoa {

	private String disciplina;
	private double salario;

	public Professor(String nome, String cpf, String dataNascimento, String disciplina, double salario) {
		super(nome, cpf, dataNascimento);
		this.disciplina = disciplina;
		this.salario = salario;
	}

	public void ensinar() {
		System.out.println("O professor está ENSINANDO.");
	}

	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Disciplina: " + this.disciplina);
		System.out.printf("Salario: R$ %,.2f%n", this.salario);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
