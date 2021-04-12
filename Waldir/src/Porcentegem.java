import java.util.Scanner;

public class Porcentegem {
	public static void main(String[] args) {
		Scanner L = new Scanner (System.in);
		double a=1;
		while(a!=0) {
		a=L.nextInt();
		double b = (a*100)/50;
		System.out.println(b);
		}
	}
}
