import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Jubileu");
		cliente.setSexo("Masculino");
		
		try {		
		
		FileOutputStream arquivoGra = new FileOutputStream("\\Users\\Center-Vidros\\Desktop/aquivo.bat");
		
		ObjectOutputStream gra = new ObjectOutputStream(arquivoGra);
		gra.writeObject(cliente);
		gra.flush();
		gra.close();
		arquivoGra.flush();
		arquivoGra.close();
		System.out.println("Realizando Gravação");
		System.out.println(cliente);
		}
		
		catch(Exception ex) {
			System.out.println("Erro");
		}
		try {

			FileInputStream arquivoLei = new FileInputStream("\\Users\\Center-Vidros\\Desktop/aquivo.bat");
			
			ObjectInputStream lei = new ObjectInputStream(arquivoLei);
			
			System.out.println("Realizando Leitura");
			
			System.out.println(lei.readObject());
			lei.close();
			arquivoLei.close();
			
			
		}
		catch (Exception ex) {
			
		}
		
	}

}
