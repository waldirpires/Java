package ArraysECollections;

import java.util.*;



public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //converte automatico de double -> Double
		conjunto.add(true); 
		conjunto.add(15); // Converte sozinho de int -> Integer
		conjunto.add("Foda-se");
		conjunto.add("Foda-se");
		conjunto.remove("Foda-se");
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains(15));
	
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		conjunto.addAll(nums); //união entre dois conjuntos
		System.out.println(conjunto);
		conjunto.retainAll(nums); //Intercessão
		System.out.println(conjunto);
	}

}
