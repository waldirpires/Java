package lambdas;

import java.util.function.Function;

public class Funcao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Function <Integer,String> parOuImpar = num -> num % 2 == 0 ? "par" : "impar";
		System.out.println(parOuImpar.apply(32));
		Function <String,String> oResultadoE = result -> "O resultado é: "+ result;
		Function <String,String> fodas = f -> f + " Meu ovo";
		System.out.println(oResultadoE.apply(parOuImpar.apply(32))); 
		//chama um depois chama outro "andThen";
		//aqui funciona porque o retorno é igual, uma string, e recebem valores diferentes; 
		String resultF = parOuImpar
				.andThen(oResultadoE)
				.andThen(fodas)
				.apply(25); 
		System.out.println(resultF);
		
	}

}
