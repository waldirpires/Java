
public class TestePontos {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo(0, 0, 2, 2, 5,5);
		Ponto ponto = new Ponto(0, 0);
		Quadrado qua = new Quadrado(0, 0, 2, 2, 5,5,7,8);
		Reta reta = new Reta(0, 0, 2, 2, 5,5);
		System.out.println(tri);
		System.out.println(qua);
		System.out.println(reta);
		System.out.println(ponto);
	}

}
