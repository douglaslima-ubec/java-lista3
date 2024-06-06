package exercicio1;

public class Moto extends Veiculo {
	
	private double cilindrada;

	public Moto(String marca, String modelo, int ano, double cilindrada) {
		super(marca, modelo, ano);
		this.cilindrada = cilindrada;
	}
	
	public void empinar() {
		System.out.println("EMPINANDO a moto.");
	}

	@Override
	public void acelerar() {
		System.out.println("ACELERANDO a moto.");
	}
	
	@Override
	public void frear() {
		System.out.println("FREANDO a moto.");
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

}
