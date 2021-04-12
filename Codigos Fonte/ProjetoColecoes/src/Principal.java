import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		List lista = new ArrayList();
		Animal animal = new Animal();	
		lista.add("Coelho");
		lista.add("Girafa");
		lista.add("Elefante");
		lista.add("Cachorro");
		lista.add("Gato");
					
		
		for(int i=0; i < lista.size(); i++) {
			animal.Comer(lista.get(i));
			animal.Correr(lista.get(i));
			System.out.println("\n");			
		}
		int i=0;
		int c=0;
		int d=0;
		while(i<lista.size() && c !=1 || d !=1) {
			if(lista.get(i).equals("Elefante")) {
				System.out.println("Elefante encontrado , ele é o animal de numero " + (i+1));
				c++;
			}
			if(lista.get(i).equals("Girafa")) {
				System.out.println("Girafa encontrada , ela é o animal de numero " + (i+1));
				d++;
			}
			
			i++;
			if(i==lista.size()) {
				System.out.println("Animal não encontrado na lista");
			}
		}
		lista.remove("Gato");
		System.out.println("\n");
		System.out.println(lista);
	}

}
