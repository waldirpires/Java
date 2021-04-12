
public class Reta {
	Ponto p1;
	Ponto p2;

	
	public Reta(int x,int y,int x1,int y1 ,int x2,int y2) {
		this.p1 = new Ponto(x,y);
		this.p2 = new Ponto(x1,y1);

			
	}
	public String toString() {
		System.out.println("Reta Composto pelos pontos");
		System.out.println(p1);
		System.out.println(p2);
		return "";
	}
}
