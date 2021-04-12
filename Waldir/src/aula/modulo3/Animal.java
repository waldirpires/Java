package aula.modulo3;

public abstract class Animal {
	private String imagem;
	private String alimento;
	private boolean comFome;
	private String localizacao;
	
	public Animal(String imagem, String alimento, boolean comFome, String localizacao) {
		
		this.imagem = imagem;
		this.alimento = alimento;
		this.comFome = comFome;
		this.localizacao = localizacao;
	}
	public String toString() {
		return "Animal " + imagem + ", alimento " + alimento+", com fome? "+
	comFome+" localização: "+localizacao;
	}
	public abstract void fazerBarulho();
	public abstract void comer();
	public abstract void andar();
	
}
