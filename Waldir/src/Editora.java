import java.util.ArrayList;
import java.util.List;

public class Editora {
	private String id;
	private String nome;
	private String endereco;
	
	List<Revista> revistas = new ArrayList<>();

	public Editora(String id, String nome, String endereco) {
	
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	
	}
	
	boolean adcionarRevista(Revista r) {
		boolean res = false;	
			for(Revista temp : revistas) {
				if(temp.nome == r.nome) {
					res=true;
				}		
			}
			if(res != true) {
				revistas.add(r);
			return true;
			}
			
		return false;
	}
	
	
	void exibiRevistas() {
		System.out.println("-----------------------------------");
		System.out.println("Editora: "+nome);
		for(Revista temp : revistas) {	
			System.out.println("Revista: "+temp);
		}
		System.out.println("-----------------------------------");
	}
}
