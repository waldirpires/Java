package OrOb;

public class Item {
	String nome;
	double preco;
	int quant;
	Comprar compra;
	
	Item(String nome,int quant , double preco){
		this.nome = nome;
		this.quant = quant;
		this.preco = preco;
	}
}
