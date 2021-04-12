package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("melo",8.3);
		Aluno a2 = new Aluno("jorge",6.1);
		Aluno a3 = new Aluno("Matheus",5);
		Aluno a4 = new Aluno("Henrrique",7.2);
		
		List<Aluno> lista = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = a ->a.nota < 7 ;
		
		System.out.println(lista.stream().allMatch(aprovado));
		System.out.println(lista.stream().anyMatch(aprovado));
		System.out.println(lista.stream().noneMatch(reprovado));
	
	}

}
