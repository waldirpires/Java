package OrOb.polimorfismo;

public class Jantar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		pessoa p1 = new pessoa(89.00);
		Comida arroz = new Arroz(0.250);
		Comida feijao = new Feijao(0.350);
		Comida sorvete = new Sorvete(1.250);
		p1.comer(sorvete);
		p1.comer(feijao);
		p1.comer(arroz);
		System.out.println(p1.getPeso());
	}

}
