package ufpb.br.sisTurismo;

public class AtrativoNaoExisteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AtrativoNaoExisteException(String msgErro) {
		super(msgErro);
	}
	
	public AtrativoNaoExisteException() {
		this("Erro: Não existe Atrativo Turistico");
	}
}
