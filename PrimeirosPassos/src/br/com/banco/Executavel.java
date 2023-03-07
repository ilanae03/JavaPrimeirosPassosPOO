package br.com.banco;

import java.text.ParseException;

public class Executavel {

	public static void main(String[] args) throws ParseException {
		// Executavel é a unica classe que tem o método main

		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();
		FundoInvestimento fundoInvest = new FundoInvestimento();

		Cliente Ilan = new Cliente("Ilan", "Rua sei la", "23/06/2003");
		ContaCorrente contaIlan = new ContaCorrente(Ilan, 1);

		Cliente Livia = new Cliente("Livia", "Rua nao sei oq", "27/01/2004");
		ContaCorrente contaLivia = new ContaCorrente(Livia, 2);

		// simulação
		contaIlan.depositar(1050);
		contaIlan.exibirSaldo();

		contaIlan.transferir(50, contaLivia);
		contaIlan.exibirSaldo();
		contaLivia.exibirSaldo();

		contaIlan.investir(lca, 100);
		contaIlan.exibirSaldo();
		System.out.println(contaIlan.saldoInvestimento);

		contaIlan.exibirSaldo();

		Conta.exibirContador();

	}

}
