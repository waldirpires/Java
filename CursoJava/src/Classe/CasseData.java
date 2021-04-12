package Classe;

import java.util.Scanner;

public class CasseData {
	String dia,mes,ano;
	Scanner L = new Scanner(System.in);
	public String Data() {
		System.out.print("Digite a data: ");
		dia = L.nextLine();
		mes = L.nextLine();
		ano =L.nextLine();
		return (dia+"/"+mes+"/"+ano);
	}
	 CasseData(String Dia,String Mes, String Ano){
		dia = Dia;
		mes =Mes;
		ano =Ano;
	}
	 
	CasseData(){
		dia = "01";
		mes = "01";
		ano = "1970";
	}
	 
	 public void Exibir() {
		System.out.println((dia+"/"+mes+"/"+ano)); 
	 }
}
