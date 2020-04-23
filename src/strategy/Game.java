package strategy;

public class Game extends Produto implements ProdutoComDesconto{

	@Override
	public double calculaDesconta(double valor) {
		return valor - (valor * 0.08);
	}

}
