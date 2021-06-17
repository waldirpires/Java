package laboratorio7;

public class Circulo implements Prototype{
    private int x ;
    private int y ;
    private int raio ;
    
    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo c){
        this.x = c.x;
        this.y = c.y;
        this.raio = c.raio;
    }


    @Override
    public Prototype clonar() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", x=" + x + ", y=" + y + "]";
    }
    
}
