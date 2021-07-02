public class PrincipalPessoaFisica {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Gabriel","14277236642","01/10/2001");
        System.out.println(pessoaFisica);
        var pessoaFisica2 = pessoaFisica.clonar();
        System.out.println(pessoaFisica2);
    }


}
