
public class Time {
public String nome;
public int colocação,partidas=0,pontos = 0 ;

public boolean Ganhou() {
pontos+=3;
partidas++;
return true;

}
public boolean Empatou() {
pontos+=1;
partidas++;
return true;
}
public boolean Perdeu() {
	pontos+=0;
	partidas++;
	return true;
}
public boolean Visão() {
	System.out.println(nome);
	System.out.println("pontuação: "+pontos);
	System.out.println("Colocação: "+colocação);
	System.out.println("Partidas jogadas: "+partidas);
	return true;
}
}