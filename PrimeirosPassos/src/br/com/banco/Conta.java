package br.com.banco;

import java.util.Date;

public abstract class  Conta {
	//abstract na class proibe a instancia da classe 

	// atributos
	protected int numeroConta;
	protected double saldo;
	protected Date dataAbertura;
	protected Cliente cliente; // composição "toda cota tem um cliente"
	private static long contador;
	
	public static void exibirContador(){
		System.out.println("Contas: " + contador);
	}

	// construtor inicializacao do objeto, ele constroe o objeto
	// usa ctrl + 3 + generate contructor
	public Conta(Cliente cliente, int numeroConta) {
		// this se refere ao atributo da instancia
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.dataAbertura = new Date();
		contador++;
	}

	// metodos
	// deposito
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	// saque
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	// transferir
	public void transferir(double valor, Conta conta) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}

	public abstract void exibirSaldo();//modificador abstract no metodo forca  reescrita nas classes filhas 

}
