package EstruturaDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		String [] Dias = {"Domingo","segunda","terça","Quarta","Quinta","Sexta","Sabado"};
		System.out.println("Digite o dia que gostaria de saber: ");
		String d=L.nextLine();
		int v=1;
		for(int i=0;i<7;i++) {
			if(Dias[i].equalsIgnoreCase(d)) {
				System.out.println(d+" Equivale ao numero: "+(++i));
			v=0;
			}		
		}
		if(v!=0) {
			System.out.println("Dia inválido");
		}
		
		

	}

}
