package ufpb.br.sisTurismo;

import java.io.Serializable;

public class Praia extends AtrativoNatural implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private boolean perigoTubarao;
	private boolean propriaParaBanho;
	private String tipoDeOrla;
	
	public Praia(String nome,double latitude, double longitude,String comoChegar, String site, String infoContato,boolean perigoTubarao,boolean propriaParaBanho,String tipoDeOrla) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
		this.perigoTubarao = perigoTubarao;
		this.propriaParaBanho = propriaParaBanho;
		this.tipoDeOrla = tipoDeOrla;
		
	}
	
	public static final String TIPO_MAR_ABERTO = "Mar aberto";	
	public static final String TIPO_PEQUENAS_ONDAS = "Pequenas ondas";
	public static final String TIPO_MAR_ABRIGADO = "Mar Abrigado";
	public static final String TIPO_ONDAS_MEDIAS = "Ondas medias";
	public static final String TIPO_PISCINAS_NATURAIS = "Pescinas Naturais";
	public static final String TIPO_ONDAS_FORTES = "Ondas Fortes";
	
	
	public String getDescricao() {
		return "\nEvento Natural - Praia\n\n"+
				"Nome Evento Natural: "+this.getNome()+ 
				"\nLatitude: "+super.getLatitude()+ 
				"\nLongitude: "+super.getLongitude()+ 
				"\nComo chegar: "+super.getComoChegar()+ 
				"\nSite: "+super.getSite()+
				"\nPerigo de Tubarão: "+this.perigoTubarao+
				"\nPraia Propria para banho: "+this.propriaParaBanho+
				"\nTipo de Orla da Praia: "+this.tipoDeOrla;
	}
	
	//Metodo get e set para perigo Tubarao
	public boolean getPerigoTubarao() {
		return this.perigoTubarao;
	}
	public void setPerigoTubarao(boolean perigoTubarao) {
		this.perigoTubarao = perigoTubarao;
	}
	
	//Metodo get e set para propriaParaBainho
	public boolean getPropriaParaBanho() {
		return this.propriaParaBanho;
	}
	public void setPropriaParaBanho(boolean propriaParaBanho) {
		this.propriaParaBanho = propriaParaBanho;
	}
	
	//Metodo get e set para tipoDeOrla
	public String getTipoDeOrla() {
		return this.tipoDeOrla;
	}
	public void setTipoDeOrla(String tipoDeOrla) {
		this.tipoDeOrla = tipoDeOrla;
	}
	
	public String getType() {
		return "Praia";
	}
	
}
