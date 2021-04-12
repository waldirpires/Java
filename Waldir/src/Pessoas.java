import java.util.ArrayList;
import java.util.List;

public class Pessoas  {
	private String nome; 
	private String cpf;
	private String data;
	private double getPeso; 
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}

	public String getData() {
		return data;
	}


	public double getPeso() {
		return getPeso;
	}



	static int qnt;
	public  Pessoas(String nome,String cpf,String data,double peso) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.data=data;
		this.getPeso = peso;
	    qnt++;
	}
		
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(getPeso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoas other = (Pessoas) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(getPeso) != Double.doubleToLongBits(other.getPeso))
			return false;
		return true;
	}



	public String toString() {
		return "Nome: "+nome+"| cpf: "+cpf+"| data: "+data+"| peso: "+getPeso;
	}
	
	
}
