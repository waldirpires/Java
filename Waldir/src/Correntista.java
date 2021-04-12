
public class Correntista {
	final String nome; 
	final String cpf;
	ContaBancaria conta; 
	
	public Correntista(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf; 
	}
	
	public void iniciarConta(double saldo,int num,int ag) {
		conta = new ContaBancaria(saldo, num, ag);
		
	}
	
	
	public String toString() {
		System.out.println(nome+" coreentista com o cpf: "+ cpf);
		System.out.println("Dados da conta: \n"+ conta);
		return conta.exibirSaldo() + "\n";
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
