public class ClienteBanco {
    private String nome;
    private String cpf;
    CartaoDeCredito cartao;
    public ClienteBanco(String nome, String cpf, CartaoDeCredito cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartao = cartao;
    }
    public ClienteBanco(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
