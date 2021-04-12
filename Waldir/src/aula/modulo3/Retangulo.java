package aula.modulo3;

public class Retangulo extends Figura {
	private float lado1;
	private float lado2;
	public Retangulo(String nome,float lado1,float lado2) {
		super(nome);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public float area() {
		return lado1*lado2;
	}

	@Override
	public float perimetro() {
		return (2*lado1)+(2*lado2);
	}
	
	public String toString() {
		System.out.println("Perimeto: "+ perimetro());
		return "Area: "+ area();
	}
	
	
}
