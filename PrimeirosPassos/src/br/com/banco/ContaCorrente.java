package br.com.banco;

public final class ContaCorrente extends Conta {
//final na class impede da classe seja herdada 

	
	// atributos especifico de conta corrente
	double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		// faz referencia ao construtoe da classe mae
		super(cliente, numeroConta);
		this.saldoInvestimento = 0.0;
	}

	public void investir(Produto produto, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
	}

	@Override
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("saldo da conta corrente " + this.saldo);
		System.out.println("saldo do investimento: " + this.saldoInvestimento);
		System.out.println("saldo total: " + saldoTotal);
		System.out.println("Data de abertura: " + dataAbertura);
		System.out.println("Data de nascimeto do cliente: " + this.cliente.getDataNasc());

	}

}
