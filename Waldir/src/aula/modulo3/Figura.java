package aula.modulo3;

public abstract class Figura {
	private String nome;

	public Figura(String nome) {
		this.nome = nome;
	}
	
	public abstract float area();
	
	public abstract float perimetro();
	
}
