package ArraysECollections;

public class EqualsEHastcode {
	public static void main(String[] args) {
		
		Usuários U1 = new Usuários();
		U1.nome = "Melo";
		U1.email="Tirameloboy17@gmail.com";
		Usuários U2 = new Usuários();
		U2.nome = "Melo";
		U2.email="Tirameloboy17@gmail.com";
		Usuários U3 = new Usuários();
		U3.nome = "Melo";
		U3.email="Tirameloboy17@gmail.com";
		
		System.out.println(U2.equals(U1));
		System.out.println(U2.equals(U3));
	}
}
