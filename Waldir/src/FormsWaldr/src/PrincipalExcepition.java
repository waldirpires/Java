

import java.util.Scanner;



public class PrincipalExcepition {
    public static void main(String[] args) {
        
           
            
        ContaBancaria c1;
        Scanner l= new Scanner(System.in);
        System.out.println("Criando a conta:");
        System.out.println("Saldo");
        float saldo = l.nextFloat();
        l= new Scanner(System.in);
        System.out.println("Estado");
        int estado = l.nextInt();
        c1 = new ContaBancaria(saldo, estado);
        int contador=0;
        
        
        while (contador !=3 ){ //menu recursivo para uma melhor visualização
            System.out.println();    
            System.out.println("Opção 1: Efetuar depósito\nOpção2: Saque\nOpção3: Sair\nDigite uma opção:");/*opções do menu, eu ia fazer uma
                classe separada mas fiz assim
                para o melhor entendimento*/
                l = new Scanner(System.in);
                contador= l.nextInt(); //metodo de captura de dados
                switch (contador){ //cada case você faz uma implementação de um metodo
                    
                    case 1: //Efetuar depósito
                        System.out.println("Valor do depósito:");
                        l = new Scanner(System.in);
                        float valor = l.nextFloat();
                        c1.efetuarDeposito(valor);
                        
                        break;
                    case 2: //Get saldo
                        System.out.println("Valor do Saque:");
                        l = new Scanner(System.in);
                        valor = l.nextFloat();
                        c1.efetuarSaque(valor);                      
                    break;
                    case 0: //Encerra o menu definindo a variável boolean para false
                        contador=3;
                    break;
                    default: //Padrão de erro
                    System.out.println("Esssa opção não existe no menu, tente novamente"); // se quiser pode tratar erro string to int mas é opcional
                    contador= l.nextInt();
                    System.out.println();
                    break;
                    
                }
            }
        
    }
}
    