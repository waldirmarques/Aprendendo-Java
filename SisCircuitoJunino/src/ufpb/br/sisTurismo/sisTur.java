package ufpb.br.sisTurismo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class sisTur {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		List<Municipio> municipios = new ArrayList<Municipio>();
		AreaDeInteresseTuristico AreasDeInteresse = new AreaDeInteresseTuristico(municipios,"Brejo");
		Gravador gravador = new Gravador();
		JOptionPane.showMessageDialog(null,"Bem vindo ao Sistema de turismo do Brejo\n\n");
		boolean opcao = true;
		while(opcao) {
			String entrada = InputString("Escolha uma das opções:\n\n1 - Cadastrar Municipio\n"
					+ "2 - Cadastrar Atrativo Turistico\n"
					+ "3 - Listar Municipios\n"
					+ "4 - Listar Atrativo de determinado Municipios\n"
					+ "5 - Recuperar Municipios\n"
					+ "6 - Recuperar  eventos cadastrados\n"
					+ "7 - Sair",leitor);	
			switch(entrada) {		
				case "1":
					JOptionPane.showMessageDialog(null,"Para cadastrar um Município informe os seguintes dados!\n ");
					String nomeMunicipio = InputString("Informe nome do Municipio: ",leitor);
					int populacaoMunicipio = InputInt("Informe população do Municipio: ",leitor);
					double latitudeMunicipio = InputDouble("Informe latitude do Municipio: ",leitor);
					double longitudeMunicipio = InputDouble("Informe longitude do Municipio: ",leitor);
					String estadoMunicipio = InputString("Informe estado do Municipio: ",leitor);
					String siteMunicipio = InputString("Informe site do Municipio: ",leitor);					
					List<AtrativoTuristico> atrativos = new ArrayList<AtrativoTuristico>();
					List<MeioDeHospedagem> meiosDeHospedagem = new ArrayList<MeioDeHospedagem>();										
					Municipio novoMunicipio = new Municipio(nomeMunicipio,populacaoMunicipio,meiosDeHospedagem,atrativos,latitudeMunicipio,longitudeMunicipio,estadoMunicipio,siteMunicipio);					
					try{
						AreasDeInteresse.cadastrarMunicipio(novoMunicipio);
						List<Municipio> mun = AreasDeInteresse.getMunicipios();
						gravador.gravaMunicipio(mun, "MunicipiosGravados");
						
						JOptionPane.showMessageDialog(null,"Municipio Cadastrado com sucesso");
					}catch(MunicipioJaExisteException e) {
						JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage()+"\n\n\n");
					}catch(IOException e){
						JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage()+"\n\n\n");
					}		
					break;
				
				case "2":
					JOptionPane.showMessageDialog(null,"Para cadastrar um Atrativo Turistico informe os seguintes dados");
					String nomeMunicipioPesquisa = InputString("Informe nome do Municipio do Atrativo Turistico: ",leitor);
					try {					
						String nomeAtrativoTuristico = InputString("Informe nome do Atrativo Turistico: ",leitor);
						double latitudeAtrativoTuristico = InputDouble("Informe latitude do Atrativo Turistico: ",leitor);
						double longitudeAtrativoturistico = InputDouble("Informe longitude do Atrativo Turistico: ",leitor);
						String comoChegarAtrativoTuristico = InputString("Informe como chegar no Atrativo Turistico: ",leitor);
						String siteAtrativoTuristico = InputString("Informe site do Atrativo Turistico: ",leitor);
						String infoContatoAtrativoTuristico = InputString("Informe informações do Contato para o Atrativo Turistico: ",leitor);						
						
						String tipoAtrativo = InputString("Informe tipo do atrativo Turistico:\nAtrativo Natural | Evento Programado!",leitor);
						
						AtrativoTuristico novoAtrativo = new AtrativoNatural(nomeAtrativoTuristico,latitudeAtrativoTuristico,longitudeAtrativoturistico,comoChegarAtrativoTuristico,siteAtrativoTuristico,infoContatoAtrativoTuristico);						
						Municipio novaArea = AreasDeInteresse.pesquisarMunicipio(nomeMunicipioPesquisa);
						
						if(tipoAtrativo.equals("Atrativo Natural")) {						
							String praia = InputString("Evento natural:\nPraia | Generico ",leitor);
							if(praia.equals("Generico")) {					
								try{
									novaArea.cadastrarAtrativoTuristico(novoAtrativo);  //cadastrarAtrativoTuristico(novoAtrativo,nomeMunicipioPesquisa,nomeEstadoAtrativo);
									List<AtrativoTuristico> mun = novaArea.getAtrativosTuristicos();
									gravador.gravaAtrativoTuristico(mun,"AtrativosGenericosGravados");
									JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
									break;
								}catch(AtrativoJaExisteException e) {
									JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
								} catch (IOException e) {
									JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage()+"\n\n\n");
								}						
							
							}else if(praia.equals("Praia")){							
								String perigoT = InputString("Informe se existe perigo de tubarão:\nsim | não ",leitor);
								String propriaB = InputString("Informe se a praia é ou não propria para banho:\nsim |não ",leitor);					
								boolean perigoTubarao = RetornoPerigo(perigoT);
								boolean perigoBanho = RetornoPerigo(propriaB);
								String tipoOrla = InputString("Informe tipo de orla da praia: ",leitor);
								Praia novaPraia = new Praia(nomeMunicipioPesquisa,latitudeAtrativoTuristico,longitudeAtrativoturistico,comoChegarAtrativoTuristico,siteAtrativoTuristico,infoContatoAtrativoTuristico,perigoTubarao,perigoBanho,tipoOrla);							
								try {
									novaArea.cadastrarAtrativoTuristico(novaPraia);
									List<AtrativoTuristico> pra = novaArea.getAtrativosTuristicos();
									gravador.gravaAtrativoTuristico(pra, "AtraticosPraiaGravados");
									JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
									break;
								}catch(AtrativoJaExisteException e) {
									JOptionPane.showMessageDialog(null,"Erro: Atrativo já existe");
								} catch (IOException e) {
									JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage()+"\n\n\n");
								}								
							}					
						}else if(tipoAtrativo.equals("Evento Programado")) {
							String dataInicio = InputString("Informe data de inicio do evento programado: ",leitor);
							String dataFim = InputString("Informe data do fim do evento Programado: ",leitor);
							String tipo = InputString("Informe tipo do evento programado: ",leitor);
							String logradouro = InputString("Informe logradouro para o Endereço: ",leitor);
							String numero = InputString("Informe número para Endereço: ",leitor);
							String bairro = InputString("Informe bairro para o Endereço: ",leitor);							
							Endereco novoEndereco = new Endereco(logradouro,numero,bairro);						
							AtrativoTuristico Atrativo = new EventoProgramado(nomeAtrativoTuristico,latitudeAtrativoTuristico,longitudeAtrativoturistico,comoChegarAtrativoTuristico,siteAtrativoTuristico,infoContatoAtrativoTuristico,dataInicio,dataFim,tipo,novoEndereco);
							try{
								novaArea.cadastrarAtrativoTuristico(Atrativo);
								List<AtrativoTuristico> event = novaArea.getAtrativosTuristicos();
								gravador.gravaAtrativoTuristico(event, "AtrativosProgramadosGravados");
								JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
								break;
							}catch(AtrativoJaExisteException e) {
								JOptionPane.showMessageDialog(null,"Erro: Atrativo já existe");
							} catch (IOException e) {
								JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage()+"\n\n\n");
							}
						}else {
							JOptionPane.showMessageDialog(null,"Tipo de Evento não suportado!");
						}			
					}catch(MunicipioNaoExisteException e) {
						JOptionPane.showMessageDialog(null,e.getMessage()+" com esse nome de municipio e estado");				
					}				
					break;
				case "3":
					List<Municipio> listaMunicipio = AreasDeInteresse.getMunicipios();
					String listaString = "Municipios cadastrados: \n";
					for(Municipio m: listaMunicipio) {
						listaString += m.getNome()+"\n";
					}
					JOptionPane.showMessageDialog(null,listaString);
					break;
					
				case "4":
					String nomePesquisarMunicipio = InputString("Informe nome do Municipio para listagem: ",leitor);
					String estadoPesquisar = InputString("Informe estado do Municipio "+nomePesquisarMunicipio,leitor);		
					try{
						List<AtrativoTuristico> atrativosLista = AreasDeInteresse.getAtrativosTuristicosDoMunicipio(nomePesquisarMunicipio, estadoPesquisar);	
						String print = "";
						for(AtrativoTuristico a: atrativosLista) {						
							print+="\n"+a.getDescricao();
						}
						JOptionPane.showMessageDialog(null,print);
					}catch(MunicipioNaoExisteException e) {
						JOptionPane.showMessageDialog(null,"Não existe atrativos turisticos nesse municipio");		
					}
					break;	
				
				case "5":
					try{
						List<Municipio> listaArquivos = gravador.recuperaMunicipio("MunicipiosGravados");
						AreasDeInteresse.setMunicipios(listaArquivos);
						JOptionPane.showMessageDialog(null,"Municípios recuperados com sucesso");
					}catch(IOException e) {
						JOptionPane.showMessageDialog(null,"Não existe municipio");		
					}
					
					break;
				case "6":
					String PesquisarMunicipio = InputString("Informe nome do Municipio para recuperar os dados: ",leitor);
					String tipoEvento = InputString("Informe tipo de evento para recuperação dos dados:\nAtrativo Natural | Evento Programado",leitor);
					if(tipoEvento.equals("Generico")) {
						try {
							List<AtrativoTuristico> listaArquivoAtrativo = gravador.recuperarAtrativoTuristico("AtrativosGenericosGravados");
							Municipio mum = AreasDeInteresse.pesquisarMunicipio(PesquisarMunicipio);
							mum.setAtrativosTuristicos(listaArquivoAtrativo);
							JOptionPane.showMessageDialog(null,"Eventos recuperados com sucesso");
						}catch (IOException e) {
							JOptionPane.showMessageDialog(null,"Não existe eventos");
						} catch (MunicipioNaoExisteException e) {
							JOptionPane.showMessageDialog(null,e.getMessage()+"\n\n\n");
						}
						break;
					
					}else if(tipoEvento.equals("Atrativo Natural")) {
						try {
							List<AtrativoTuristico> listaArquivoAtrativo = gravador.recuperarAtrativoTuristico("AtraticosPraiaGravados");
							Municipio mum = AreasDeInteresse.pesquisarMunicipio(PesquisarMunicipio);
							mum.setAtrativosTuristicos(listaArquivoAtrativo);
							JOptionPane.showMessageDialog(null,"Eventos recuperados com sucesso");
						}catch (IOException e) {
							JOptionPane.showMessageDialog(null,"Não existe eventos");
						} catch (MunicipioNaoExisteException e) {
							JOptionPane.showMessageDialog(null,e.getMessage()+"\n\n\n");
						}
						break;
					
					}else if(tipoEvento.equals("Evento Programado")) {
						try {
							List<AtrativoTuristico> listaArquivoAtrativo = gravador.recuperarAtrativoTuristico("AtrativosProgramadosGravados");
							Municipio mum = AreasDeInteresse.pesquisarMunicipio(PesquisarMunicipio);
							mum.setAtrativosTuristicos(listaArquivoAtrativo);
							JOptionPane.showMessageDialog(null,"Eventos recuperados com sucesso");
						}catch (IOException e) {
							JOptionPane.showMessageDialog(null,"Não existe eventos");
						} catch (MunicipioNaoExisteException e) {
							JOptionPane.showMessageDialog(null,e.getMessage()+"\n\n\n");
						}
						break;
					
					}else {
						JOptionPane.showMessageDialog(null,"Tipo de evento não suportado!");
					}
					break;
				case "7":
					JOptionPane.showMessageDialog(null,"VOLTE SEMPRE!");
					opcao = false;
					break;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Fim do Programa!");
		leitor.close();
	}
	
	public static String InputString(String variavel, Scanner leitor) {
		String entrada = JOptionPane.showInputDialog(null,variavel);
		return entrada;
	}

	public static double InputDouble(String variavel, Scanner leitor) {
		double entrada = Double.parseDouble(JOptionPane.showInputDialog(null,variavel));
		return entrada;
	}
	
	public static int InputInt(String variavel, Scanner leitor) {
		int entrada = Integer.parseInt(JOptionPane.showInputDialog(null,variavel));
		return entrada;
	}
	
	public static boolean RetornoPerigo(String perigo) {
		if(perigo.equals("sim")) {
			return true;
		}
		return false;
	}
}