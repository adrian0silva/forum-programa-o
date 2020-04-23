package strategy;

public class App {
	
	public static void main(String[] args) {
		
		ProdutoComDesconto brinquedo = new Brinquedo();
		ProdutoComDesconto livro = new Livro();
		ProdutoComDesconto game = new Game();
		
		double valor = 100.0;
		
		CalculaDesconto calculaDesconto = new CalculaDesconto();
		
		System.out.println(calculaDesconto.calculaDesconto(valor, brinquedo));
		System.out.println(calculaDesconto.calculaDesconto(valor, livro));
		System.out.println(calculaDesconto.calculaDesconto(valor, game));
	}
}
