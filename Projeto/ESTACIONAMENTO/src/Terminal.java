public class Terminal {
    private Estacionamento estac;

    
    
    public Terminal(String nome,int totalVagas,float taxaHora) {
        this.estac = new Estacionamento(nome, totalVagas,taxaHora);
    }

    void cadastrarEntrada(String placa){
        estac.cadastrarEntrada(placa);  
    }

    void cadastrarSaida(String placa){
        estac.cadastrarSaida(placa);
    }

    void exibirValorAPagar(String placa){
        float val = estac.exibirValorAPagar(placa);
        if(val > 0){
            System.out.println("Valor á pagar é: "+ val);
        }
        else{
            System.out.println("Tempo insuficiente para ser cobrado ou placa não existe: ");
        }
    }
    void exibirQuantidadeDeVagasDisponiveis(){
        System.out.println(estac.calcularQuantVagasDisponiveis());
    }

    void exibirQuantidadeTotalVagas(){
        System.out.println(estac.getTotalVagas());
    }

    void exibirTaxaDeOcupacao(){
        System.out.println(estac.calcularTaxaDeOcupacao()+"%");
    }

    void exibirTodosOsCarros(){
        estac.exibirTodos();
    }
}
