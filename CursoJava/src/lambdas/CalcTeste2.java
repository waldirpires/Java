package lambdas;

public class CalcTeste2 {
	//funciona apenas com Interfaces Funcionais 
	public static void main(String[] args) {
		Calculo soma = (x,y)-> {
			return x+y;
		};
		System.out.println(soma.excecutar(25, 85));
		soma = (x,y) -> x*y;
		System.out.println(soma.excecutar(25, 85));
		
	}

}
