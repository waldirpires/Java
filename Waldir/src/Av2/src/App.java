import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario();
        Validar valid = new Validar();
       
        
            Scanner l = new Scanner(System.in);
            System.out.println("Digite a idade:");
            int idade = l.nextInt();
            user.setIdade(idade);    
            System.out.println("Digite o ano:");
            l = new Scanner(System.in);
            int Ano = l.nextInt();
            user.setAnoNasc(Ano);
            System.out.println("Digite o mes:");
            l = new Scanner(System.in);
            int mes = l.nextInt();
            user.setMesNas(mes);
            System.out.println("Digite o Nome:");
            l = new Scanner(System.in);
            String nome = l.nextLine();
            user.setNome(nome);
            valid.validarUsuario(user);

        
        
    }
}
