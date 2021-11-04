package aggregate;

import iterator.Iterator;
import iterator.RestauranteMenuIterator;

public class RestauranteMenu implements AggregateMenu {

	public MenuItem[] itens;
	
	public RestauranteMenu() {
		itens = new MenuItem[4];
		itens[0]= new MenuItem("Panqueca de Frango", "Frango, Molho, Mussarela e Catupiry", false, 8.0);
		itens[1]= new MenuItem("Panqueca 4 queijos", "Mussarela, Gorgonzola, parmesão e catupiry", false, 9.0);
		itens[2]= new MenuItem("Panqueca de Bacon", "Bacon, molho, mussarela e catupiry", false, 8.0);
		itens[3]= new MenuItem("Panqueca de Palmito", "Palmito, molho, mussarela e catupiry", false, 8.0);
		itens[3]= new MenuItem("Panqueca de Brócolis", "Brócolis, molho, mussarela e catupiry", false, 8.0);
	}

	@Override
	public Iterator getIterator() {
		return new RestauranteMenuIterator(itens);
	}

}
