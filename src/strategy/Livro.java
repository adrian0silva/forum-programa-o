package strategy;

public class Livro extends Produto implements ProdutoComDesconto{

	@Override
	public double calculaDesconta(double valor) {
		return valor - (valor * 0.2);
	}

}
