package Excecao;

public class Basico {

	public static void main(String[] args) {
		//Forma muito gen�rica e n�o recomendada
		/* try {
		System.out.println(7/0);
		}
		catch( Exception excecao) {
			System.out.println("N�o possivel dividir por 0");
		}
		*/
		try {			
			System.out.println(7/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); //imprime onde e em que ponto a exce��o foi lan�ada;
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		System.out.println("Fim");
	}
	
}
