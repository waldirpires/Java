package lambdas;

import java.util.function.BinaryOperator;

public class CalcTeste3 {
	public static void main(String[] args) {
		//funciona apenas com Interfaces Funcionais 
		//Utiliza as funções de interface já criadas pelo proprio java
		BinaryOperator<Double> soma = (x,y)-> {
			return x+y;
		};
		System.out.println(soma.apply(25.0, 85.0));
		soma = (x,y) -> x*y;
		System.out.println(soma.apply(25.0, 85.0));
		
	}

}
