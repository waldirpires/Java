import java.util.Scanner;

class Main {

  static void exibirMenu() {
    System.out.println("======================================");
    System.out.println("EdD - TAD Fila\n");

    System.out.println("1. Criar  Fila");
    System.out.println("2. Mostrar Fila");
    System.out.println("3. Enfileirar novo item na fila");
    System.out.println("4. Desenfileirar");
    System.out.println("5. Verificar se Est� cheia?");
    System.out.println("6. Verificar se st� vazia?");
    System.out.println("7. Exibir elemento da Frente");
    System.out.println("8. Exibir elemento de  Tr�s");
    System.out.println("9. Pesquisar por uma chave na fila");
    System.out.println("10. Inverter uma fila");
    System.out.println("11. Tr�s para frente");
    System.out.println("12. Frente para tr�s");        System.out.println("13. Inserir fura-fila");
    System.out.println("14. Sair\n");

    System.out.println("Escolha uma das op��es acima (1-14):");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TadFila fila = null;
    int op = 0, chave = 0;
    boolean resultado;

    while (op != 14) {
      exibirMenu();

      op = sc.nextInt();

      switch (op) {
      case 1:
        System.out.println("Digite a capacidade desejada:");
        int capacidade = sc.nextInt();

        fila = new TadFila(capacidade);

        break;
      case 2:

        fila.exibir();

        break;
      case 3:
        System.out.println("Digite o valor a ser enfileirado:");
        chave = sc.nextInt(); 
        
        if (fila.enfileirar(chave)) {
          System.out.println("Valor enfileirado com sucesso.");
        } {
          System.out.println("Valor N�O enfileirado.");
        }

        break;
      case 4:
        chave = fila.desenfileirar();

        if (chave == -1) {
          System.out.println("N�o foi poss�vel desenfileirar.");
        } {
          System.out.println("Valor desenfileirado: " + chave);
        }

        break;
      case 5:
        System.out.println("Est� cheia: " + fila.estahCheia());
        break;
      case 6:
        System.out.println("Est� vazia: " + fila.estahVazia());
        
        break;
      case 7:
        System.out.println("Frente: " + fila.obterFrente());

        break;
      case 8:
        System.out.println("Tr�s: " + fila.obterTras());

        break;
      case 9:
        System.out.println("Digite o valor a ser pesquisado:");
        chave = sc.nextInt(); 
        
        if (fila.pesquisar(chave)) {
          System.out.println("Valor encontrado com sucesso.");
        } {
          System.out.println("Valor N�O encontrado.");
        }

        break;
      
      case 10:
        fila.inverter();
        break;
      
      case 11:
        fila.levarTrasParaFrente();
        break;
      case 12:
        fila.levarFrenteParaTras();
        break;
      case 13:
        System.out.println("Digite o valor a ser enfileirado:");
        chave = sc.nextInt(); 

        fila.inserirFuraFila(chave);
        break;
      }

      fila.exibir();
    }

    sc.close();
  }
  
}