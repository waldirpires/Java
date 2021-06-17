package laboratorio7;

public class mainTesteBilder {
    public static void main(String[] args) { 
        VeiculoBilderImp vei = new VeiculoBilderImp();
        vei.init();
        vei.numPortas(4);
        vei.numKms(5000000);
        vei.numRodas(4);
        vei.numjanelas(4);
        vei.qualAno(2019);
        vei.qualCor("Prata");
        vei.qualMarca("Honda");
        vei.qualModelo("City");
        vei.protencialEmHp(10);
        
        System.out.println(vei);
    }
}
