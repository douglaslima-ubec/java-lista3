package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		List<Produto> listaDeProdutos = new ArrayList<>();
		listaDeProdutos.add(new Eletronico("RTX 3060", "Placa de vídeo capaz de rodar vários jogos em FullHD e até 4k.", 1_899.90, "12 meses"));
		listaDeProdutos.add(new Vestuario("Par de meias", "Um par de meias confortável e quente.", 29.90, "M", "Branco"));
		listaDeProdutos.add(new Livro("O investidor inteligente", "Maior consultor de investimentos do século XX, Benjamin Graham ensinou e inspirou milhares de pessoas ao redor do mundo. Seu conceito de “valor de investimento” protege os investidores de cometer erros substanciais e os ensina a desenvolver estratégias de longo prazo. Isso fez com que O investidor inteligente se tornasse a bíblia do mercado de ações desde sua primeira publicação, em 1949. A partir daí, as evoluções do mercado provaram a sabedoria das estratégias de Graham. Esta edição conta ainda com atualizações e apontamentos do jornalista Jason Zweig, além de prefácios de Warren Buffett e Armínio Fraga.", 84.90, "Benjamin Graham", "Investimentos"));
		listaDeProdutos.forEach(Produto::exibirDetalhes);
	}

}
