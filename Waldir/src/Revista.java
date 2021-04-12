import java.util.ArrayList;
import java.util.List;

public class Revista {
	String id;
	String nome;
	
	List<Artigo> artigos = new ArrayList<>();

	
	public Revista(String id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}

	boolean adcionarArtigo(Artigo r) {
		boolean res = false;	
			for(Artigo temp : artigos) {
				if(temp.id == r.id) {
					res=true;
				}		
			}
			if(res != true) {
				artigos.add(r);
			return true;
			}
			
		return false;
	}

	void exibiArtigos() {
		System.out.print("--------------------------------------");
		System.out.print("\nArtigos da revista "+nome);
		for(Artigo temp : artigos) {	
			System.out.print("\nArtigo: "+temp );
		}
		System.out.println("\n---------------------------------------");
	}
		
		
	public String toString() {
		return nome;
		
	}
}
