import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class CoTorcedores {

	public static void main(String[] args) {
		Set<String> Times = new HashSet<>();
		Times.add("galo");
		Times.add("flamengo");
		Times.add("internacional");
		Times.add("são paulo");
		Times.add("palmeiras");
		System.out.println("Qual cargo deseja encontrar? ");
		Scanner L = new Scanner(System.in);
		String A=L.nextLine().toLowerCase();
		if(Times.contains(A)) {
			System.out.println(A+" encontrado");
		}
		else {
			System.out.println("Cargo não encontrado");
		}
		Times.remove("palmeiras");
		System.out.println(Times);
	}

}
