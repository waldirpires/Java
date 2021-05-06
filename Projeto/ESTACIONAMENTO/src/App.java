import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
           
    System.out.println("Bem Vindo ao Sistema de Estacionamento: ");
    System.out.println("Qual o nome do seu estacionamento, numero de vagas e valor por hora: ");
    
    Scanner l = new Scanner(System.in);
    System.out.println("Nome: ");
    String nome= l.nextLine();
    System.out.println("numero de vagas: ");
    int val= l.nextInt();
    System.out.println("val por hora: ");
    float vlHora= l.nextFloat();
    var terminal = new Terminal(nome, val,vlHora);
    int cont = 0;

    while(cont != -1){
        System.out.println("======================================");
        System.out.println("= 1-Cadastro de entrada de automovel =");
        System.out.println("= 2-Calcular valor a pagar           =");
        System.out.println("= 3-Cadastro de saida de automovel   =");
        System.out.println("= 4-Exibir numero vagas disponíveis  =");
        System.out.println("= 5-Exibir numero total de vagas     =");
        System.out.println("= 6-Exibir taxa de ocupação          =");
        System.out.println("======================================");
        l = new Scanner(System.in);       
        cont = l.nextInt();
        l = new Scanner(System.in);       
        if(cont == 1){
            System.out.print("Placa: ");
            String placa=l.nextLine();
            terminal.cadastrarEntrada(placa);
        }
        l = new Scanner(System.in);
        if(cont == 2){
            System.out.print("Placa: ");
            String placa=l.nextLine();
            terminal.exibirValorAPagar(placa);
        }
        l = new Scanner(System.in);
        if(cont == 3){
            System.out.print("Placa: ");
            String placa=l.nextLine();
            terminal.cadastrarSaida(placa);
        }
        if(cont == 4){
            terminal.exibirQuantidadeDeVagasDisponiveis();
        }
        if(cont == 5){
            terminal.exibirQuantidadeTotalVagas();
        }
        
        if(cont == 6){
            terminal.exibirTaxaDeOcupacao();
        }
    }
       
    }
    
    }

