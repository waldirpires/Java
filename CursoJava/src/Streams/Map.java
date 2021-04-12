package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Map {

	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		List<String> marcas = Arrays.asList("Gucci","Nike","Adidas");
		UnaryOperator<String> maior = m -> m.toUpperCase();
		//concatenação com String vazia pois a lambida
		//unaria so pode retornar valores iguals ao da entrada
		UnaryOperator<String> prime = m -> m.charAt(0)+"";
		UnaryOperator<String> grito = m -> m+"!!!!!";
		marcas.stream().map(prime).forEach(print); System.out.println();
		marcas.stream().map(maior).forEach(print); System.out.println();
		marcas.stream().map(grito).forEach(print); System.out.println();
		marcas.stream().map(maior).map(prime).map(grito).forEach(print);
	}

}
