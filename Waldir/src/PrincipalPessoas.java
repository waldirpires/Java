import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;



public class PrincipalPessoas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Pessoas>  listp = new ArrayList<>();
		List<Pessoas>  listO = new ArrayList<>();
		BinaryOperator<Pessoas> Orde = (p,p2) -> {
			if(p.getPeso() >= p2.getPeso()) {
				return p;				
			}
			else
			return null;
		};
		Comparator<Pessoas> mairPeso = (al1,al2) -> {
			if(al1.getPeso() > al2.getPeso()) return 1; 
			if(al2.getPeso() > al1.getPeso()) return -1;
			return 0;
		};
		
		Pessoas p1  = new Pessoas("Melo","14277236642","01/10/2001",76.00);
		Pessoas p2  = new Pessoas("João","145231561816","05/11/2001",78.00);
		Pessoas p3  = new Pessoas("Marcelo","15435642442","09/06/2001",86.00);
		Pessoas p4  = new Pessoas("mateus","17687377782","08/10/2001",66.00);
		Pessoas p5  = new Pessoas("Jorge","14275584442","04/01/2001",79.00);
		Pessoas p6  = new Pessoas("Sara","14277854942","21/03/2001",58.00);
		listp.add(p1);
		listp.add(p2);
		listp.add(p3);
		listp.add(p4);
		listp.add(p5);
		listp.add(p6);
		int c = listp.size();
		for(int i=0;i<c;i++) {
			
			listO.add(listp.stream().max(mairPeso).get());
			listp.remove(listp.stream().max(mairPeso).get());
			
		}
		
		listO.stream().forEach(System.out::println);
		System.out.println("Numero de pessoas criadas: "+Pessoas.qnt);
	}

}
