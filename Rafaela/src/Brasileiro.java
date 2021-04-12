import java.util.*;

public class Brasileiro {

	public static void main(String[] args) {

	List TimeS = new ArrayList<Time>();
	Time time1 = new Time();
	time1.nome = "GALO";
	TimeS.add(time1.nome);
	Time time2 = new Time();
	time2.nome = "INTERNACIONAL";
	TimeS.add(time2.nome);
	Time time3 = new Time();
	time3.nome = "FLAMIDIA";
	TimeS.add(time3.nome);
	Time time4 = new Time();
	time4.nome = "PALMEIRA";
	TimeS.add(time4.nome);
	Time time5 = new Time();
	time5.nome = "SÃO PAULO";
	TimeS.add(time5.nome);
	Time time6 = new Time();
	time6.nome = "VASCO";
	TimeS.add(time6.nome);
	int A=3;
	Scanner L=new Scanner(System.in);
	while(A!=0) {
		System.out.println("Bem Vindo ao Brasileirão");
		System.out.println("Programa ainda em fase de testes enão so temos 6 times que são:");
		System.out.println(TimeS);
		System.out.println("Aqui tão algumas possibilidades de o Menu,"
				+ " Precione 0 a qualquer momento para sair do programa ");
		System.out.println("1- Criar partida");
		System.out.println("2- Visão");
		System.out.println("");
		A=L.nextInt();
		if(A==1) {
		System.out.println("Escolha os dois times respectivamente com seus numeros:"); 
		for(int i=1;i<=6;i++) {
			System.out.println(i+" "+TimeS.get(i-1));
		 }
		 int c=L.nextInt();
		 int d=L.nextInt();
		 System.out.println("Placar: ");
		 int t1=L.nextInt();
		 int t2=L.nextInt();
		 	if(t1>t2) {
		 		switch(c) {
		 		case 1:
		 			time1.Ganhou();
		 		break;	
		 		case 2:
		 			time2.Ganhou();
		 		break;	
		 		case 3:
		 			time3.Ganhou();
		 		break;	
		 		case 4:
		 			time4.Ganhou();
		 		break;	
		 		case 5:
		 			time5.Ganhou();
		 		break;	
		 		case 6:
		 			time6.Ganhou();
		 		break;	
		 		}
		 		switch(d) {
		 		case 1:
		 			time1.Perdeu();
		 		break;	
		 		case 2:
		 			time2.Perdeu();
		 		break;	
		 		case 3:
		 			time3.Perdeu();
		 		break;	
		 		case 4:
		 			time4.Perdeu();
		 		break;	
		 		case 5:
		 			time5.Perdeu();
		 		break;	
		 		case 6:
		 			time6.Perdeu();
		 		break;	
		 		}
		 		
		 		
		 		
		 	}
		 	if(t1<t2) {
		 		switch(d) {
		 		case 1:
		 			time1.Ganhou();
		 		break;	
		 		case 2:
		 			time2.Ganhou();
		 		break;	
		 		case 3:
		 			time3.Ganhou();
		 		break;	
		 		case 4:
		 			time4.Ganhou();
		 		break;	
		 		case 5:
		 			time5.Ganhou();
		 		break;	
		 		case 6:
		 			time6.Ganhou();
		 		break;	
		 		}
		 		switch(c) {
		 		case 1:
		 			time1.Perdeu();
		 		break;	
		 		case 2:
		 			time2.Perdeu();
		 		break;	
		 		case 3:
		 			time3.Perdeu();
		 		break;	
		 		case 4:
		 			time4.Perdeu();
		 		break;	
		 		case 5:
		 			time5.Perdeu();
		 		break;	
		 		case 6:
		 			time6.Perdeu();
		 		break;	
		 		}
		 		
		 		
		 	}
		 	if(t1==t2) {
		 		switch(c) {
		 		case 1:
		 			time1.Empatou();
		 		break;	
		 		case 2:
		 			time2.Empatou();
		 		break;	
		 		case 3:
		 			time3.Empatou();
		 		break;	
		 		case 4:
		 			time4.Empatou();
		 		break;	
		 		case 5:
		 			time5.Empatou();
		 		break;	
		 		case 6:
		 			time6.Empatou();
		 		break;	
		 		}
		 		switch(d) {
		 		case 1:
		 			time1.Empatou();
		 		break;	
		 		case 2:
		 			time2.Empatou();
		 		break;	
		 		case 3:
		 			time3.Empatou();
		 		break;	
		 		case 4:
		 			time4.Empatou();
		 		break;	
		 		case 5:
		 			time5.Empatou();
		 		break;	
		 		case 6:
		 			time6.Empatou();
		 		break;	
		 		}
		 		
		 	}
		}
		
		if(A==2) {
			time1.Visão();
			time2.Visão();
			time3.Visão();
			time4.Visão();
			time5.Visão();
			time6.Visão();
		}
	}
	
		
	}
}
		
	



	
	



