package ufpb.br.sisTurismo;

import java.io.Serializable;

public class MeioDeHospedagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private double latitude;
	private double longitude;
	private String infoContato;
	private String site;
	private String tipoHospedagem;
	private Endereco endereco;

	public static final String TIPO_HOTEL = "Hotel";
	public static final String TIPO_POUSADA = "Pousada";
	public static final String TIPO_ALBERGUE = "Albergue";
	
	public MeioDeHospedagem(String nome, double latitude, double longitude, String infoContato, String site, String tipoHospedagem, Endereco endereco) {
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.infoContato = infoContato;
		this.site = site;
		this.tipoHospedagem = tipoHospedagem;
		this.endereco = endereco;
	}
	
	// Metodo get e set para nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodo get e set para latitude
	public double getLatitude() {
		return this.latitude;
	}
	public void setLatidude(double latidude) {
		this.latitude = latidude;
	}

	// Metodo get e set para longidude
	public double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	// Metodo get e set para site
	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	// Metodo get e set para infoContato
	public String getInfoContato() {
		return this.infoContato;
	}
	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}

	// Metodo get e set para tipoHospedagem
	public String getTipoHospedagem() {
		return this.tipoHospedagem;
	}
	public void setTipoHospedagem(String tipoHospedagem) {
		this.tipoHospedagem = tipoHospedagem;
	}

	// Metodo get e set para endereco
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
