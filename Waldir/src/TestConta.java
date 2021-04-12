import java.util.Scanner;

public class TestConta {

	@SuppressWarnings("resource")
	public static void main(String[] args) {		
		Scanner L = new Scanner(System.in);
		int c=0;
		Correntista corr = null;
		Banco banco;
		System.out.println("Vamos primeiro Cadastrar um banco, Digite um nome");
		String t=L.nextLine();
		banco = new Banco(t);			
		while (c != 10){			
			System.out.println("--------------------------------------");			
			System.out.println("1 - Cadastrar Correntista e Conta");
			System.out.println("2 - Entrar na conta");
			System.out.println("3 - Exibir saldo");
			System.out.println("4 - Sacar");
			System.out.println("5 - Depositar");
			System.out.println("6 - Transferir");
			System.out.println("7 - Pagar conta");
			System.out.println("8 - Exibir Extrato");
			System.out.println("9 - Exibir todas as contas");
			System.out.println("10- Sair");
			System.out.println("11 - exluir");
			System.out.println("--------------------------------------");
			c=L.nextInt();
			
			if(c == 1) {
				System.out.println("Digite Nome,Cpf,Saldo,numero da conta e Agencia \nrespectivamente:");
				L = new Scanner(System.in);
				String nome=L.nextLine();
				L = new Scanner(System.in);
				String cpf=L.nextLine();				
				L = new Scanner(System.in);
				double saldo=L.nextDouble();
				L = new Scanner(System.in);
				int num=L.nextInt();
				L = new Scanner(System.in);
				int ag=L.nextInt();	
				banco.criarConta(nome, cpf, saldo, num, ag);
			    
			}
			if(c == 2) {
				System.out.println("Digite seu cpf para pesquisa:");
				L = new Scanner(System.in);
				String cpf=L.nextLine();				
				L = new Scanner(System.in);	
				corr = banco.pesquisar(cpf);	
			}
			L = new Scanner(System.in);
			if(c==3) {
				corr.conta.exibirSaldo();
				System.out.println(corr);
			}
			L = new Scanner(System.in);
			if(c==4 ) {
				double val=L.nextDouble();
				corr.conta.sacar(val);
			}
			L = new Scanner(System.in);
			if(c==5 ) {
				double val=L.nextDouble();
				corr.conta.depositar(val);
			}
			L = new Scanner(System.in);
			if(c==6) {
				double val=L.nextDouble();
				corr.conta.transferir(val);
			}
			L = new Scanner(System.in);
			if(c==7) {
				double val=L.nextDouble();
				corr.conta.pagarConta(val);	
			}
			L = new Scanner(System.in);
			if(c==8) {
				System.out.println("-------------------------");
				corr.conta.exibirExtrato();	
				System.out.println("-------------------------");
				System.out.println();
			}
			if(c==9) {
				System.out.println(banco);	
			
			}
			if(c==11) {
				banco.excluir(corr);
			}
			
		}
		
	}

}
