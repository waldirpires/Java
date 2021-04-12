package aula.modulo3;

public class Tigre extends Felino{

	public Tigre(String imagem, String alimento, boolean comFome, String localizacao) {
		super(imagem, alimento, comFome, localizacao);
		// TODO Auto-generated constructor stub
	}

	
	public void fazerBarulho() {
		System.out.println("Tigre rugindo");
	}

	
	public void comer() {
		System.out.println("Tigre Comendo");
	}
	
}
