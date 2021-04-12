package Classe;

import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {
		int cont=0,dig=0;
		Produto p1 = new Produto("Notebook");	
		Scanner L = new Scanner(System.in);
		p1.iniciar();
		
	
		System.out.println("Seja Bem-Vindo ao nosso sistema de cadastro "
				+ "De produtos");
		while(cont != 5){
			System.out.println("---------------------------");
			System.out.println("Menu:");
			System.out.println("1 - Cadastrar itens");
			System.out.println("2 - Cadastrar apenas um");
			System.out.println("3 - Excluir item");
			System.out.println("4 - Exibir Produtos");
			System.out.println("5 - Finalizar");
			System.out.println("---------------------------");
			dig = L.nextInt();
			if(dig==1 && dig<6 && dig>0) {
				System.out.println("Quantos itens deseja cadastrar? ");
				L = new Scanner(System.in);
				int g=L.nextInt();
				for(int i=0;i<g;i++) {
					p1.Novo();
				}
			}
			if(dig==2 && dig<6 && dig>0) {
				p1.Novo();
			}
			if(dig==3 && dig<6 && dig>0) {
				System.out.println("O ultimo ou um numero em index?");
				L = new Scanner(System.in);
				String it = L.nextLine();
				if(it.equalsIgnoreCase("ultimo")) {
					p1.ExcluirU();
				}
				if(it.equalsIgnoreCase("index")) {
					System.out.println("Digirte o index: ");
					L = new Scanner(System.in);
					int ind = L.nextInt();
					p1.ExcluirI(ind-1);
				}
			}
			if(dig==4 && dig<6 && dig>0) {
				p1.Exibir();
			}
			
		}	
		
	
	}

	

}
