package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DesafioStream {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Carro honda = new Carro(98000.00,"City",1.5);
		Carro Toyota = new Carro(128000.00,"Corolla",2.0);
		Carro Fiat = new Carro(48000.00,"Argo",1.0);
		Carro Hyundai = new Carro(80000.00,"Hb20S",1.0);
		Carro wolks = new Carro(85000.00,"Jetta",2.0);
		List<Carro> listaC = new ArrayList<>();
		listaC.add(wolks);
		listaC.add(Hyundai);
		listaC.add(Toyota);
		listaC.add(honda);
		listaC.add(Fiat);
		Predicate<Carro> motor = m -> m.cilindradas > 1.0;
		Predicate<Carro> preco = m -> m.valor < 100000.00;
		Consumer<Object> print = (System.out::println);
		
		listaC.stream().filter(motor).filter(preco).forEach(print);
	}

}
