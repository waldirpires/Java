package ArraysECollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<Double> num = new ArrayDeque<Double>();
		num.push(1.0);
		num.push(2.0);
		num.push(3.0);
		num.push(4.0);
		num.push(5.0);
		System.out.println(num);
		System.out.println(num.peek());
		System.out.println(num.remove());
		System.out.println(num);
	}

}
