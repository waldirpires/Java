package aula.modulo3;

import java.util.ArrayList;

public class PrincipalAnimais {

	public static void main(String[] args) {
		Leao leao = new Leao("leão.jpg","Carne",false,"Africa");
		Tigre tigre = new Tigre("tigre.jpg","Carne",false,"Selva Amazonica");
		var animais = new ArrayList<Animal>();
		animais.add(leao);
		animais.add(tigre);
		for(Animal a : animais) {
			System.out.println("---------------------");
			a.andar();
			a.comer();
			a.fazerBarulho();
			System.out.println(a);
			System.out.println("---------------------");
		}
		
	}

}
