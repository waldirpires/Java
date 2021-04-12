
public class Correntista2 {
	protected final String nome;
	protected final String cidade;
	protected final String telefone;
	
	public Correntista2(String nome, String cidade, String telefone) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
	}
	
	

	protected String obterTaxa() {
		return "taxa obtida de 0,2%";
	}



	public String getNome() {
		return nome;
	}



	public String getCidade() {
		return cidade;
	}



	public String getTelefone() {
		return telefone;
	}
	
	
}
