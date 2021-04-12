package OrOb.teste;

import OrOb.Heranca.desafio.Civic;
import OrOb.Heranca.desafio.Ferrari;

public class TesteCarros {

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();	
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println("O "+ civic.nome+" Está á "+civic.vel+"/h");
		System.out.println("A "+ ferrari.nome+" Está á "+ferrari.vel+"/h");
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println("O "+ civic.nome+" Está á "+civic.vel+"/h");
		System.out.println("A "+ ferrari.nome+" Está á "+ferrari.vel+"/h");
		System.out.println(ferrari.tooString());
	}

}
