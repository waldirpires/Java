package OrOb.polimorfismo;

public class pessoa {
	private double peso;

	public pessoa(double peso) {
		setPeso(peso);
		getPeso();
	}
	
	public void comer(Comida com) {
		this.peso += com.getPeso();	
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0)
		this.peso = peso;
	}
}
