package aggregate;

import iterator.Iterator;
import iterator.IteratorInformativo;

public class CanalInformativo implements Aggregate {

	
public Canal[][] canais;

//na coluna vou colocar o nome do canal e na coluna 0 vou colocar o numero do canal
	
	public CanalInformativo() {
		canais = new Canal[3][2];
		canais[0][0]= new Canal("Nº 01");
		canais[0][1]= new Canal("CNN");
		canais[1][0]= new Canal("Nº 02");
		canais[1][1]= new Canal("Globo News");
		canais[2][0]= new Canal("Nº 03");
		canais[2][1]= new Canal("Record News");

	}
	
	@Override
	public Iterator getIterator() {
		return new IteratorInformativo(canais);
	}
	
}
