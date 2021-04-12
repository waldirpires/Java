
public class Artigo {
	String id;
	String autor;
	String conteudo;
	String data;
	public Artigo(String id, String autor, String conteudo, String data) {
		this.id = id;
		this.autor = autor;
		this.conteudo = conteudo;
		this.data = data;
	}
	
	void obterTamanho() {	
		System.out.println("O texto tem: "+ conteudo.replace(" ", "").length()+" caracteres de tamanho.");
	}
	
	public String toString() {
		return conteudo;	
	}	
}

