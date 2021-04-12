package Streams;

public class Media {
	private double total;
	private int qnt;
	
	public Media adicionar(double valor) {
		total += valor;
		qnt++;
		return this;
	}
	
	public double getValor(){
		
		return total/qnt;
	}
	
	public static Media combnar(Media m1,Media m2) {
		Media resultante = new Media();
		resultante.qnt = m1.qnt + m2.qnt;
		resultante.total = m1.total + m2.total;
		
		return resultante; 	
	}
}
