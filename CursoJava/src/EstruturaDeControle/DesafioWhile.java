package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		Double Notas=0.0,Media;
		String Nota;
		int qnt=0;
		Double control =0.0;
		Double cont=0.0;
		while(control != -1) {
			System.out.println("Digite a nota de numero "+ (++cont));
			Nota=L.nextLine().replace(",", ".");		
			control = Double.parseDouble(Nota);
			if(control != -1 && control <=10 && control >= 0) {
				Notas += control;
			}	else if (control == -1) {
				
			}  else {
				System.out.println("\nNumero inválido, digite outro");
				--cont;
			}
			
			qnt++;
		} 
		
		Media = Notas/(qnt-1);
		System.out.printf("A média da sala foi de %.2f",Media);
		
	}

}
