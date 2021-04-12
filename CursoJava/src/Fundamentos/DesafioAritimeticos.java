package Fundamentos;
import java.text.DecimalFormat;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		//Objetivo: Representar a formula-> ((6*(3+2))^2/(3*2)-((1-5)*(2-7)/2)^2)^3/10^3
	DecimalFormat df = new DecimalFormat("0.00");
	double Pt1,Pt2,Pt3;
	double Result;
	Pt1=6*(3+2);
	Pt1 = Math.pow(Pt1, 2)/(3*2);
	Pt2 = (1-5)*(2-7)/2;
	Pt2 = Math.pow(Pt2, 2);
	Pt3= Math.pow(10, 3);
	Result = Math.pow((Pt1-Pt2),3)/Pt3;
	System.out.println("Resultado da primeira parte "+ df.format(Pt1));
	System.out.println("Resultado da segunda parte "+ df.format(Pt2));
	System.out.println("Resultado da Terceira Parte "+ df.format(Pt3));
	System.out.println("Resultado Final: "+df.format(Result));
	
	
	
	
	}

}
