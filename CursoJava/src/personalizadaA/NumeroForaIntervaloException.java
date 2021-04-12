package personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{
	double nota;
	public NumeroForaIntervaloException(double nota) {
		this.nota = nota;
	}
	@Override
	public String getMessage() {
		
		return String.format("O atributo %s está fora do intervalo", nota);
	}
}
