package ufpb.br.sisTurismo;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String logradouro;
	private String numero;
	private String bairro;
	
	public Endereco(String logradouro, String numero, String bairro) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public String toString() {
		return "Logradouro: "+this.logradouro+
				" Número: "+this.numero+
				" Bairro: "+this.bairro;
	}
	
	//Metodo get e set para logradouro
	public String getLogradouro() {
		return this.logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	//Metodo get e set para numero
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//Metodo get e set para bairro
	public String getBairro() {
		return this.bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
