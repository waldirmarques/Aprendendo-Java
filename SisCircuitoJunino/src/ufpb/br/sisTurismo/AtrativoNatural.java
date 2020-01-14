package ufpb.br.sisTurismo;

import java.io.Serializable;

public class AtrativoNatural extends AtrativoTuristico implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public AtrativoNatural(String nome,double latitude, double longitude,String comoChegar, String site, String infoContato) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
	}
	
	@Override
	public String getDescricao() {
		return "\nAtrativo Natural\n\nNome: " + super.getNome() +
				"\nLatitude: " + super.getLatitude() +
				"\nLongitude: " + super.getLongitude() + 
				"\nComo chegar: " + super.getComoChegar();
	}

	@Override
	public String getType() {
		return "Atrativo Natural";
	}
}