package personalizadaA;

import Streams.Aluno;

public class TesteValidacao {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.usuario(aluno);
		} catch (StringVaziaException  | NumeroForaIntervaloException e) {
			
			System.out.println(e.getMessage());;
		} 
		System.out.println("Fim");
	}

}
