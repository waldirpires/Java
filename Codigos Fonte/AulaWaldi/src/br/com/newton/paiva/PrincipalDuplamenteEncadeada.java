package br.com.newton.paiva;

public class PrincipalDuplamenteEncadeada {
	public static void main(String[] args) {

	    TadListaDuplamenteEncadeada lista = new TadListaDuplamenteEncadeada(4);
	    lista.exibir();

	    int v[] = {4, 6, 5, 7, 1, 9};
	    for (int i = 0; i < v.length; i++) {
	      System.out.println("\n\nTentando Inserir valor " + v[i]);
	      lista.inserir(v[i]);
	      lista.exibir();
	    }

	    if (lista.pesquisar(7)){
	      System.out.println("7: achou!");
	    } else {
	      System.out.println("7: não achou!");
	    }

	    if (lista.pesquisar(8)){
	      System.out.println("8: achou!");
	    } else {
	      System.out.println("8: não achou!");
	    }
	    
	  }

}
