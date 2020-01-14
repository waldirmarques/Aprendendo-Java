package ufpb.br.sisTurismo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int populacao;	
	private double latitude;
	private double longitude;	
	private String estado;
	private String site;
	private List<AtrativoTuristico> atrativosTuristicos;
	private List<MeioDeHospedagem> meiosDeHospedagem;
	
	public Municipio(String nome,int populacao,List<MeioDeHospedagem> meiosDeHospedagem,List<AtrativoTuristico> atrativosTuristicos ,double latitude, double longitude, String estado,String site) {
		this.nome = nome;
		this.populacao = populacao;
		this.meiosDeHospedagem = meiosDeHospedagem;
		this.atrativosTuristicos = atrativosTuristicos;
		this.latitude = latitude;
		this.longitude = longitude;
		this.estado = estado;
		this.site = site;		
	}
	
	public Municipio(String nome,int populacao,double latitude, double longitude, String estado,String site) {
		this(nome, populacao, new ArrayList<MeioDeHospedagem>(), new ArrayList<AtrativoTuristico>(), latitude, longitude, estado, site);		
	}
	
	public String toString() {
		return "Nome do Municipio: "+this.nome+
				"\nPopulação do Municipio: "+this.populacao+
				"\nLatitude do Municipio: "+this.latitude+
				"\nLongitude Municipio: "+this.longitude+
				"\nEstado Municipio: "+this.estado+
				"\nSite Municipio: "+this.site;
	}
	//Metodo para Cadastrar atrativo turistico
	public void cadastrarAtrativoTuristico(AtrativoTuristico atrativo) throws AtrativoJaExisteException {
		boolean existe = false;
		for(AtrativoTuristico a: this.atrativosTuristicos) {
			if(a.getNome().equals(atrativo.getNome())) {
				existe = true;
				break;
			}
		}	
		if(!existe) {
			this.atrativosTuristicos.add(atrativo);
		}else {
			throw new AtrativoJaExisteException ("Já Existe "+atrativo.getNome());
		}
		
	}
	
	//Metodo para pesquisar um atrativo turistico
	public AtrativoTuristico pesquisarAtrativoTuristico(String nomeAtrativo) throws AtrativoNaoExisteException {
		for(AtrativoTuristico a: atrativosTuristicos) {
			if(a.getNome().equals(nomeAtrativo)) {
				return a;
			}
		}
		if(this.atrativosTuristicos.size() > 0) {
			throw new AtrativoNaoExisteException("Já existe Atrativo");
		}
		return null;
	}
	
	//Metodo get e set Atrativos Turisticos
	public List<AtrativoTuristico> getAtrativosTuristicos(){
		return this.atrativosTuristicos;
	}
	public void setAtrativosTuristicos(List<AtrativoTuristico> atrativosTuristicos) {
		this.atrativosTuristicos = atrativosTuristicos;
	}
	
	//Metodo get e set para nome Municipio
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodo get e set para população do Municipio
	public int getPopulacao() {
		return this.populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	//Metodo get e set para latitude
	public double getLatitude() {
		return this.latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	//Metodo get e set para Longitude
	public double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	//Metodo get e set para MeiosDeOspedagem
	public List<MeioDeHospedagem> getMeiosDeOspedagem() {
		return this.meiosDeHospedagem;
	}
	public void setMeiosDeOspedagem(List<MeioDeHospedagem> meiosDeOspedagem) {
		this.meiosDeHospedagem = meiosDeOspedagem;
	}
	
	//Metodo get e set para estado
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//Metodo get e set para estado
	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}
}
