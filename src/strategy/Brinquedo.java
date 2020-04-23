package strategy;

public class Brinquedo extends Produto implements ProdutoComDesconto{

	@Override
	public double calculaDesconta(double valor) {
		return valor - (valor * 0.1);
	}

}
