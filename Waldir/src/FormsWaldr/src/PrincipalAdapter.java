public class PrincipalAdapter {
    public static void main(String[] args) throws Exception {
        Dado Arquivo = new Dado("Testado pela primeira vez");
        AdapterParaAsciiImp adpAccin = new AdapterParaAsciiImp();

        System.out.println(adpAccin.adptarParaAscii(Arquivo.dado));
    }
}
