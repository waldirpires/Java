public class TadPilhaVetores {


  int[] valores;
  int fim;
  int tamanho;
  int capacidade;


  public TadPilhaVetores(int capacidade) {
    this.valores = new int[capacidade];
    this.tamanho = 0;
    this.capacidade = capacidade;
  }


  public boolean estahCheia() {
    return tamanho == capacidade;
  }


  public boolean estahVazia() {
    return tamanho == 0;
  }


  public void exibir() {
    System.out.println("\nTAD Pilha usando Vetores");
    System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
    System.out.print("TOPO: ");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(String.format(" [%d]->", valores[i]));
    }
    System.out.println(" FUNDO\n");
  }


  public void empilhar(int chave) {
    if (tamanho == capacidade) {
      return;
    }


    valores[tamanho] = chave;
    tamanho++;
  }



  public int desempilhar() {
    if (tamanho == 0) {
      return -1;
    }


    tamanho--;
    int chave = valores[tamanho];


    return chave;
  }
  
   public void Afundar() {
	   int aux = valores[0];
	   int aux2;
	   for(int i=0;i<tamanho-1;i++) {
	   valores[i]=valores[i+1];
	   }
	   valores[tamanho-1]=aux;
	   exibir();
   }

}