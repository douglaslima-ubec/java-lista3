package exercicio1;

public class Carro extends Veiculo {

	private int numeroDePortas;
	
	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}
	
	public void ligarArCondicionado() {
		System.out.println("LIGANDO o ar-condicionado do carro.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("ACELERANDO o carro.");
	}
	
	@Override
	public void frear() {
		System.out.println("FREANDO o carro.");
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

}
