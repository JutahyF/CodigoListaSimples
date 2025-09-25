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
		
		/*for(int i=0; i<1000;i++) {
			l.inserirFim(5);
		}*/
		
		System.out.println("Acabou");
		
		/*ListaDupla ld=new ListaDupla();
		ld.inserirIni("casa ");
		ld.inserirIni("Lote ");
		ld.inserirIni("Apartamento ");*/
		
		ListaDupla ld=new ListaDupla();
		ld.inserirFim(" casa");
		ld.inserirFim(" Lote");
		ld.inserirFim(" Apartamento");
		
		ld.remover(" Apartamento");
		ld.imprimir();
		
		for(int i=0;i<100000;i++) {
			ld.inserirFim("Teste");
		}
		System.out.println("Acabou");
		
		ListaCircular lc=new ListaCircular();
		lc.inserirFim(10);
		lc.inserirFim(5);
		lc.imprimir();
	}
}
