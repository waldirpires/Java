package Streams;

public class Carro {
	final double valor;
	final String nome;
	final double cilindradas;
	
	public Carro(double valor,String nome,double cilindradas) {
		this.valor = valor;
		this.nome = nome;
		this.cilindradas = cilindradas;
	}
	
	public String toString() {
		return nome;
	}
}
