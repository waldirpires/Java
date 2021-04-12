package OrOb.Heranca;

public class Heroi extends Jogador{
	
	public Heroi(int x,int y){
		super(x,y); //chama o construtor da classe pai Jogador
		
	}
	public boolean atacar(Jogador oponente) {
		/* int delX = Math.abs(this.x - oponente.x);
		int delY = Math.abs(this.y - oponente.y);
		
		if(delX == 0 && delY == 1) {
			oponente.vida -=20;
			return true;
		} else if(delX == 1 && delY == 0) {
			oponente.vida -=20;
			return true;
		else 
		}
	 */ 
		super.atacar(oponente);
		return super.atacar(oponente) == true ? true : false; // ou super.atacar(oponente) && super.atacar(oponente);
	}
	
 
}
