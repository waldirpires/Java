package br.com.newton.paiva;

public class ListaDupla {
	No ultimo;
	No primeiro;
	int tamanho;
	int capacidade;
	
	public void InserirInicio (int valor) {  // pra inserir no inicio , sempre no inicio.
		No no = new No();
		no.info = valor;
		no.ant = null;
		no.prox = primeiro;
		if(primeiro != null) {
			primeiro.ant = no;
		}
		primeiro = no;
		if(tamanho == 0) {
			ultimo = primeiro;
		}
		tamanho++;
		System.out.println(valor + " inserido com sucesso!");
		System.out.println("Novo tamanho é: "+tamanho);
	}
	public Object RetirarInicio() {
		if (primeiro == null) {
			return null;
		}
		
		int out = primeiro.info;
		primeiro = primeiro.prox;
		if (primeiro != null) {
			primeiro.ant = null;
		} else {
			ultimo = null; 
		}
		tamanho--;
		 System.out.println("Primeiro retirado com sucesso!");
		 System.out.println("Novo tamanho é: "+tamanho);
		return out;
									
	}
	public void InserirFim (int valor) {
		No no = new No();
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
		System.out.println(valor + " inserido com sucesso!");
		System.out.println("Novo tamanho é: "+tamanho);

	}
	 public Object RetirarFim() {
		 if(ultimo == null) {
		 return null;
		 }
		 int out = ultimo.info;
		 ultimo = ultimo.ant;
		 if(ultimo != null) {
			 ultimo.prox = null;
		 } else {
			 primeiro = null; 
		 }
		 tamanho--;
		 System.out.println("Ultimo retirado com sucesso!");
		 System.out.println("Novo tamanho é: "+tamanho);
		 return out;
		 
	 }
	 public void InserirMeio(int indice , int info ) {
		 if (indice <= 0) {
			 InserirInicio(info);
		 }
		 else if(indice >= tamanho) {
			 InserirFim(info);		 
		 }
		 else {
			 No local = primeiro;
			 for(int i=0; i< indice-1; i++) {
				 local = local.prox;
			 }
			 No no = new No();
			 no.info = info;
			 no.ant = local;
			 no.prox = local.prox;
			 local.prox = no;
			 no.prox.ant = no;
			System.out.println(info + " inserido com sucesso!");
			tamanho++;
			System.out.println("Novo tamanho é: "+tamanho);
				 
		 }
	 }
	 public Object RetirarMeio(int indice) {
		 No local;
		 if(indice < 0 || indice >= tamanho
			 || primeiro == null) {
			 return null;
		 }
		 else if (indice == 0) {
			 return RetirarInicio();
		 }
		 else if (indice == tamanho -1 ) {
			 return RetirarFim();
		 }
		 else {
			  local = primeiro;
			 for(int i=0; i<indice;i++) {
				 local = local.prox;
			 }
			 if (local.ant !=null) {
				 local.ant.prox = local.prox;
			 }
			 if(local.prox != null) {
				 local.prox.ant = local.ant;
			 }
		 }
		 tamanho--;
		 System.out.println("Indice retirado com secesso!");
		 System.out.println("Novo tamanho é: "+tamanho);
		 return local.info;
	 }
	 public Object ExibirLista() {
		String str = "(" + tamanho +") ";
		No local = primeiro;
		while(local!=null) {

			str+= local.info +" ";
			local = local.prox;
		}
				 
		 return str;
		 
	 }
	 
	 public Object ExibirListaInvertida() {
			if (tamanho > 0) {
		 	String str = "(" + tamanho +") ";
			No local = ultimo;
			while(local!=null) {

				str+= local.info +" ";
				local = local.ant;
			}
			return str;
			}		 
			 return ExibirLista(); 
			 
		 }
	 public boolean pesquisar(int chave) {
		    No aux = primeiro.prox;
		    // enquanto eu não chegar no final E o valor na celula for
		    // diferente do valor de pesquisa
		    System.out.println("\nPesquisando pela chave: "+ chave);
		    while (aux != null && aux.info != chave) {
		      aux = aux.prox;
		    }

		    if (aux == null) {
		     System.out.println("Não Achou!"); 
		    return false; // 1a condição, não achou
		    } else {
		      System.out.println("Achou!");		
		      return true; // 2a condição, achou
		    }

		  }
	 public void InserirOrdenado(int valor) {
		 No aux = primeiro.prox;
		 int indice=1;
		
			 while(aux.ant.info <= valor) {
				 
				 if(aux.ant.info <=valor && aux.info > valor) {
		    	  InserirMeio(indice-1,valor);
		      }
				 
				indice++;
				aux = aux.prox;      
 
			 }
		 
	 	}
		 
	 }
	 


