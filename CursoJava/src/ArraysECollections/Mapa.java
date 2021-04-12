package ArraysECollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer,String> User = new HashMap<>();
		User.put(1, "Jubileu"); //Metodo utilizado para adicionar, tem que ser passados os dois parâmetros;
		User.put(1, "Melo"); //Tambem altera, ou seja,
		User.put(2, "Teixeira"); //Tambem altera, ou seja,
		User.put(3, "Frango"); //Tambem altera, ou seja,
		//como existe um id existente 1 ele substitui o valor do segundo parametro;
		System.out.println(User.size());
		System.out.println(User);
		System.out.println(User.keySet()); //Pega toda a coluna de chaves
		System.out.println(User.values()); // pega toda a coluna de valores
		System.out.println(User.entrySet()); //Pega as duas colunas
		System.out.println(User.get(2));
		
		for(Entry<Integer,String> registro : User.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());			
		}		
		User.remove(1); //Remove a partir da chave
		User.remove(1,"Melo"); //remove se a chave bater com o valor 
		User.remove(3,"Teixeira");
		System.out.println(User);
	}

}
