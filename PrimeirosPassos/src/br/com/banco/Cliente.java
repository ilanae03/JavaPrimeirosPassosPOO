package br.com.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//javabeans
public class Cliente {

	// atributos de cliente
	private String nome;
	private String endereco;
	private final Date dataNasc;

	// construtor
	public Cliente(String nome, String endereco, String dataNasc) throws ParseException {

		this.nome = nome;
		this.endereco = endereco;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNasc = formato.parse(dataNasc);
	}

	// getters -> leitura
	public String getNome() {
		return nome;
	}

	// setters -> escrita
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}



}
