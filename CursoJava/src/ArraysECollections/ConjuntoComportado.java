package ArraysECollections;

import java.util.*;

public class ConjuntoComportado {

	public static void main(String[] args) {
		SortedSet <String> Lista = new TreeSet <>();
		Lista.add("Meu Ovo");
		Lista.add("Essa aula ta melhor que na faculdade");
		Lista.add("Esse professor bahiano fala muito devagar");
		Lista.add("Drogradasso");
		System.out.println(Lista);
		for(String candidato : Lista) {
			System.out.println(candidato);
		}
		SortedSet <Integer> num = new TreeSet <>();
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(5);
		System.out.println(num);		
	}

}
