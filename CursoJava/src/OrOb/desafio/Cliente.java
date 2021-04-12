package OrOb.desafio;

import java.util.ArrayList;

public class Cliente {
	ArrayList<Compra> Lcompra = new ArrayList<>();
	double CalcularTotal() {
		double total =0;
		@SuppressWarnings("unused")
		int i=0;
		for(Compra t: Lcompra) {
			total += t.CalcularTotal();
		}
		return total;
	}
	
	public static void main(String[] args) {
	Cliente geralCliente = new Cliente();	
	Compra compra1 = new Compra();
	Compra compra2 = new Compra();
	compra1.Comprar(2,"Gtx 1660 Super", 1665.00);
	compra1.Comprar(1, "Tv", 1020.00);
	compra2.Comprar(8, "Memória Ram 8Gb", 250.00);
	geralCliente.Lcompra.add(compra1);
	geralCliente.Lcompra.add(compra2);
	System.out.println("Total da compra é: "+geralCliente.CalcularTotal());
}
}
