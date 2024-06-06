package exercicio3;

public class Eletronico extends Produto {

	private String garantia;
	
	public Eletronico(String nome, String descricao, double preco, String garantia) {
		super(nome, descricao, preco);
		this.garantia = garantia;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Garantia: " + this.garantia);
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

}
