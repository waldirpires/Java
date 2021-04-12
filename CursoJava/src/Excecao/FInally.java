package Exceção;

import java.util.Scanner;

public class FInally {

	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		try {
		  System.out.println(7/L.nextInt());
		  L.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente....");
			L.close();		
		}
		System.out.println("Fim!");

	}

}
