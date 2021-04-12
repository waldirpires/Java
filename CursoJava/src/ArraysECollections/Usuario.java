package ArraysECollections;

public class Usuario {
	String nome;
	String email;
	Usuario (String nome){
		this.nome=nome;
	}
	public boolean equals(Object obj) {
	
		//O objeto passado � um instancia de usu�rio? "Palavra instanceof significa isso		
		if(obj instanceof Usuario) { 
		//Mesmo conceito de casting, converto o objeto para o tipo usu�rio	
		Usuario outro = (Usuario) obj;	
		boolean In = outro.nome.equals(this.nome);
		boolean Ie = outro.email.equals(this.email);
		
		return In && Ie;
		}
		else {
		return false;
		}
	}
}
