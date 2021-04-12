package br.com.newton.paiva;

public class ListaString {
		private static final String[][] String = null;
		No1 ultimo;
		No1 primeiro;
		int tamanho;
		int capacidade;
		
		public void InserirFim (String valor) {
			No1 no = new No1();
			no.info = valor;
			no.prox = null;
			no.ant  = ultimo;
			if(ultimo != null) {
				ultimo.prox = no;
			}
			ultimo = no;
			if (tamanho == 0) {
				primeiro = ultimo;
			}
			tamanho++;
			
			

		}
		public Object ExibirLista() {
			String str = "(" + tamanho +") ";
			No1 local = primeiro;
			while(local!=null) {

				str+= " "+ local.info +" ";
				local = local.prox;
			}
					 
			 return str;
			 
		 }

		 public void Contador() {
			 No1 aux = primeiro.prox;
			 aux.num = 0;
			 String auxi = "";
			 String V[] = {"b","c","d","f","g","h","i","j","k","l","m","n","p","q","r","s","t","v","w","x","z"};
			 String a= aux.ant.info;
			 int d=0;
			 while(d!=0) {
				for(int i =0; i<=tamanho ; i++) {
				 if(a.equals(V[i])) {
					aux.ant.num++;
					System.out.println("a");
				 }
			 }
			  aux = aux.prox;
			  a=aux.ant.info;
			
			 }
			 
			 while(aux!=null) {
					for(int i =0; i<tamanho ; i++) {
					 if(aux.ant.num > aux.prox.num) {
						auxi=aux.ant.info;
					 }
					 else {
						 auxi=aux.prox.info;
					 }
				 }
				  aux = aux.prox;
				 }
			System.out.println("A Consoante mais usada foi "+ auxi);	
			
		 }

	}


