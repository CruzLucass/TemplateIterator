package iterator;

import aggregate.Canal;

public class IteratorInformativo implements Iterator {

Canal[][] arrayCanal ;
	
	int linha = 0;
	int coluna = 0;
	
	public IteratorInformativo(Canal[][] canais) { 
		this.arrayCanal = canais;
	}

	@Override
	public boolean hasNext() {
		if(arrayCanal.length -1  == linha && arrayCanal[0].length - 1 == coluna) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		
		Canal aux = arrayCanal[linha][coluna];
		
		if (arrayCanal[0].length -1 == coluna) {
			coluna = 0;			
			linha ++;
		}else
			coluna++;
						
		return aux;
	}

}
