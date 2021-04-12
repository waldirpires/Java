
public class Principal {

	public static void main(String[] args) {
		TadListaVetores lista = new TadListaVetores(10);
		
		for(int i=0;i<=9;i++) {
			lista.inserir(i);
		}
		lista.exibir();
		lista.Pesquisar(15);
		
	}

}
