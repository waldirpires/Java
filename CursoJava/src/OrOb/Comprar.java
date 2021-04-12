package OrOb;

import java.util.ArrayList;

public class Comprar {
	String cliente;
	ArrayList<Item> produtos = new ArrayList<>();
	void adcionarItem(Item item) {
		produtos.add(item);
		item.compra = this;
	}
	void adcionarItem(String nome,int quant,double preco) {
	  this.adcionarItem(new Item(nome,quant,preco));		
	}
	double ObterTotal () {
		double total = 0;
		for(Item item: produtos) {
			total +=item.quant * item.preco;
		}
		return total;
	}
}
