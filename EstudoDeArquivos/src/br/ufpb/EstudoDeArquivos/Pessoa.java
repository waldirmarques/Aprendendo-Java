package br.ufpb.EstudoDeArquivos;

import java.io.Serializable;

public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String rua;
	private String telefone;
	
	public Pessoa(String nome, String rua, String telefone) {
		this.nome = nome;
		this.rua = rua;
		this.telefone = telefone;
	}
	public String toString() {
		return "nome: "+this.nome+"\nrua: "+this.rua+"\ntelefone: "+this.telefone;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRua() {
		return this.rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
