public class Usuario {
    private int idade;
    private int AnoNasc;
    private int mesNas;
    private String nome;
    
    public Usuario(int idade, int diaNasc, int mesNas, String nome) {
        this.idade = idade;
        this.AnoNasc = diaNasc;
        this.mesNas = mesNas;
        this.nome = nome;
    }

   public Usuario(){}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public int getAnoNasc() {
    return AnoNasc;
}

public void setAnoNasc(int anoNasc) {
    AnoNasc = anoNasc;
}

public int getMesNas() {
    return mesNas;
}

public void setMesNas(int mesNas) {
    this.mesNas = mesNas;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

@Override
public String toString() {
    return "Usuario [AnoNasc=" + AnoNasc + ", idade=" + idade + ", mesNas=" + mesNas + ", nome=" + nome + "]";
}


}
