package aula.modulo3;

public class Quadrado extends Figura {
	private float lado;

	public Quadrado(String nome,float lado) {
		super(nome);
		this.lado = lado;
	}

	
	public float area() {
		return lado*lado;
	}

	@Override
	public float perimetro() {
		return 4*lado;
	}
	
	public String toString() {
		System.out.println("Perimeto: "+ perimetro());
		return "Area: "+ area();
	}
	
}
