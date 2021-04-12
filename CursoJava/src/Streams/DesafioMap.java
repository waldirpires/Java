package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	// transformar inteiro em String e binário
	//Inverter a String
	//tranformar a invertida em inteiro 
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Consumer<Object> print= System.out::println;
		UnaryOperator<String> girar = n ->{
			int a = n.length();
			String c="";
			for(int b=0;b<a;b++) {
				c=n.charAt(b)+c;
			}
			return c;
		};
		/*
		   Formas Mais Simples de Girar Uma cadeia de String 
		   UnaryOperator<String> virar2 =
				t -> new StringBuilder(t).reverse().toString();
		*/
		
		/*
		   Forma mais Facil de Converter de binário para decimal
		   Function<String,Double> Conversor = 
				s ->  Integer.parseInt(s,2);
		*/
		
		Function<String, Double> TranfD = p ->{
			int test= p.length();
			double cont=0.0,r=0.0;
			for(int b=0;b<test;b++) {
				char t=p.charAt(test-(b+1));
				if( t == '1') {
					r += 1 * Math.pow(2,cont);
					
				} 
				if(t == '0') {
					r += 0* Math.pow(2, cont);
				}
					
				cont=cont+1;
				
			}
			return r;
		};
		
		nums.stream().map(Integer::toBinaryString).forEach(System.out::println);
		System.out.println();
		nums.stream().map(Integer::toBinaryString).map(TranfD).forEach(System.out::println);;
		
		
	}

}
