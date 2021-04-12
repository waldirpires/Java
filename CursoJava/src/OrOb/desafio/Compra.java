package OrOb.desafio;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> compras = new ArrayList<>();
	void Comprar(int quant,String nome,double preco) {
		compras.add(new Item(quant,nome,preco));
		
	}
	public String toString() {
		return compras.get(0).Itens.get(0).nome;
	}
	double CalcularTotal() {
		double total =0;
		int i=0;
		for(Item t: compras) {
			total += t.Itens.get(i).preco * t.quant;
	
		}
		return total;
	}
	
			
}
