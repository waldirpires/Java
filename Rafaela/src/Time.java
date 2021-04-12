import java.util.Scanner;

public class Time {
public String nome;
public int partidas=0,pontos = 0 ;

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
	
	partidas++;
	return true;
}
public void Visão() {
	System.out.println(nome);
	System.out.println("pontuação: "+pontos);
	System.out.println("Partidas jogadas: "+partidas);
	System.out.println("");
}

}

