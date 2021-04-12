package Fundamentos;
import java.text.DecimalFormat;
import java.util.*;
public class DesafioConversao {

	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("0	.00");
	Scanner L = new Scanner(System.in);
	String V[] = new String [3];
 	int cont=0;
	while(cont<3) {
	L = new Scanner(System.in);	
	System.out.println("Digite o salário de numero "+(cont+1) + ": " );
	V[cont]=L.nextLine().replace(',', '.');
	cont++;	
	}
	Double V1[] =new Double[3];
	for(int i=0;i<3;i++) {
		V1[i] = Double.parseDouble(V[i]);
		
	}
	double result = (V1[0]+V1[1]+V1[2])/3;
	
	System.out.println("O resultado da média foi: "+ df.format(result));
	
	
	}

}
