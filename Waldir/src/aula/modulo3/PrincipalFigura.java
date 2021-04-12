package aula.modulo3;

public class PrincipalFigura {

	public static void main(String[] args) {
		Quadrado q = new Quadrado("Quadrado",3);
		Circulo c = new Circulo("Circulo",4);
		Retangulo r = new Retangulo("Retangulo",4,6);
		System.out.println(q);
		System.out.println();
		System.out.println(c);
		System.out.println();
		System.out.println(r);
	}

}
