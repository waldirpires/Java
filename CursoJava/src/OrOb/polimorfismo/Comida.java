package OrOb.polimorfismo;

public class Comida {
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
		getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
