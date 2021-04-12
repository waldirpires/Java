
public class Quadrado {
	Ponto p1;
	Ponto p2;
	Ponto p3;
	Ponto p4;
	
	public Quadrado(int x,int y,int x1,int y1 ,int x2,int y2,int x3,int y3) {
		this.p1 = new Ponto(x,y);
		this.p2 = new Ponto(x1,y1);
		this.p3 = new Ponto(x2,y2);
		this.p3 = new Ponto(x2,y2);
		this.p4 = new Ponto(x3,y3);
			
	}
	public String toString() {
		System.out.println("Quadrado Composto pelos pontos");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		return "";
	}
}
