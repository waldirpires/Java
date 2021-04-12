package aula.modulo3;

public class Circulo extends Figura {
	private final float Pi = (float) 3.14;
	private  float r;

	public Circulo(String nome,float r) {
		super(nome);
		this.r = r;
	}

	@Override
	public float area() {
		
		return Pi*(r*r);
	}

	@Override
	public float perimetro() {
		
		return 2*Pi*r;
	}
	
	public String toString() {
		System.out.println("Perimeto: "+ perimetro());
		return "Area: "+ area();
	}
	
}
