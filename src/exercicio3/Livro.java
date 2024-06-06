package exercicio3;

public class Livro extends Produto {

	private String autor;
	private String genero;
	
	public Livro(String nome, String descricao, double preco, String autor, String genero) {
		super(nome, descricao, preco);
		this.autor = autor;
		this.genero = genero;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Autor: " + this.autor);
		System.out.println("Gênero: " + this.genero);
	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
