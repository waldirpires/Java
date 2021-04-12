package aula.modulo3;

public class Leao extends Felino{

	public Leao(String imagem, String alimento, boolean comFome, String localizacao) {
		super(imagem, alimento, comFome, localizacao);
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Leão Ruge");
	}

	@Override
	public void comer() {
		System.out.println("Comendo como um leão");
	
	}
	
	
}
