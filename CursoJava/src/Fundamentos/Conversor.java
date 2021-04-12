package Fundamentos;
import java.util.*;
import java.text.DecimalFormat; 
public class Conversor {

	public static void main(String[] args) {
		// chamando um objeto para limitar um Double á apenas 2 casas decimais
		DecimalFormat df = new DecimalFormat("0	.00");
		Scanner L = new Scanner (System.in);
		final double num = 32;
		final double div = 5.0/9;
		System.out.println("Digite o valor em Fahrenheit: ");
		double fire=L.nextDouble();
		double cel = (fire-num)*div;		
		//Utiliza o metodo df.format dentro do print para converter o valor 
		System.out.println("O valor em Celsius é "+ df.format(cel));
		
	}

}
