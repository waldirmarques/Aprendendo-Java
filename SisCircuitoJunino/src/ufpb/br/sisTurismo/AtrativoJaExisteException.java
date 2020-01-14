package ufpb.br.sisTurismo;

public class AtrativoJaExisteException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AtrativoJaExisteException(String msgErro) {
		super(msgErro);
	}
	
	public AtrativoJaExisteException() {
		this("Erro: Já existe Atrativo turistico");
	}

}
