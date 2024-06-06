package exercicio3;

public class Vestuario extends Produto {

	private String tamanho;
	private String cor;
	
	public Vestuario(String nome, String descricao, double preco, String tamanho, String cor) {
		super(nome, descricao, preco);
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
