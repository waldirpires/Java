package personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
	String nome;
	public StringVaziaException(String nome) {
		this.nome = nome;
	}
	@Override
	public String getMessage() {
		
		return String.format("O atributo %s está vazio", nome);
	}
}
