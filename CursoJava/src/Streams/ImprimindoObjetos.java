package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import lambdas.Foreach;

@SuppressWarnings("unused")
public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovado = Arrays.asList("Lu","Gui","luca","Ana"); 
		System.out.println("Usando Foreach");
		for(String nome:aprovado) {
			System.out.println(nome);
		}
		System.out.println("\nUsando Iterator");
		Iterator<String> it = aprovado.iterator();
		while(it.hasNext()){ // o .hasNext significa tem proximo? , se tiver ele entra no while
			System.out.println(it.next());
		}
		System.out.println("Usando Stream");
		Stream<String> St =  aprovado.stream(); //Interface Stream, interação ocorre de forma interna;
		St.forEach(System.out::println); //A Stream por sí só ja tem a função forEach internamente. 
	}

}
