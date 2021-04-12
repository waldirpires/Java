package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
	BinaryOperator<Double> media = 
			(Double n,Double n2) -> (n + n2)/2;
	BiFunction<Double,Double , String> 	Resultado = (n1,n2) -> (n1+n2)/2 >= 6  ? "Aprovado" : "Reprovado";
	System.out.println(media.apply(5.8,4.3));
	System.out.println(Resultado.apply(5.82, 6.19));
	Function<Double, String> conceito = m ->
		m >= 6 ? "Bom aluno":"Aluno ruim";
	System.out.println(media.andThen(conceito).apply(7.0, 5.0));
	}
	
}
