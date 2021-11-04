package iterator;

import aggregate.MenuItem;

public class RestauranteMenuIterator implements Iterator {

	MenuItem[] arrayMenuItem;
	
	int contador = 0;
	
	public RestauranteMenuIterator(MenuItem[] itens) {
		this.arrayMenuItem = itens;
	}

	@Override
	public boolean hasNext() {
		if(arrayMenuItem.length == contador) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		MenuItem aux = arrayMenuItem[contador];
		contador ++;
		return aux;
	}

}
