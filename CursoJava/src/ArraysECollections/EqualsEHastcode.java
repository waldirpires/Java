package ArraysECollections;

public class EqualsEHastcode {
	public static void main(String[] args) {
		
		Usuarios U1 = new Usuarios();
		U1.nome = "Melo";
		U1.email="Tirameloboy17@gmail.com";
		Usuarios U2 = new Usuarios();
		U2.nome = "Melo";
		U2.email="Tirameloboy17@gmail.com";
		Usuarios U3 = new Usuarios();
		U3.nome = "Melo";
		U3.email="Tirameloboy17@gmail.com";
		
		System.out.println(U2.equals(U1));
		System.out.println(U2.equals(U3));
	}
}
