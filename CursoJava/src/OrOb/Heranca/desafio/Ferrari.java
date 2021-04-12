package OrOb.Heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
		int delta;
		public Ferrari(){
			super(328);
			int delta = 20;
			this.delta = delta;
		}
		
		public String nome = "Ferrari";
		public void acelerar() {
			if(super.vel + delta < super.VELOCIDADE_MAXIMA) {
				super.vel +=delta;
				}
				else super.vel = super.VELOCIDADE_MAXIMA;
		}
		@Override
		public void ligarTurbo() {
			this.delta = 35;			
		}
}
