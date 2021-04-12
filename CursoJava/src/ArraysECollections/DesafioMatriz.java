package ArraysECollections;

import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		double [][] notas;
		double []media;
		int c;
		System.out.println("Quantas Alunos você deseja inserir? ");
		int A=L.nextInt();
		System.out.println("Quantas notas Cada aluno tem? ");
		int n=L.nextInt();
		notas = new double[A][n];
		for(int i=0;i<notas.length;++i) {
			c= i;
			for(int j=0;j<n;j++) {
			System.out.println("Aluno de numero "+ (++c) +", Nota de número "+ (j+1));
				notas[i][j]=L.nextDouble();
			}
		}
		media =new double[A];
		for(int i=0;i<media.length;++i) {			
			for(int j=0;j<n;j++) {
				media[i]+=notas[i][j];	
			}
			media[i]= media[i]/n;
		}
		int con=0;
		for(double m : media) {
		con++;	
		System.out.println("A média do aluno de numero "+con +", foi de "+m);
		}
		}
	


	}


