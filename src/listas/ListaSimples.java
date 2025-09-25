package listas;

public class ListaSimples {
	
	class No {
		int valor;
		public No prox;
		public No (int valor) {
			this.valor=valor;
			prox=null;
			
		}
	}
	
	No ini=null;
	
	public void inserirIni(int valor) {
		No novo= new No (valor);
		novo.prox=ini;
		ini=novo;
	}
	public void inserirApos(int valor, int pos) {
		No novo = new No(valor);
		if(ini==null) 
			return;
		No anterior= ini;
			int cont=0;
			while(anterior!=null) {
				if(cont==pos) 
					break;
				else {
						cont++;
						anterior=anterior.prox;
					}
			}
			// não tem elementos suficiente
			if(cont!=pos)
				return;
		     novo.prox=anterior.prox;
		     anterior.prox=novo;
		
	}
	
	public void remover(int valor) {
		No ant=null,atual=ini;
		while(atual!=null) {
			if (atual.valor==valor) {
				// remover elemento
				if(ant==null) {
					//primeiro eletmento
					ini=atual.prox;
				}else {
					//caso geral
					ant.prox=atual.prox;
				}
				
				break;
			}else {
				ant=atual;
				atual=atual.prox;
			}
		}
	}
	
	public void inserirFim(int valor) {
		No novo = new No(valor);
		if(ini==null) {
			ini=novo;
		}else {
			No ultimo=ini;
			while(ultimo.prox!=null) {
				ultimo=ultimo.prox;
			}
			ultimo.prox=novo;
		}
	}
	
	public void imprimir() {
		No atual=ini;
		while (atual!= null) {
			System.out.println("valor "+ atual.valor);
			atual=atual.prox;
		}
		for(No atual2=ini;atual2!=null;atual2=atual2.prox) {
			//System.out.println("valor2 "+ atual2.valor);
		}
		System.out.println("------------");
	}
	
	public void imprimirRev() {
		ListaSimples aux=new ListaSimples();
		No atual=ini;
		while(atual!=null) {
			aux.inserirIni(atual.valor);
			atual=atual.prox;
		}
		aux.imprimir();
	}
	
	public void imprimirRevRec() {
		//System.out.println("a";)
		//imprimirRevRec();
		imprimirRevRec(ini);
		System.out.println("------------");
	}
	private void imprimirRevRec(No atual) {
		if(atual==null)
			return;
		/*imprimirRevRec(atual.prox); // Ordem inversa */
		System.out.println("ValorRec"+ atual.valor);
		imprimirRevRec(atual.prox); // ordem normal
	}
}
