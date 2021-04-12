package ArraysECollections;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		double [] notas;
		int c;
		System.out.println("Quantas notas você deseja inserir? ");
		int A=L.nextInt();
		double media = 0.0;
		notas = new double[A];
		for(int i=0;i<notas.length;++i) {
			c= i;
			System.out.println("Digire a nota de numero "+ ++c);
			notas[i]=L.nextDouble();
		}
		
		for(double medias: notas) {
			media +=medias;
		}
		double b = media/A;
		System.out.println("A média das "+ notas.length+" foi de "+ b);
			
		}
	

}
