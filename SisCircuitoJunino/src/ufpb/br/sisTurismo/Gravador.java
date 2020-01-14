package ufpb.br.sisTurismo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gravador{
		
		//Metodo que recupera municípios do arquivo
		public List<Municipio> recuperaMunicipio(String nomeArquivo) throws IOException {    
			BufferedReader leitor = null;
	        List<Municipio> municipios = new ArrayList<Municipio>();
			try {
				leitor = new BufferedReader(new FileReader(nomeArquivo));
				String texto = null;
				do {
					texto = leitor.readLine(); // lê a próxima linha do arquivo
					
					if (texto != null){
						int quantidadeMunicipio = Integer.parseInt(texto);
	                    
						for(int k = 0; k < quantidadeMunicipio;k++) {
							String nomeMum = leitor.readLine();
							int populacao = Integer.parseInt(leitor.readLine());
							double latitudeMum = Double.parseDouble(leitor.readLine());
							double longitudeMum = Double.parseDouble(leitor.readLine());
							String estadoMum = leitor.readLine();	
							String siteMum = leitor.readLine();
							Municipio novoMum = new Municipio(nomeMum, populacao, latitudeMum, longitudeMum,estadoMum, siteMum);
							municipios.add(novoMum);
							
						}
	                }
				} while(texto != null); //vai ser null quando chegar no fim do arquivo
			} finally {
				if (leitor!=null){
					leitor.close(); //fecha o stream(fluxo) de leitura
				}
			}
			return municipios;
		}
		//Metodo de gravar municipio no arquivo
		public void gravaMunicipio(List<Municipio> municipios, String nomeArquivo) throws IOException {
			BufferedWriter gravador = null;
			try {
				gravador = new BufferedWriter(new FileWriter(nomeArquivo));
				gravador.write(Integer.toString(municipios.size())+"\n");
	            
				for(Municipio municipi: municipios) {
		            gravador.write(municipi.getNome()+"\n");
		            gravador.write(municipi.getPopulacao()+"\n");
		            String latitude = Double.toString(municipi.getLatitude());	
	            	gravador.write(latitude+"\n");
	            	String longitude = Double.toString(municipi.getLongitude());
	            	gravador.write(longitude+"\n");
		            gravador.write(municipi.getEstado()+"\n");
	            	gravador.write(municipi.getSite()+"\n");
	            }
			} finally {
				if (gravador!=null){
					gravador.close(); //fecha o stream(fluxo) de escrita
				}
			}
		}
		
		//Metodo de recuperar atrativo turistico no arquivo sendo ele generico
		public List<AtrativoTuristico> recuperarAtrativoTuristico(String nomeArquivo) throws IOException{
			BufferedReader leitor = null;
		    List<AtrativoTuristico> atrativos = new ArrayList<AtrativoTuristico>();
			try {
				leitor = new BufferedReader(new FileReader(nomeArquivo));
				String texto = null;
				do {
					texto = leitor.readLine(); // lê a próxima linha do arquivo
						
					if (texto != null){
						
						int quantidadeAtrativoTuristico = Integer.parseInt(texto);                
						
						for(int k = 0; k < quantidadeAtrativoTuristico;k++) {
							String type = leitor.readLine();
							String nomeAtra = leitor.readLine();
							double latitudeAtra = Double.parseDouble(leitor.readLine());
							double longitudeAtra = Double.parseDouble(leitor.readLine());
							String comoChegarAtra = leitor.readLine();
							String site = leitor.readLine();
							String infoContatoAtra = leitor.readLine();
							AtrativoNatural novoAtrativo = new AtrativoNatural(nomeAtra,latitudeAtra,longitudeAtra,comoChegarAtra,site,infoContatoAtra);
							if(type.equals("Praia")) {
								boolean perigoTu = Boolean.parseBoolean(leitor.readLine());
								boolean propriaBan = Boolean.parseBoolean(leitor.readLine());
								String tipoOrla = leitor.readLine();
								Praia novaPraia = new Praia(nomeAtra, latitudeAtra, longitudeAtra, comoChegarAtra, site, infoContatoAtra, perigoTu, propriaBan, tipoOrla);
								atrativos.add(novaPraia);
							}else if(type.equals("Evento Programado")) {
								String dataInicio = leitor.readLine();
								String dataFim = leitor.readLine();
								String tipo = leitor.readLine();
								String logradouro = leitor.readLine();
								String numero = leitor.readLine();
								String bairro = leitor.readLine();
								Endereco nEndereco = new Endereco(logradouro,numero,bairro);
								EventoProgramado eventos = new EventoProgramado(nomeAtra, latitudeAtra, longitudeAtra, comoChegarAtra, site, infoContatoAtra, dataInicio, dataFim, tipo, nEndereco);
								atrativos.add(eventos);
							}
							atrativos.add(novoAtrativo);		
						}
		            }
					
				} while(texto != null); //vai ser null quando chegar no fim do arquivo
			} finally {
				if (leitor!=null){
					leitor.close(); //fecha o stream(fluxo) de leitura
				}
			}
			return atrativos;
		}
		
		//Metodo de gravar atrativo turistico no arquivo sendo ele generico
		public void gravaAtrativoTuristico(List<AtrativoTuristico> atrativos,String nomeArquivo) throws IOException {
			BufferedWriter gravador = null;
			try {
				gravador = new BufferedWriter(new FileWriter(nomeArquivo));
				gravador.write(Integer.toString(atrativos.size())+"\n");
					for (AtrativoTuristico atra: atrativos ){
						gravador.write(atra.getType()+"\n");
						gravador.write(atra.getNome()+"\n");
						String latitude = Double.toString(atra.getLatitude());
						String longitude = Double.toString(atra.getLatitude());
						gravador.write(latitude+"\n");
						gravador.write(longitude+"\n");
						gravador.write(atra.getComoChegar()+"\n");
						gravador.write(atra.getSite()+"\n");
						gravador.write(atra.getInfoContato()+"\n");
						if(atra.getType().equals("Praia")) { //tipo praia		
							Praia atrativoP = (Praia) atra;
							String perigoTubarao = Boolean.toString(atrativoP.getPerigoTubarao());
							String propriaPraBanho = Boolean.toString(atrativoP.getPropriaParaBanho());
							gravador.write(perigoTubarao+"\n");
							gravador.write(propriaPraBanho+"\n");
							gravador.write(atrativoP.getTipoDeOrla()+"\n");
						
						}else if(atra.getType().equals("Evento Programado")) { //tipo evento programado
							EventoProgramado eventoP = (EventoProgramado) atra;
							gravador.write(eventoP.getDataInicial()+"\n");
							gravador.write(eventoP.getDataFim()+"\n");
							gravador.write(eventoP.getTipo()+"\n");
							gravador.write(eventoP.getEndereco().getLogradouro()+"\n");
							gravador.write(eventoP.getEndereco().getNumero()+"\n");
							gravador.write(eventoP.getEndereco().getBairro()+"\n");
						}
					}          	
	            
			} finally {
				if (gravador!=null){
					gravador.close(); //fecha o stream(fluxo) de escrita
				}
			}
		}

}
