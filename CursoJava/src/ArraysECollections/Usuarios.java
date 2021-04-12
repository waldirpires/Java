package ArraysECollections;

public class Usuarios {

		String nome;
		String email;
		
		public boolean equals(Object obj) {
		
			//O objeto passado � um instancia de usu�rio? "Palavra instanceof significa isso		
			if(obj instanceof Usuarios) { 
			//Mesmo conceito de casting, converto o objeto para o tipo usu�rio	
			Usuarios outro = (Usuarios) obj;	
			boolean In = outro.nome.equals(this.nome);
			boolean Ie = outro.email.equals(this.email);
			
			return In && Ie;
			}
			else {
			return false;
			}
		}
	}


