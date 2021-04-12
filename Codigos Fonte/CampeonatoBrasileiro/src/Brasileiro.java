import java.util.*;

public class Brasileiro {

	public static void main(String[] args) {
	Time time1 = new Time();
	Time time2 = new Time();

	ArrayList<Time> time = new ArrayList<Time>();
	time1.nome = "Galo";
	time2.nome = "Flamidia";
	time.add(time2);
	time1.colocação = 3;
	time1.Ganhou();
	time1.Ganhou();
	time1.Perdeu();
	time1.Empatou();
	time1.Visão();
	System.out.println(time);
	Map<String,Time> mapa = new HashMap<>();
	
	
	}

}
