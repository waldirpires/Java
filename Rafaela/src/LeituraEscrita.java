import java.io.*;

public class LeituraEscrita {
	public static void main(String[] args) {
		File f = new File("Arquivo.txt");
		
		try { 
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("Gabriel");
			bw.newLine();
			bw.write("Matheus");
			bw.newLine();
			bw.write("Jorge");
			bw.newLine();
			bw.write("Marrony");
			bw.newLine();
			bw.write("Vargas");
			bw.newLine();
			bw.write("Savarino");
			bw.newLine();
			bw.write("Keno");
			bw.newLine();
			bw.write("Sasha");
			bw.newLine();
			bw.write("Saratcho");
			bw.newLine();
			bw.write("Allan");
			bw.flush();
			bw.close();
			
			
			
		}
		catch (Exception ex) {
			System.out.println("Erro");
		}
		try {
			FileReader lr = new FileReader(f);
			BufferedReader br = new BufferedReader(lr);
			String Item;
			while((Item = br.readLine())!=null) {
				
				System.out.println(Item);
			}
			
			
		}
		catch(Exception ex) {
			
		}
	}
}
