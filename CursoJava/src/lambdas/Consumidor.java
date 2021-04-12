package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Consumer<Produto> imp = nome -> System.out.println(nome.nome);
		Produto prod = new Produto("Lapis",0.5,0.01);
		Produto prod2 = new Produto("caderno",15,0.09);
		Produto prod3 = new Produto("mochila",35,0.03);
		Produto prod4 = new Produto("caneta",1.5,0.04);
		Produto prod5 = new Produto("borracha",1.5,0.05);
		List<Produto> produtos = Arrays.asList(prod,prod2,prod3,prod4,prod5); 
		produtos.forEach(imp);
		System.out.println();
		produtos.forEach(p-> System.out.println(p.preco));
		System.out.println();
		produtos.forEach(System.out::println);
		
	}

}
