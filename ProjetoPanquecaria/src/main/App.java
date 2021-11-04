package main;

import aggregate.MenuItem;
import aggregate.PanquecariaMenu;
import aggregate.RestauranteMenu;
import iterator.Iterator;

public class App {

	public void imprimir(Iterator i) {
		while(i.hasNext()) {
			MenuItem mi = (MenuItem) i.next();
			System.out.println("  " + mi.getNome()+", "+mi.getPreco()+" -- "+mi.getDescricao());
		}
	}
	
	public static void main(String[] args) {
		
		RestauranteMenu rm = new RestauranteMenu();
		PanquecariaMenu pm = new PanquecariaMenu();
		
		App app = new App();
		System.out.println("\n		####  Menu Panquecaria  ####");
		app.imprimir(rm.getIterator());
		System.out.println("\n		####  Menu Restaurante  ####");
		app.imprimir(pm.getIterator());
		
	}

}
