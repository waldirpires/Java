package OrOb.Heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int vel = 0;
	Carro(int vel_max){
		this.VELOCIDADE_MAXIMA = vel_max;
		System.out.println(VELOCIDADE_MAXIMA);
	}
	public void acelerar() {
		if(this.vel +10 < this.VELOCIDADE_MAXIMA) {
		this.vel +=10;
		}
		else this.vel = this.VELOCIDADE_MAXIMA;
	}
	public void frear() {
		if(this.vel > 0) {
		vel -=5;
		}
		else vel=0; System.out.println("Já está parado");
	}
	 public String tooString() {
		return "Velocidade atual = "+vel+"/h";
		
	}
}
