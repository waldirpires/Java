package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("melo",8.3);
		Aluno a2 = new Aluno("jorge",6.1);
		Aluno a3 = new Aluno("Matheus",5);
		Aluno a4 = new Aluno("Henrrique",7.2);
		
		List<Aluno> lista = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Comparator<Aluno> melhorNota = (al1,al2) -> {
			if(al1.nota > al2.nota) return 1; 
			if(al2.nota > al1.nota) return -1;
			return 0;
		};
		
		System.out.println(lista.stream().max(melhorNota).get());
		System.out.println(lista.stream().min(melhorNota).get());
		
	}

}
