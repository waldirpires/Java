
public class Triangulo {
	Ponto p1;
	Ponto p2;
	Ponto p3;
	
	public Triangulo(int x,int y,int x1,int y1 ,int x2,int y2) {
		this.p1 = new Ponto(x,y);
		this.p2 = new Ponto(x1,y1);
		this.p3 = new Ponto(x2,y2);
			
	}
	
	public String toString() {
		System.out.println("Triangulo Composto pelos pontos");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		return "";
	}
	
}
