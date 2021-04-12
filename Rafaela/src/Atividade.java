import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Atividade {
	public static void main(String[] args) {
			File f = new File("NomeCompleto.txt");	
		try {
			FileReader lr = new FileReader("Arquivo.txt");
			BufferedReader br = new BufferedReader(lr);
			String Item;
			FileReader lr2 = new FileReader("Sobre.txt");
			BufferedReader br2 = new BufferedReader(lr2);
			String Item2;
			
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			while((Item = br.readLine())!=null ) {
				Item2=br2.readLine();
				System.out.println(Item+" "+Item2);
				bw.write(Item+" "+Item2);
				bw.newLine();
				bw.flush();
				
			}
				bw.close();
			
				
		}
		catch(Exception ex) {
			
		}
	}
}
