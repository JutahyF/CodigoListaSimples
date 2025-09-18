package listas;

public class ListaDupla {
	
	class No {
		public No ant;
		public String valor;
		public No prox;
		public No (String valor) {
			this.valor = valor;
			ant=prox=null;
		}
	}
	
	No ini=null,fim=null;
	
	public void inserirIni(String valor) {
		No novo =new  No (valor);
		if (ini==null) {
			ini=fim=novo;
		}else {
			novo.prox=ini;
			ini.ant=novo;
			ini=novo;
		}
	}
	
	public void inserirFim(String valor) {
		No novo = new No(valor);
		if(fim==null) {
			ini=fim=novo;
		}else {
			novo.ant=fim;
			fim.prox=novo;
			fim=novo;
		}
	}
	
	public void imprimir() {
		No atual=ini;
		while (atual!=null) {
			System.out.println("valor"+atual.valor);
			atual=atual.prox;
		}
	}
	public void imprimirRev() {
		No atual=fim;
		while(atual!=null) {
			System.out.println("valor " +atual.valor);
			atual=atual.ant;
		}
	}
	
	public void remover(String valor) {
		No atual=ini;
		
		while(atual!=null) {
			if(atual.valor.equals(valor)){
				No ant=atual.ant;
				No prox=atual.prox;
				if(ant!=null)
				ant.prox=prox;
				else // primeiro elemento
					ini=prox;
				if(prox!=null)
				    prox.ant=ant;
				else// ultimo elemento
					fim=ant;
				break;
			}else {
				atual=atual.prox;
			}
		}
	}
}


