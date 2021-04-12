package lambdas;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("R$0.00");
		Produto p = new Produto("Ipad", 5283.625,0.13);
		Produto p2 = new Produto("Box", 3514.625,0.23);
		Function<Double,Object> Formatar = pro -> df.format(pro);
		Function<Produto,Double> Desconto = des -> des.preco - (des.preco * des.desconto);
		UnaryOperator<Double> imposto = imp -> imp >= 2500.00 ? imp*1.085 : imp;
		UnaryOperator<Double> frete = fin ->  fin >= 2500.00 ? fin+100.00 : fin+50.00 ;
		System.out.println(Desconto.andThen(imposto).andThen(frete).andThen(Formatar).apply(p));
		System.out.println(Desconto.andThen(imposto).andThen(frete).andThen(Formatar).apply(p2));
		
	}
}
