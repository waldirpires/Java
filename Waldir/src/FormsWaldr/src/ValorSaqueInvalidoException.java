

public class ValorSaqueInvalidoException extends RuntimeException {
    private float valorSaque;

    public ValorSaqueInvalidoException(float valorSaque) {
        this.valorSaque = valorSaque;
    } 

    public String getMenssage(){
        return String.format("O Valor %f está negativo ou igual a 0", valorSaque);
    }
}
