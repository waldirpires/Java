import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;

	List<Correntista> contas = new ArrayList<Correntista>();
	Banco(String nome){
		this.nome = nome;
	}
	
	void criarConta(String nome,String cpf, double saldo,int num,int ag) {
		Correntista novo = new Correntista(nome,cpf);
		novo.iniciarConta(saldo, num, ag);
		contas.add(novo);
	}
	
	Correntista pesquisar(String cpf) {
		Correntista temp = null;
		for(Correntista a : contas) {
			if(a.cpf.equals(cpf)) {
				temp = a;
				break;
			}
		}
		if(temp != null) {
			return temp;
		} else {
		return temp;
		}
		}
	

		Object excluir(Correntista c) {
		contas.remove(c);
		
			return "Conta excluida";
			
		}
	
	public String toString() {
		contas.forEach(System.out::println);
		return "";
	}
}

