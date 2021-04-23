package prova;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Automovel {
   private String marca,modelo;
   private int ano, km; 
   private float valor;
   private Proprietario proprietario;
   static List<Proprietario> donos = new ArrayList<>();
   Automovel(String marca, String modelo,int ano,int km,float valor){
       this.marca = marca;
       this.modelo = modelo;
       this.ano = ano;
       this.km = km;
       this.valor = valor;
   }

   public void adicionarPro(String nome,String cpf){
        this.proprietario = new Proprietario(nome, cpf);
        this.donos.add(proprietario);
        System.out.println("Adicionado");
   }
   public void removerPro(String cpf){
        boolean b = this.donos.removeIf(pro -> pro.cpf.equals(cpf));
        if(b){
            System.out.println("Removido");
        }
        System.out.println("cpf não listado");
   }
   void exibirDonos(){
        for(Proprietario p : donos){
            System.out.println(p.nome);
        }
   }

   public String toString(){
       return "Marca: " + marca +" modelo: "+ modelo+" ano: "
       + ano +" km: " + km + " Valor: "+valor ;
   }
}
