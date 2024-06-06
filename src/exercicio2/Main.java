package exercicio2;

public class Main {

	public static void main(String[] args) {
		Professor victor = new Professor("Victor", "123.456.789-00", "01/01/1960", "Programação Orientada a Objetos", 15_000.00);
		victor.apresentar();
		victor.ensinar();
		System.out.println();
		Aluno ana = new Aluno("Ana", "009.876.543-21", "01/01/2000", "UC23200870", "Análise e Desenvolvimento de Software");
		ana.apresentar();
		ana.estudar();
	}

}
