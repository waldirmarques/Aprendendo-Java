package ufpb.br.sisTurismo;

public class MunicipioJaExisteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MunicipioJaExisteException(String msgErro) {
		super(msgErro);
	}	
	public MunicipioJaExisteException() {
		this("Erro: municipio já existe.");
	}
	
		
}
