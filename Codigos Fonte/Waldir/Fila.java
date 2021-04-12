class TadFila {
  TadCelula frente;
  TadCelula tras;
  int tamanho;
  int capacidade;

  public TadFila(int capacidade) {
    this.frente = new TadCelula();
    this.tras = this.frente;
    this.tamanho = 0;
    this.capacidade = capacidade;
  }

  public void exibir() {
    System.out.println("\n\nTAD Fila: ");
    System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));
    TadCelula aux = frente.prox;
    System.out.print("FRENTE: ");
    while (aux != null) {
      System.out.print(aux);
      aux = aux.prox;
    }
    System.out.println(" TRÁS\n");
  }

  public boolean estahVazia() {
    return frente == tras;
  }

  public boolean estahCheia() {
    return tamanho == capacidade;
  }

  public boolean enfileirar(int chave) {
    if (estahCheia()) {
      System.out.println("\nFila está CHEIA!\n");
      return false;
    }

    TadCelula nova = new TadCelula();
    nova.valor = chave;
    this.tras.prox = nova;
    this.tras = nova;
    this.tamanho++;

    return true;
  }

  public int desenfileirar() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return -1; // sem desempilhamento
    }

    TadCelula aux = frente.prox;
    this.frente = frente.prox;
    this.tamanho --;

    return aux.valor; // valor desempílhado

  }

  public boolean pesquisar (int chave) {
    TadCelula aux = frente.prox;
    while (aux != null && aux.valor != chave) {
      aux = aux.prox;
    }

    return aux != null;
  }

  public int obterFrente() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return -1; // sem desempilhamento
    }

    return frente.prox.valor;
  }

  public int obterTras() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return -1; // sem desempilhamento
    }

    return tras.valor;
  }

  public boolean inserirFuraFila(int chave) {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return false; // sem desempilhamento
    }

    TadCelula nova = new TadCelula();
    nova.valor = chave;
    nova.prox = frente.prox;
    frente.prox = nova;
    tamanho++;

    return true;
  }

  public boolean levarFrenteParaTras() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return false; // sem desempilhamento
    }

    if (tamanho == 1) {
      System.out.println("Fila possu somente um item!");
      return false; // sem desempilhamento
    }

    int valor = this.desenfileirar();
    this.enfileirar(valor);

    return true;
  }

  public boolean levarTrasParaFrente() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return false; // sem desempilhamento
    }

    if (tamanho == 1) {
      System.out.println("Fila possu somente um item!");
      return false; // sem desempilhamento
    }

    TadFila temp = new TadFila(capacidade);
    temp.enfileirar(this.tras.valor);

    TadCelula aux = frente.prox;
    while (aux != tras) {
      temp.enfileirar(aux.valor);
      aux = aux.prox;
    }

    frente = temp.frente;
    tras = temp.tras;
    return true;

  }

  public boolean inverter() {
    if (estahVazia()) {
      System.out.println("Fila está VAZIA!");
      return false; // sem desempilhamento
    }

    if (tamanho == 1) {
      System.out.println("Fila possu somente um item!");
      return false; // sem desempilhamento
    }

    TadPilha pilha = new TadPilha(capacidade);
    while (!this.estahVazia()) {
      pilha.empilhar(this.desenfileirar());
    }

    while (!pilha.estahVazia()) {
      this.enfileirar(pilha.desempilhar());
    }

    return true;
  }
}