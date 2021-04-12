package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("melo",8.3);
		Aluno a2 = new Aluno("jorge",6.1);
		Aluno a3 = new Aluno("Matheus",5);
		Aluno a4 = new Aluno("Henrrique",7.2);
		
		List<Aluno> lista = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = a-> a.nota;
		BiFunction<Media, Double, Media> calcMedia = (media, n) -> media.adicionar(n);		
		BinaryOperator<Media> combMedia = (m1,m2) -> Media.combnar(m1, m2);
		Media media = lista.stream().filter(aprovado).map(nota)
		.reduce(new Media(),calcMedia,combMedia);
		System.out.println("A média dos aprovados  é: " + media.getValor());
	}

}
