import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private String nome;
    private int totalVagas;
    private static int totalDeAutomoveis =0;
    private float taxaHora;
    private  List<Automovel> automoveis = new ArrayList<>();
    
    public Estacionamento(String nome,int totalVagas,float taxaHora) {
        this.nome = nome;
        this.totalVagas = totalVagas;
        this.taxaHora = taxaHora;
    }

    int calcularQuantVagasDisponiveis(){
        return totalVagas - automoveis.size();
    }

     float calcularTaxaDeOcupacao(){
          float result = (totalDeAutomoveis*100)/totalVagas;
     return result;
    }


    void cadastrarEntrada(String placa){
        if(pesquisar(placa) == null && calcularQuantVagasDisponiveis() != 0){
        Automovel aut = new Automovel(placa);
        automoveis.add(aut);
        System.out.println("Placa cadastrada com sucesso!");
        totalDeAutomoveis++;
        }
        else {
            System.out.println("Placa já cadastrada ou estacionamento cheio");
        }
    }

    private Automovel pesquisar(String placa){
            for(Automovel a : automoveis){
                if (a.getPlaca().equalsIgnoreCase(placa)){
                    return a;
                }
            }
         
        return null;
    }

    void cadastrarSaida(String placa){
       if(pesquisar(placa) != null){
            automoveis.remove(pesquisar(placa));
            System.out.println("Saida realizada com sucesso!");
            totalDeAutomoveis --;
        }
       else {
        System.out.println("Placa não cadastrada");
       }
   }

   float exibirValorAPagar(String placa){
       Automovel aut = pesquisar(placa);
       if(aut != null){
       return aut.calcularValorAPagar(this.taxaHora);
       }
       return taxaHora*0;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public int getTotalDeAutomoveis() {
        return totalDeAutomoveis;
    }

   

    public float getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(float taxaHora) {
        this.taxaHora = taxaHora;
    }

    

     void exibirTodos(){
        for(Automovel a : automoveis){
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Estacionamento [nome=" + nome + ", taxaHora=" + taxaHora + ", totalDeAutomoveis=" + totalDeAutomoveis
                + ", totalVagas=" + totalVagas + "]";
    }
    
    

}
