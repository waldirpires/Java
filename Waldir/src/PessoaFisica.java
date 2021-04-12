
public class PessoaFisica extends Correntista2{
	private final String cpf;
	PessoaFisica(String nome, String cidade, String telefone,String cpf){
		super(nome,cidade,telefone);
		this.cpf = cpf;
	}
	
	protected String obterTaxa() {
		return "para pessoa Fisica, taxa obtida de 1,8%" ;
	}
	
	
}
