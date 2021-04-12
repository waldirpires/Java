package lambdas;

public class CalTeste {

	public static void main(String[] args) {
	Calculo calc = new Soma();
	System.out.println(calc.excecutar(32, 15));
	calc = new Multiplicar();
	System.out.println(calc.excecutar(32, 15));
	
	}

}
