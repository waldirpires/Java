package ArraysECollections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> Lista = new ArrayList<>();
		Usuario U1 = new Usuario("Melo");
		Usuario U2 = new Usuario("Marcos");
		Usuario U3 = new Usuario("Guilherme");
		Lista.add(U1);		
		Lista.add(U2);		
		Lista.add(U3);	
		for(Usuario u: Lista) {
			System.out.println(u.nome);
		}
	}

}
