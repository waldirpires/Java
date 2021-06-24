public class Deposito implements Transacoes {
    float deposito; 
    
    @Override
    public String toString() {
        return "Deposito [deposito=" + deposito + "]";
    }

    @Override
    public String transacao(float valor, CartaoDeCredito cartão, String senha) {
        if(valor < 0){
            return "Erro: valor menor ou igual a 0";
        } if(!cartão.getSenha().equals(senha)){
            return "Senha incorreta";
        } if(senha.length() > 4){
            return "Numero de dígitos ultrapassou o limite";
        }
        return "Transação realizada";
    }
       

}
