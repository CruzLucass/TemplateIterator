package aggregate;

import java.util.ArrayList;

import iterator.Iterator;
import iterator.IteratorEsportes;

public class CanalEsporte implements Aggregate {
	public ArrayList<Canal> canais;
	
	public CanalEsporte() {
		
		canais = new ArrayList<Canal>();
		canais.add(new Canal("Canal Eporte 1"));
		canais.add(new Canal("Canal Eporte 2"));
		canais.add(new Canal("Canal Eporte 3"));
		canais.add(new Canal("Canal Eporte 4"));
		
	}

	
	@Override
	public Iterator getIterator() {
		return new IteratorEsportes(canais);
	}

}
