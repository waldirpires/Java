import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Set<String> cargos = new HashSet<>();
		boolean incluiu = cargos.add("gerente");
		cargos.add("diretor");
		cargos.add("presidente");
		cargos.add("secretaria");
		cargos.add("funcionario");
		cargos.add("diretor");
		System.out.println("Qual cargo deseja encontrar? ");
		Scanner L = new Scanner(System.in);
		String A=L.nextLine().toLowerCase();
		if(cargos.contains(A)) {
			System.out.println(A+" encontrado");
		}
		else {
			System.out.println("Cargo não encontrado");
		}
		for(String cargo : cargos) {
			System.out.print("["+cargo+"] ");
		}
	}

}
