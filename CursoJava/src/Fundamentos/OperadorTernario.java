package Fundamentos;
import java.util.*;
public class OperadorTernario {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner L =new Scanner(System.in);
			System.out.println("Digite a média: ");	
			double media = L.nextDouble();
			String Fudido = media < 5.0 ? "Aluno está fudido" : "Aluno está de recuperação";
			String resultado = media>=7.0 ? "O aluno está aprovado" : Fudido;
			System.out.println(resultado);
		
		}
}
