package br.com.newton.paiva;

public class Main {

	public static void main(String[] args) {
		
		TadPilha pilha = new TadPilha(5);

	    pilha.exibir();

	    int[] v = new int[] { 3, 7, 5, 4, 2, 9, 6 };
	    for (int i = 0; i < v.length; i++) {
	      System.out.println("Empilhando " + v[i]);
	      pilha.empilhar(v[i]);
	      pilha.exibir();
	    }
	    pilha.ExibirPrimeiro();
	    System.out.println("\n");
	    pilha.pesquisar(5);
	    System.out.println("\n");
	    pilha.Afundar();
	    int valor = 0; // valor desempilhado
	    while (!pilha.estahVazia()) {
	      valor = pilha.desempilhar();
	      System.out.println("Desempilhou " + valor + "\n");
	      pilha.exibir();
	    }

	    pilha.exibir();
	    pilha.ExibirPrimeiro();
	    System.out.println("\n");
	    pilha.pesquisar(2);
	    System.out.println("\n");
	   
	}
	
	}

