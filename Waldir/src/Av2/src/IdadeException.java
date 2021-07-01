public class IdadeException extends RuntimeException {
    String idade;

    public IdadeException(String atributo) {
        this.idade = atributo;
    }
    
    public String getMenssage(){
        return String.format("Exceção gerada pelo atributo " + idade);
    }
}
