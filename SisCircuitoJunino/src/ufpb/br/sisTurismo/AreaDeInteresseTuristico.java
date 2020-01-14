package ufpb.br.sisTurismo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AreaDeInteresseTuristico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Municipio> municipios;
	private String nome;
	
	public AreaDeInteresseTuristico(List<Municipio> municipios, String nome) {
		this.municipios = municipios;
		this.nome = nome;
	}
	
	public AreaDeInteresseTuristico(String nome) {
		this(new ArrayList <Municipio>() , nome);
	}
	
	//Metodo cadastrar municipio com exception como tratamento de erros
	public void cadastrarMunicipio(Municipio mum) throws MunicipioJaExisteException {	
		for(Municipio m : this.municipios) {
			if(m.getNome().equals(mum.getNome())) {
				throw(new MunicipioJaExisteException("Já existe municipio com o nome "+mum.getNome()));
			}
		}	
		this.municipios.add(mum);				
	}
	
	//Metodo Que pesquisa municipio com exception para os erros
	public Municipio pesquisarMunicipio(String mum) throws MunicipioNaoExisteException {		
		for(Municipio m: this.municipios) {
			if(m.getNome().equals(mum)) {
				return m;
			}
		}
		throw new MunicipioNaoExisteException();
	}

	public void cadastrarAtrativoTuristico(AtrativoTuristico atrativo, String nomeMunicipio, String estadoMunicipio) throws MunicipioNaoExisteException, AtrativoJaExisteException  {
		boolean ok = false;
		
		for(Municipio m : this.municipios) {
			if(m.getNome().equals(nomeMunicipio) && m.getEstado().equals(estadoMunicipio)) {
				try {
					m.cadastrarAtrativoTuristico(atrativo);
					ok = true;
				}catch(AtrativoJaExisteException e) {
					throw new AtrativoJaExisteException("Erro: Atrativo Turistico já existe");
				}
			}
		}
		if(!ok) {
			throw new MunicipioNaoExisteException("Erro: Municipio não existe");
		}
			
	}
	
	public List<AtrativoTuristico> getAtrativosTuristicosDoMunicipio(String nomeMunicipio, String estadoMunicipio) throws MunicipioNaoExisteException{
		for(Municipio m : this.municipios) {
			if(m.getNome().equals(nomeMunicipio) && m.getEstado().equals(estadoMunicipio)) {
				return m.getAtrativosTuristicos();
			}
		}
		 throw new MunicipioNaoExisteException("Erro: Municipio não existe");
	}
	
	//Metodo get e set para nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodo get e set para Municipios
	public List<Municipio> getMunicipios(){
		return this.municipios;
	}
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
}
