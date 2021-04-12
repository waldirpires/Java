package Fundamentos;
import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
	String Dias[] = new String[2];
	Dias[0]= "Segunda";
	Dias[1] = "Quinta";
	String Tes[] = new String[2];
	
	Scanner L = new Scanner(System.in);
	for(int i=0;i<2;i++){
		System.out.println("O trabalho de "+ Dias[i]+ " Deu certo? ");
		Tes[i]=L.nextLine();		
	}
	if(Tes[0].equalsIgnoreCase("Sim") && Tes[1].equalsIgnoreCase("Sim")) {
		System.out.println("Vamos ao Shopping Comprar a televisão de 50 polegadas");
		System.out.println("E Vamos tomar sorvete");
	}
	
	if(Tes[0].equalsIgnoreCase("Sim") && !Tes[1].equalsIgnoreCase("Sim")) {
		System.out.println("Vamos ao Shopping Comprar a televisão de 40 polegadas");
		System.out.println("E Vamos tomar sorvete");
	}
	
	if(!Tes[0].equalsIgnoreCase("Sim") && Tes[1].equalsIgnoreCase("Sim")) {
		System.out.println("Vamos ao Shopping Comprar a televisão de 40 polegadas");
		System.out.println("E Vamos tomar sorvete");
	}
	
	if (!Tes[0].equalsIgnoreCase("Sim") && !Tes[1].equalsIgnoreCase("Sim")) {
		System.out.println("Infelizmente nós não conseguimos comprar a tv e nem tomar o sorvete");
	}
	}

}
