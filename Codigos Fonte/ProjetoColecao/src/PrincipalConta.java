import java.util.*;

public class PrincipalConta {

	public static void main(String[] args) {
	ContaCorrente c1 = new ContaCorrente();	
	c1.Depositar(4200);
	ContaCorrente c2 = new ContaCorrente();	
	c2.Depositar(5000);
	Map<String,ContaCorrente> mapa = new HashMap<>();
	mapa.put("Melo", c1);
	mapa.put("Jubileu", c2);
	ContaCorrente contaM = mapa.get("Melo");
	System.out.println("Saldo da conta Melo é "+ contaM.getSaldo());
	
	}

}
