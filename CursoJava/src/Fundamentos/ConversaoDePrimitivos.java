package Fundamentos;
import javax.swing.JOptionPane;

public class ConversaoDePrimitivos {

	public static void main(String[] args) {
		double a  = 3.0568723489234;
		double c = 1; //implícita
		System.out.println(a);
		float b = (float) a;	//Explícita (CAST)
		System.out.println(b);
		
		int d = 129;
		System.out.println(d);
		byte e = (byte) d;
		System.out.println(e);
		
		//Conversão de numeros para Strings
		
		Integer num1 = 10000;
		String Num = num1.toString();
		System.out.println(num1.toString());
		System.out.println(Num);
		
		int num2 = 10000;
		String Num2 = Integer.toString(num2);
		System.out.println(Num2.length());
		
		//Conversão de String para Numeros
		String valor1 = JOptionPane.
				showInputDialog("Digite o Primeiro Numero:" );
		String valor2 = JOptionPane.
				showInputDialog("Digite o Segundo numero");
		
		Double result = Double.parseDouble(valor1);
		Double result2 = Double.parseDouble(valor2);
		result = result + result2;
		JOptionPane.showMessageDialog(null, result);
		
	}

}
