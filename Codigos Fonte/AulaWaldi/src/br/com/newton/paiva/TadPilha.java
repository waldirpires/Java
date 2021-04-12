package br.com.newton.paiva;

public class TadPilha {

  public static final int VAZIO = -1;

  TadCelula topo;
  TadCelula fundo;
  int tamanho;
  int capacidade;

  // construtor
  public TadPilha(int capacidade) {
    // criar celula cabeça
    TadCelula cabeca = new TadCelula();
    this.topo = cabeca;
    this.fundo = cabeca;
    this.tamanho = 0;
    this.capacidade = capacidade;
  }

  public void exibir() {
    System.out.println("\n\nTAD Pilha: ");
    System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));

    TadCelula aux = topo.prox;
    System.out.print("TOPO -> ");
    while (aux != null) {
      System.out.print(aux);
      aux = aux.prox;
    }
    System.out.println("FUNDO\n\n");
  }

  public boolean estahCheia() {
    return tamanho == capacidade;
  }

  public boolean estahVazia() {
    //return tamanho == 0;
    return topo == fundo;
  }

  public boolean empilhar(int chave) { // PUSH
    // verificar se está cheia
    if (estahCheia()) {
      System.out.println("Pilha está cheia!");
      return false;
    }

    TadCelula nova = new TadCelula();
    topo.valor = chave;
    nova.prox = topo;
    topo = nova; // nova celula cabeça
    tamanho++;

    return true;
  }

  public int desempilhar() { // POP
    // verificar se a pilha está vazia
    if (estahVazia()) {
      System.out.println("Pilha está vazia!");
      return VAZIO;
    }

    TadCelula aux = topo.prox; // topo da pilha
    
    if (aux.prox == null) {
      fundo = topo; // pilha vazia;
      topo.prox = null;
    } else {
      topo.prox = aux.prox;
    }

    tamanho--;

    // retornar o elemento desempilhado
    return aux.valor;
  }

  public boolean pesquisar(int chave) {
	    TadCelula aux = topo.prox;
	    // enquanto eu n�o chegar no final E o valor na celula for
	    // diferente do valor de pesquisa
	    while (aux != null && aux.valor != chave) {
	      aux = aux.prox;
	      System.out.println("Pesquisando....");
	    }

	    if (aux == null) {
	      System.out.println("Não Achou");
	    	return false; // 1a condi��o, n�o achou
	    } else {
	      System.out.println("Achou!");
	      return true; // 2a condi��o, achou
	    }

	  }
  public void ExibirPrimeiro() {
	  System.out.println("O primeiro Valor é: ");
	  System.out.println(topo.prox);
	  
  }
  public boolean Inverter() {
	  int V[] = new  int[tamanho];
	  TadCelula aux = topo.prox;
	    int i=0;
	    while (aux != null) {
	     
	      V[i] = aux.valor;
	      aux = aux.prox;
	      i++;
	    }
	   
	   
	   while(!estahVazia()) {
	    desempilhar();
	    
	   }
	   i=0;
	   for(int l=0;l<V.length;l++) {
		   if (estahCheia()) {
			      System.out.println("Pilha está cheia!");
			      return false;
			    }

			    TadCelula nova = new TadCelula();
			    topo.valor = V[i];
			    nova.prox = topo;
			    topo = nova; // nova celula cabeça
			    tamanho++;
			    	
		i++;  
		exibir();
	   }
	   
	   return true;
	   
	  
  }
  public boolean Afundar() {
	  int V[]= new int[5];
	  TadCelula aux = topo.prox;
	    int i=1;
	    while (aux != null) {
	     
	      V[5-i] = aux.valor;
	      aux = aux.prox;
	      i++;
	    }
	   
		for(int l=0;l<4;l++) {
			int a = V[4-l];
			V[4-l] = V[4-(l+1)];
			V[4-(l+1)]=a;
			
		}
		
		 while(!estahVazia()) {
			    desempilhar();    
		 }
		 i=0;
		 for(int l=0;l<6;l++) {
			   if (estahCheia()) {
				      System.out.println("Pilha está cheia!");
				      return false;
				    }

				    TadCelula nova = new TadCelula();
				    topo.valor = V[i];
				    nova.prox = topo;
				    topo = nova; // nova celula cabeça
				    tamanho++;
				    	
			i++;  
			exibir();
		   }
		
	   
	  return true;
  }
}