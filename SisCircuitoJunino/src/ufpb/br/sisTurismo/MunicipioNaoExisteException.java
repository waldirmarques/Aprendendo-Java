package ufpb.br.sisTurismo;

public class MunicipioNaoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	public MunicipioNaoExisteException(String msgErro) {
		super(msgErro);
	}
	
	public MunicipioNaoExisteException() {
		this("Erro: Não existe atrativo tristico");
	}

}
