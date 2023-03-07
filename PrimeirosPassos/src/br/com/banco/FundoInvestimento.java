package br.com.banco;

public class FundoInvestimento implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 1.05;
	}

}
