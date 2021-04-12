package Fundamentos;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;
public class DesafioCalculadora {

	public static void main(String[] args) {
		//Instancia a classe Decimalformat crianado o objeto df para formatar o resultado em double
		DecimalFormat df = new DecimalFormat("0.00");
		//Cria e instancia o Scanner
		Scanner L = new Scanner(System.in);
		Double num1,num2,result;
		//Criação da variavel que vai receber o tipo de operação que vai ser feita
		String Opera;
		num1 =Double.parseDouble(JOptionPane.
				showInputDialog("Digite O primeiro Valor: "));
		Opera = JOptionPane.showInputDialog("Qual operação você gostaria de realizar: ");
		num2 =Double.parseDouble(JOptionPane.
				showInputDialog("Digite O Segundo Valor: "));
		//Logica que eu utilizei para decidir qual operação fazer
		Double soma =  (Opera.equalsIgnoreCase("+") ? num1+num2: 0);
		Double sub =  (Opera.equalsIgnoreCase("-") && soma == 0 ? num1-num2: soma);
		Double mult = (Opera.equalsIgnoreCase("*") && sub == 0 && soma == 0? num1*num2: sub);
		Double div =  (Opera.equalsIgnoreCase("/") && sub == 0 && soma == 0 && mult == 0? num1/num2: mult);
		result = soma != 0 ? soma : 0 ;
		result = sub != 0 && result ==0  ?  sub : soma;
		result = mult != 0 && result ==0 ? mult : sub ;
		result = div != 0  && result ==0 ?  div : mult ;
		JOptionPane.showMessageDialog(null, df.format(result));
		
	}

}
