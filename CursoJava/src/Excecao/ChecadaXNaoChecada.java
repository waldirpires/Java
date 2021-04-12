package Excecao;


public class ChecadaXNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim");
	}
    // Exce��o n�o checada ou n�o verificada
	public static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #001");
	}
	//Exce��o checada ou verificada
	public static void geraErro2() throws Exception{
		throw new Exception("Ocorreu o erro #002");
	}

}
