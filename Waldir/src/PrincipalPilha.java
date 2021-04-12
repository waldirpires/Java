
public class PrincipalPilha {

	public static void main(String[] args) {
		TadPilhaVetores pilha= new TadPilhaVetores(10);
		for(int i=0;i<10;i++) { 
			pilha.empilhar(i);
		}
			pilha.exibir();
			pilha.Afundar();
			
	}

}
