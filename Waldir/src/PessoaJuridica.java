
public class PessoaJuridica extends Correntista2 {
	private final String cnpj;
	PessoaJuridica(String nome, String cidade, String telefone,String cnpj){
		super(nome,cidade,telefone);
		this.cnpj = cnpj;
	}
	
	protected String obterTaxa() {
		return "para pessoa juridica, taxa obtida de 2,2%" ;
	}
		
}

