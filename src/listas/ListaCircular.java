package listas;

public class ListaCircular {
	class No{
		public No ant; 
		public int valor;
		public No prox;
		public No(int valor) {
			this.valor=valor;
			ant=prox=null;
		}
	}
	 
	No primeiro= null;
	No ultimo= null;
			
	public void inserirIni(int valor) {
		No novo= new No (valor);
		// lista vazia
		if (primeiro==null) {
			  primeiro=novo;
			  ultimo=novo;
			  novo.prox= novo;
			  novo.ant= novo;
		}else {
			ultimo.prox= novo;
			primeiro.ant= novo;
			novo.prox= primeiro;
			novo.ant= ultimo;
			
			primeiro= novo;
		}
	}
	public void inserirFim(int valor) {
		No novo= new No(valor);
		if(ultimo==null) {
			primeiro=novo;
			ultimo=novo;
			novo.prox=novo;
			novo.ant=novo;
		}else {
			ultimo.prox=novo;
			primeiro.ant=novo;
			novo.prox=primeiro;
			novo.ant=ultimo;
			
			ultimo=novo;
		}
	}
	
	public void imprimir() {
		if(primeiro==null)
			return;
		No atual=primeiro;
		do {
			System.out.println("valor "+atual.valor);
			atual=atual.prox;
		}while(atual!=primeiro);
		
	}

}
