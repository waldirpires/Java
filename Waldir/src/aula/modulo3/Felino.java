package aula.modulo3;

public abstract class Felino extends Animal {

	public Felino(String imagem, String alimento, boolean comFome, String localizacao) {
		super(imagem, alimento, comFome, localizacao);
	
	}

	public abstract void fazerBarulho();
	public abstract void comer();
	
	public  void andar() {
		System.out.println("Um felino andando......");
	}
	
}
