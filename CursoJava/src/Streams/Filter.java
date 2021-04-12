package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Filter {
	public static void main(String[] args) {
		Consumer<Object> print = (System.out::println);
		Predicate<Aluno> filt = f -> f.nota >=6 ;		
		Function<Aluno,String > retur = f -> "Parabéns " +f.nome+" pela aprovação!";
		Aluno A1 = new Aluno("melo",10);
		Aluno A2 = new Aluno("Frango",7);
		Aluno A3 = new Aluno("Tb",4);
		Aluno A4 = new Aluno("Caidano",9);
		Aluno A5 = new Aluno("Pé de cana",8);
		List<Aluno> Lista = new ArrayList<>();
		Lista.add(A5);
		Lista.add(A2);
		Lista.add(A3);
		Lista.add(A4);
		Lista.add(A1);
		Lista.stream().filter(filt).map(retur).forEach(print);
		
	}
}
