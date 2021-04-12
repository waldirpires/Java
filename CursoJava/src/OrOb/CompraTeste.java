package OrOb;

public class CompraTeste {

	public static void main(String[] args) {
		Comprar compra = new Comprar();
		compra.cliente ="Melo";
		compra.adcionarItem("Gtx 1660Super", 1, 1652.00);
		compra.adcionarItem("Ryzen 5 3600x", 1, 1750.00);
		System.out.println(compra.produtos.size());
		System.out.println(compra.ObterTotal());
		//Só para  mostrar a relação bidirecional; 
		System.out.println(compra.produtos.get(0).compra.produtos.
				get(0).compra.produtos.get(0).nome);
	}

}
