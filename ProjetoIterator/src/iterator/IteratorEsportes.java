package iterator;

import java.util.ArrayList;

import aggregate.Canal;

public class IteratorEsportes implements Iterator{
	
	ArrayList<Canal> listaCanais;

	int contador = 0;
	
	public IteratorEsportes(ArrayList<Canal> canais) {	
		this.listaCanais = canais;
	}

	@Override
	public boolean hasNext() {
		if (listaCanais.size() == contador) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		Canal aux = listaCanais.get(contador);
		contador ++;
		return aux;
	}

}
