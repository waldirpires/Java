
package br.com.newton.paiva;
import java.util.Scanner;
public class PrincipalString {

	public static void main(String[] args) {
	System.out.println("Digite uma frase: ");
	String frase = new String();
	Scanner L = new Scanner(System.in);
	frase=L.nextLine();
	frase = frase.toLowerCase();
	ListaString lista = new ListaString();
	for(int i=0;i<frase.length();i++) {
	lista.InserirFim(frase.substring(i,i+1));	
	
	}
	System.out.println(lista.ExibirLista());
	frase=frase.replaceAll("a", "");
	frase=frase.replaceAll("e", "");
	frase=frase.replaceAll("i", "");
	frase=frase.replaceAll("o", "");
	frase=frase.replaceAll("u", "");
	
	ListaString listaC = new ListaString();
	for(int i=0;i<frase.length();i++) {
		listaC.InserirFim(frase.substring(i,i+1));		
		}
	System.out.println(listaC.ExibirLista());
	listaC.Contador();
	}
}
