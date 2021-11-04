package iterator;

import java.util.ArrayList;

import aggregate.MenuItem;

public class PanquecariaMenuIterator implements Iterator {

	ArrayList<MenuItem> listaMenuItens;
	
	int contador = 0;
	
	public PanquecariaMenuIterator(ArrayList<MenuItem> itens) {
		this.listaMenuItens = itens;
	}

	@Override
	public boolean hasNext() {
		if(listaMenuItens.size() == contador) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		MenuItem aux = listaMenuItens.get(contador);
		contador ++;
		return aux;
	}

}
