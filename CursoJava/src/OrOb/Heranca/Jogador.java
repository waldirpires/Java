package OrOb.Heranca;

public class Jogador {
	public int x; 
	public int y;
	public int vida = 100;

	public Jogador(int x, int y){
		this.x = x;
		this.y = y;	
	}
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) { //testa se direcao é igual a Direcao.NORTE se for acresenta
			y++;
		}
		
		if(direcao == Direcao.SUL) {
			y--;
		}
		if(direcao == Direcao.LESTE) {
			x--;
		}
		if(direcao == Direcao.OESTE) {
			x++;
		}
		
		return true;
	}
	
	public boolean atacar(Jogador oponente) {
		int delX = Math.abs(this.x - oponente.x);
		int delY = Math.abs(this.y - oponente.y);
		
		if(delX == 0 && delY == 1) {
			oponente.vida -=10;
			return true;
		} else if(delX == 1 && delY == 0) {
			oponente.vida -=10;
			return true;
		}
		else 
			return false;
	}
}
