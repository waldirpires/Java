import java.util.Calendar;


public class Automovel {
    private String placa;
    private Calendar saida,entrada;
    private float tempo,valor;
    
    public Automovel(String placa) {
        this.placa = placa;
        this.entrada = Calendar.getInstance();
        
    }

    private float calcularTempoNoEstacionamento(){
        this.saida = Calendar.getInstance();
        int hentr = this.entrada.get(Calendar.HOUR_OF_DAY);
        int mentr = this.entrada.get(Calendar.MINUTE);
        int hsai = this.saida.get(Calendar.HOUR_OF_DAY);
        int mesai = this.saida.get(Calendar.MINUTE);

        this.tempo = Float.valueOf(hsai+"."+mesai).floatValue() - Float.valueOf(hentr+"."+mentr).floatValue();
        return tempo;
    }

    float calcularValorAPagar(float taxaHora){
        this.valor = taxaHora * calcularTempoNoEstacionamento();
        return valor;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Calendar getSaida() {
        return saida;
    }

    public void setSaida(Calendar saida) {
        this.saida = saida;
    }

    public Calendar getEntrada() {
        return entrada;
    }

    public void setEntrada(Calendar entrada) {
        this.entrada = entrada;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Automovel [placa=" + placa + ", tempo=" + tempo
                + ", valor=" + valor + "]";
    }

    
 
}
