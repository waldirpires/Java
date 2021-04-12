package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print= System.out::println;
		Stream<String> langs = Stream.of("java","Lua","Java Script");
		langs.forEach(print);
		System.out.println();
		String[] maisLangs = {"C++","Phyton","Go"};
		Stream.of(maisLangs).forEach(print);
		System.out.println();		
		Arrays.stream(maisLangs).forEach(print);
		System.out.println();
		Arrays.stream(maisLangs,0,3).forEach(print); //pega os elementos entre o indice 0 e 3; 
		System.out.println();
		List<String> outrasLangs = Arrays.asList("C","PHP");
		outrasLangs.stream().forEach(print);
		System.out.println();
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print); geração infinita de string
		// Stream.iterate(0, n -> n+1).forEach(print); De numeros
	}

}
