package exercicio1;

public class Main {

	public static void main(String[] args) {
		Carro fiat = new Carro("Fiat", "Fiat Uno", 2007, 4);
		fiat.acelerar();
		fiat.frear();
		fiat.ligarArCondicionado();
		System.out.println();
		Moto honda = new Moto("Honda", "Honda 160", 2018, 162.7);
		honda.acelerar();
		honda.frear();
		honda.empinar();
	}

}
