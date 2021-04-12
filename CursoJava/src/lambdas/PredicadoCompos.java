package lambdas;

import java.util.function.Predicate;

public class PredicadoCompos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num3 -> num3 >= 100 && num3 <= 999;
		System.out.println(isPar.test(132));
		System.out.println(isTresDigitos.test(187));
		System.out.println(isPar.and(isTresDigitos).negate().test(122));
	}

}
