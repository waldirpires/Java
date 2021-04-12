package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("melo",8.3);
		Aluno a2 = new Aluno("jorge",6.1);
		Aluno a3 = new Aluno("Matheus",5);
		Aluno a4 = new Aluno("Henrrique",7.2);
		Aluno a5 = new Aluno("Matheus",5);
		Aluno a6 = new Aluno("Henrrique",7.2);
		
		List<Aluno> lista = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		System.out.println("distinct....");
		lista.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		lista.stream().distinct()
		.skip(2)
		.limit(5).forEach(System.out::println);

		System.out.println("\nTakWilhe");
		lista.stream().distinct()
		.takeWhile(a-> a.nota>=7)
		.forEach(System.out::println);
	}
}
