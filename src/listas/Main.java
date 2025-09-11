package listas;

public class Main {

	public static void main(String args[]) {
		ListaSimples l=new ListaSimples();
		l.inserirIni(1);
		l.inserirIni(2);
		l.inserirIni(3);
		l.inserirFim(4);
		l.inserirFim(5);
		l.inserirFim(9);
		l.inserirApos(2,4);
		l.imprimir();
		
		//for (int i=0;i<1000;i++) {
			//l.inserirIni(i);
		//}
		//System.out.println("Acabou");
	}
}
