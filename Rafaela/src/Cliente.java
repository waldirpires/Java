import java.io.Serializable;

public class Cliente implements Serializable  {
	private String nome;
	private String sexo;
	
	private static final long serialVersionUID = 1L;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + "]";
	}
	
	
}
