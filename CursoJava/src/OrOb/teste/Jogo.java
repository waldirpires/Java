package OrOb.teste;

import OrOb.Heranca.*;

public class Jogo {

	public static void main(String[] args) {
		Monstro j1 = new Monstro();
		Heroi j2 = new Heroi(0,0);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j2.andar(Direcao.NORTE);
		j2.andar(Direcao.NORTE);
		j1.andar(Direcao.SUL);	
		j1.andar(Direcao.SUL);	
		j2.andar(Direcao.SUL);	
		System.out.println( j1.x +","+ j1.y + " Monstro e vida "+ j1.vida );
		System.out.println( j2.x +","+ j2.y + " Heroi e vida " + j2.vida );
		j1.atacar(j2);
		j2.atacar(j1);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j2.atacar(j1);
		j2.atacar(j1);
		System.out.println( j2.x +","+ j2.y + " Heroi e vida "+ j2.vida );
		System.out.println( j1.x +","+ j1.y + " Monstro e vida "+ j1.vida );
		
		
	}

}
