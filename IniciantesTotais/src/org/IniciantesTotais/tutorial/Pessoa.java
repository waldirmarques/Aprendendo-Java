package org.IniciantesTotais.tutorial;

public class Pessoa {
	//Atributos
	private String none; //none da pessoa
	private int naxLivros; //numero nax de livros
	
	//contrutores
	public Pessoa() {
		none = "None Desconhecido";
		naxLivros = 3;
	}
	
	public String getNone() {
		return none;
	}
	
	public void setNone(String qualquerNone) {
		none = qualquerNone;
	}

	public int getNaxLivros() {
		return naxLivros;
	}

	public void setNaxLivros(int naxLivro) {
		naxLivros = naxLivros;
	}
	
}
