package ArraysECollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<Double> Fila = new LinkedList<>();
		Fila.add(1250.00);
		Fila.add(1240.00);
		Fila.add(1270.00);
		Fila.offer(1280.0); //caso não consiga adicionar ele apenas retorna falso;
		System.out.println(Fila);
		System.out.println(Fila.peek()); //pega um item na fila
		System.out.println(Fila.element()); //gera erro se não tiver o elemento na lista
		// Fila.clear(); Limpa a fila 
		// Fila.isEmpty(); verifica se está cheia
		System.out.println();
		System.out.println(Fila.poll()); //Retorna o priemiro item da fila e o remove 
		System.out.println(Fila.poll());
		System.out.println(Fila.remove(1280.00));
		System.out.println(Fila.contains(1270.00));
		System.out.println(Fila.remove()); //se não existir um proximo elemento para se remover ele vai gerar um erro
		System.out.println(Fila);
	}
}
