package iterator;

import aggregate.Canal;

public class IteratorFilme implements Iterator {

	Canal[] arrayCanal ;
	
	int contador = 0;
	
	public IteratorFilme(Canal[] canais) { 
		this.arrayCanal = canais;
	}

	@Override
	public boolean hasNext() {
		if(arrayCanal.length == contador) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		Canal aux = arrayCanal[contador];
		contador ++;
		return aux;
	}

}
