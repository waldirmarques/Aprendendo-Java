package ufpb.br.sisTurismo;

import java.io.Serializable;

public class EventoProgramado extends AtrativoTuristico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String dataInicio;
	private String dataFim;
	private String tipo;
	private Endereco endereco;
	
	public static final String TIPO_FESTA = "";
	public static final String TIPO_FEIRA_GASTRONOMICA = "";
	
	public EventoProgramado(String nome,double latitude, double longitude,String comoChegar, String site, String infoContato, String dataInicio,String dataFim,String tipo,Endereco endereco) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.tipo = tipo;
		this.endereco = endereco;
	}
	

	//Get descrição que retornar os argumentos da class, equivalente ao toString.
	public String getDescricao() {
		return "\nEvento Programado\n\nNome Evento: "+this.getNome()+
				"\nLatitude: "+super.getLatitude()+
				"\nLongitude: "+super.getLongitude()+
				"\nComo chegar: "+super.getComoChegar()+
				"\nSite: "+super.getSite()+
				"\nData Inicio: "+this.dataInicio+
				"\nData Fim: "+this.dataFim+
				"\nTipo: "+this.tipo+
				"\nEndereco = "+this.endereco;
	}
	
	//Metodo get e set dataInicio
	public String getDataInicial() {
		return this.dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	//Metodo get e set dataFim
	public String getDataFim() {
		return this.dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	//Metodo get e set tipo
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodo get e set endereco
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getType() {
		return "Evento Programado";
	}

}
