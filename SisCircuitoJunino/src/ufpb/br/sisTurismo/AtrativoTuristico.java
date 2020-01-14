package ufpb.br.sisTurismo;

import java.io.Serializable;

public abstract class AtrativoTuristico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private double latitude;
	private double longitude;
	private String comoChegar;
	private String site;
	private String infoContato;
	
	public AtrativoTuristico(String nome,double latitude, double longitude,String comoChegar, String site, String infoContato){
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.comoChegar = comoChegar;
		this.site = site;
		this.infoContato = infoContato;
	}

	public abstract String getDescricao();
	public abstract String getType();
	
	//Metodo get e set para nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodo get e set para latitude
	public double getLatitude() {
		return this.latitude;
	}
	public void setLatidude(double latidude) {
		this.latitude = latidude;
	}
	
	//Metodo get e set para longidude
	public double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	//Metodo get e set para comoChegar
	public String getComoChegar() {
		return this.comoChegar;
	}
	public void setComoChegar(String comoChegar) {
		this.comoChegar = comoChegar;
	}
	
	//Metodo get e set para site
	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	//Metodo get e set para infoContato
	public String getInfoContato() {
		return this.infoContato;
	}
	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}
	
}
