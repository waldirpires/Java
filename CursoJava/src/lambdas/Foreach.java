package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class Foreach {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Anna","Bia","Melo","Gusttavo");
		System.out.println("Forma padrão");
		for(String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("\nLambda #1...");		
		lista.forEach((nome) -> {System.out.println(nome);});
		System.out.println("\nMethod Reference #1...");
		// passa uma refencia para
		//um metodo do ForEach com o println
		lista.forEach(System.out::println); 
		System.out.println("\nLambda #2...");		
		lista.forEach((nome) -> {meuImprimir(nome);});
		System.out.println("\nMethod Reference #2...");
		lista.forEach(Foreach::meuImprimir); 
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi Meu nome é "+nome);		
	}
	
}
