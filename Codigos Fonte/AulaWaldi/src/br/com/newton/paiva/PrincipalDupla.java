package br.com.newton.paiva;

public class PrincipalDupla {

	public static void main(String[] args) {
		ListaDupla Lista = new ListaDupla();
		for(int i=0; i<10;i++) {
		Lista.InserirFim(i+1);
		System.out.println(Lista.ExibirLista());
		System.out.println(Lista.ExibirListaInvertida());
		System.out.println("\n");
		}
		Lista.InserirMeio(4,5);
		Lista.InserirMeio(9,8);
		System.out.println("\n");
		System.out.println("Exibindo A lista Atualizada: ");
		System.out.println(Lista.ExibirLista());
		System.out.println(Lista.ExibirListaInvertida());
		Lista.pesquisar(8);
		Lista.InserirOrdenado(6);
		System.out.println(Lista.ExibirLista());
		System.out.println(Lista.ExibirListaInvertida());
	}

}
