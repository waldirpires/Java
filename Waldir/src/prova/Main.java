package prova;

public class Main {
    public static void main(String[] args) {
        Automovel auto = new Automovel("Honda", "City", 2021, 0, 980000);
        System.out.println(auto);
        auto.adicionarPro("Gabriel", "14277236642");
        auto.adicionarPro("Fabiane", "04885636663");
        auto.exibirDonos();
        System.out.println();

        auto.removerPro("04885636663");
        auto.exibirDonos();
    }
}
