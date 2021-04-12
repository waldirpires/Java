
	public class TadListaVetores {

		  private static final int MAX = 100;
		  private static final int VAZIO = -1;

		  int[] valores;
		  int tamanho; // quantidade de elementos existentes
		  int capacidade; // quantidade máxima de elementos

		  public TadListaVetores(int capacidade) {
		    this.valores = new int[MAX];
		    this.tamanho = 0;
		    this.capacidade = capacidade;
		  }

		  public void inserir(int chave) {
			  
			  valores[chave] = chave;
			  tamanho++;
		  }
		  				
		  public boolean estahCheia() {
		    return tamanho == capacidade;
		  }

		  public boolean estahVazia() {
		    return tamanho == 0;
		  }

		  public void exibir() {
		      System.out.println("\nTAD Lista usando Vetores");
		      System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
		      System.out.print("PRIMEIRO: ");
		      for (int i = 0; i < tamanho; i++) {
		        System.out.print(String.format(" [%d]->", valores[i]));
		      }
		      System.out.println(" ULTIMO\n");
		  }
		
		  public int Pesquisar (int chave) {
			  int aux,i=0;
			  aux = -1;
			  if(chave == valores[0]) {
				  aux ++;
			  }
			  while(chave!=valores[i] && i<tamanho) {
				  i++;
				  if(chave == valores[i]) {
				  aux = valores[i];
				  }
				  
			  }
			  if(aux == -1) {
				  System.out.println("Valor não encontrado!");
				  
			  }
			  if(aux != -1) { 
				  System.out.println("Valor "+ aux+ " entcontrado com sucesso!");
			  }
			  return aux;
		  }
	}

