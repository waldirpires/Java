package laboratorio7;

public class VeiculoBilderImp implements VeiculoBilder {

    private Veiculo veiculo;

    @Override
    public void init() {
        this.veiculo = new Veiculo();
        
    }

    @Override
    public void numPortas(int numPortas) {
        veiculo.setPortas(numPortas);        
    }

    @Override
    public void numjanelas(int numjanelas) {
        veiculo.setJanelas(numjanelas);
    }

    @Override
    public void numRodas(int numRodas) {
        veiculo.setRodas(numRodas);        
    }

    @Override
    public void qualMarca(String marca) {
        veiculo.setMarca(marca);
    }

    @Override
    public void qualModelo(String modelo) {
        veiculo.setModelo(modelo);      
    }

    @Override
    public void qualAno(int Ano) {
        veiculo.setAno(Ano);        
    }

    @Override
    public void numKms(int numKms) {
        veiculo.setKm(numKms);        
    }

    @Override
    public void protencialEmHp(int protencialEmHp) {
        veiculo.setProtencialEmHp(protencialEmHp);      
    }

    @Override
    public void qualCor(String cor) {
        veiculo.setCor(cor);
        
    }

    @Override
    public String toString() {
        return "VeiculoBilderImp [veiculo=" + veiculo + "]";
    }

    
    
}
