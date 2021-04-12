package OrOb.desafio;

import java.util.ArrayList;

public class Item {
	int quant;
	Item(int quant,String nome,double valor){
		this.quant = quant;
		Itens.add(new Produto(nome,valor));
		
	}
	ArrayList<Produto> Itens = new ArrayList<>();
	
	public String toString() {
		return Itens.get(0).nome;
	}
}
