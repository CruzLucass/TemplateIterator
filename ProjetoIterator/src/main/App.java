package main;

import aggregate.Canal;
import aggregate.CanalEsporte;
import aggregate.CanalFilme;
import aggregate.CanalInformativo;
import iterator.Iterator;

public class App {

	public void imprimir(Iterator i) {
		while(i.hasNext()) {
			Canal c = (Canal) i.next();
			System.out.println("  " + c.getNome());
		}
	}
	
	
	public static void main(String[] args) {
		
		CanalEsporte esporte = new CanalEsporte();
		CanalFilme filme = new CanalFilme();
		CanalInformativo info = new CanalInformativo();
		
		App a = new App();
		a.imprimir(esporte.getIterator());
		a.imprimir(filme.getIterator());
		a.imprimir(info.getIterator());
		

	}

}
