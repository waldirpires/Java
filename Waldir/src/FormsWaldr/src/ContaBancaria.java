

public class ContaBancaria {

    private float saldo;
    private int estado;

    
    public ContaBancaria(float saldo, int estado) {
        this.saldo = saldo;
        this.estado = estado;
    }

    public void efetuarSaque(float valor) throws ValorSaqueInvalidoException{
            
            if(valor<=0){
                throw new ValorSaqueInvalidoException(valor); 
            }

            this.saldo = this.saldo - valor;
            System.out.println("Saldo:"+valor);
    }
    public void efetuarDeposito(float valor){ //No caso aqui crie o método de deposito adcionando no constructor de saldo
        System.out.println(valor +" Depositado com sucesso!");
    }

    public float getSaldo(){ //método já pronto
        return saldo;
    }

}
