package strategy;

public class CalculaDesconto {
	
	public double calculaDesconto(double valor,ProdutoComDesconto produtoComDesconto) {
		double desconto = produtoComDesconto.calculaDesconta(valor);
		return desconto;
	}
}
