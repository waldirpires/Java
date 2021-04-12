
public class TesteCorren {

	public static void main(String[] args) {
		Correntista2 cor01 = new Correntista2("joão","Belo horizonte","98564-8254");
		Correntista2 cor02 = new PessoaFisica("joão","Belo horizonte","98564-8254","14277236642");
		Correntista2 cor03 = new PessoaJuridica("joão","Belo horizonte","98564-8254","0001/10584582.02");
		System.out.println(cor01.obterTaxa());
		System.out.println(cor02.obterTaxa());
		System.out.println(cor03.obterTaxa());		
	}

}
