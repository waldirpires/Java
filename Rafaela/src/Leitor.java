import java.io.*;

public class Leitor {
	public static void Leitura(String pach) {
		
		try {
			
		
		FileReader Fl= new FileReader(pach); 
		
		BufferedReader buff = new BufferedReader(Fl);
		String linha= "";
		 while(true) {
			 if(linha != null) {
				 System.out.println(linha);
				 
			 }else {
				break; 
			 }
			 linha=buff.readLine();
		 }
		buff.close();
		}
		
		catch(Exception ex) {
			
		}
		
	}
}
