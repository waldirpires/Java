import java.util.Scanner;

public class validadarCliente {
    ClienteBanco cliente;
    
    public boolean sempreValidar(ClienteBanco cliente,String cpf,String nome){
        int cont = 0;
        String nomeT = nome;
        String cpfT = cpf;
        while(!validarCliente(cliente, cpfT, nomeT) && cont <=5){
            System.out.println("Nome ou cpf errados, Tente novamente");
            Scanner l = new Scanner(System.in);
            nomeT = l.nextLine();
            cpfT = l.nextLine();
            if(cont == 5 ){
                System.out.println("infelizmente o o nuemro de tentarivas exedeu o limite! reinicie o Sistema");
                return false;
            }
            cont ++;
        }
        return true;
    }
    
    public boolean validarCliente(ClienteBanco cliente,String cpf,String nome){
        if(cliente.getCpf().equalsIgnoreCase(cpf.replaceAll(" ", "")) && cliente.getNome().equalsIgnoreCase(nome.replaceAll(" ", ""))){
            return true;
        } else return false;
    }
}
