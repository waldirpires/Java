package OrOb.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		// p1.idade = -30;
		p1.setIdade(-25); // forma de alterar e ler um atributo privado de
		// uma classe é pela criação de metodos
		System.out.println(p1.getIdade()); 
	
	}
}
