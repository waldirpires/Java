import java.util.Calendar;
import java.util.Scanner;


public class PrincipalProxy {


    public static void main(String[] args) {
        //Criação de cartão de credito 
        CartaoDeCredito cartao = new CartaoDeCredito();
        Scanner cad = new Scanner(System.in);
        
        //Pegando os dados do cliente
    
       
            
            System.out.println("Digite seu nome e cpf para o cadastro respectivamente:");
            String nomec = cad.nextLine();
            cad = new Scanner(System.in);
            String cpfc = cad.nextLine();
            
            
            //Instancia o cliente
            ClienteBanco cliente = new ClienteBanco(nomec,cpfc, cartao);
            
            //Instacina o validador de Cliente
            validadarCliente valCli = new validadarCliente();
            cad = new Scanner(System.in);
            
            //Recebe e seta a senha do cartão de credito 
            System.out.println("Digite a senha do seu cartão");
            String senha = cad.nextLine();
            cartao.setSenha(senha);
            
            //instancia um calendario com a hora atual do sistema
            Calendar c1 = Calendar.getInstance();
            //recebe o minuto atual do sistema 
            
            int min = c1.get(Calendar.MINUTE);
            Scanner L = new Scanner(System.in);
            
            //valida a O cliente com 5 tentativas
            System.out.println("Valide e o nome e o Cpf respectivamente");
            String nome = L.nextLine();
            String cpf = L.nextLine();
            //Esse metodo contem um loopng que tem chamando a função validar cliente, apenas para que a aplicação não
            //pare caso erre a senha e/ou nome menos menos de 5 vezes 
            
            
            if(valCli.sempreValidar(cliente, cpf, nome)){
                System.out.println("LOG: Inicio da sessão "+ c1.getTime());
                int i = 0;
                while((c1.get(Calendar.MINUTE)-min)<=3 && i !=4){
                    
                    c1 = Calendar.getInstance();
                    if((c1.get(Calendar.MINUTE)-min)>=0){
                        min = c1.get(Calendar.MINUTE);
                        L = new Scanner(System.in);
                        System.out.println("Entre com o nome e o Cpf");
                        nome = L.nextLine();
                        cpf = L.nextLine();
                        if(!valCli.sempreValidar(cliente, cpf, nome)){
                            continue;
                            
                        }                      
                    } else {
                        System.out.print("|-----------------------------|\n");
                        System.out.print("| Opção 1 - Saque             |\n");
                        System.out.print("| Opção 2 - Deposito          |\n");
                        System.out.print("| Opção 3 - Transferencia     |\n");
                        System.out.print("| Opção 4 - Sair              |\n");
                        System.out.print("|-----------------------------|\n");
                        L = new Scanner(System.in);
                        i = L.nextInt();
                        if(i == 1){
                            System.out.println("Valor e senha:");
                            L = new Scanner(System.in);
                            float f = L.nextFloat();
                            L = new Scanner(System.in);
                            String s = L.nextLine();
                            Saque saque = new Saque();
                            System.out.println(saque.transacao(f, cartao,s));
                            continue;
                        } if(i == 2){
                            System.out.println("Valor e senha:");
                            L = new Scanner(System.in);
                            float f = L.nextFloat();
                            L = new Scanner(System.in);
                            String s = L.nextLine();
                            var saque = new Deposito();
                            System.out.println(saque.transacao(f, cartao,s));
                            continue;
                        } if(i == 3){
                            System.out.println("Valor e senha:");
                            L = new Scanner(System.in);
                            float f = L.nextFloat();
                            L = new Scanner(System.in);
                            String s = L.nextLine();
                            var saque = new Tranferencia();
                            System.out.println(saque.transacao(f, cartao,s));
                            continue;
                        } if(i == 2){
                            System.out.println("Valor e senha:");
                            L = new Scanner(System.in);
                            String cpfp = L.nextLine();
                            L = new Scanner(System.in);
                            String nomep = L.nextLine();
                            cliente.setNome(nomep);
                            cliente.setCpf(cpfp);                           
                            continue;
                        } 
                    }
                    
                }
                
            }else {
                System.out.println("Nome ou cpf incorretos");
            }
            
        
        
        }
    }
    