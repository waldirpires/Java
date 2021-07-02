public class NomeException extends RuntimeException {
    String nome;

    public NomeException(String atributo) {
        this.nome = atributo;
    }
    
    public String getMessage(){
        return String.format(nome+" ou está nulo ou vazio");
    }
}
