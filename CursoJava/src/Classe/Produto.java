package Classe;

import java.util.Scanner;

public class Produto  {
	 String Nome,DescontoS;
	 double Preco,PrecoD;
	 static double desconto = 25;
	 ArmazenaProduto Ar = new ArmazenaProduto();
	 Scanner L = new Scanner(System.in);
	 int numPro=0;
	 public void iniciar() {
		 Ar.Iniciar();
	 }
	 				
		
		
		public void Novo() {
		 Produto novo = new Produto();
		 System.out.println("Id: ");
		 numPro=L.nextInt();
		 novo.numPro = numPro;
		 System.out.println("Nome do produto: ");
		 L = new Scanner(System.in);
		 novo.Nome = L.nextLine();
		 System.out.println("Preço do produto: ");
		 String Le;
		 Le = L.nextLine().replace(",", ".");
		 novo.Preco = Double.parseDouble(Le);
		 System.out.println("Desconto se ouver: ");
	 	 int D=L.nextInt();
		 desconto = (double) D;
		 novo.desconto = desconto;
		 if(desconto !=0) {
		 novo.PrecoD = Desconto(novo.Preco);
		 }
		 else {
			 novo.PrecoD = novo.Preco;
		 }
		 Ar.Inserir(novo);
				 
		}
	 Produto (String NomeProduto){
		 Nome = NomeProduto;
	 }
	 Produto(){
		 
	 }
	 public void ExcluirU() {
		 if(Ar.tamanho!=0) {
		 Ar.Lista.remove(Ar.tamanho-1);
		 }
	 }
	 public void ExcluirI(int indice) {
		 if(Ar.tamanho !=0) {
		 Ar.Lista.remove(indice-1);
		 }
	 }
	 
	 public void Exibir() {
		 Ar.exi();
	 }
	 public double Desconto(Double valor) {
		 valor = valor-((valor*desconto)/100);	 
		 return valor; 
	 }
	 
	 
	 
	 
	}

