package OrOb.encapsulamento;

public class Pessoa {
	private String nome; 
	private int idade;
	//Getter
	public int getIdade() {
		return idade; 
	}
	//Setter
	public void setIdade(int novaIdade) {
		if(novaIdade<=120)
		this.idade = Math.abs(novaIdade);
					
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
