package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = num -> num+2 ;
		UnaryOperator<Integer> xDois = num -> num*2 ;
		UnaryOperator<Integer> qDois = num -> num*num ;
		System.out.println(maisDois
				.andThen(qDois)
				.andThen(xDois)
				.apply(23));
	}

}
