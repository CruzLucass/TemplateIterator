package aggregate;


import iterator.Iterator;
import iterator.IteratorFilme;

public class CanalFilme implements Aggregate {
	
	public Canal[] canais;
	
	public CanalFilme() {
		canais = new Canal[4];
		canais[0]= new Canal("Canal Filme 1");
		canais[1]= new Canal("Canal Filme 2");
		canais[2]= new Canal("Canal Filme 3");
		canais[3]= new Canal("Canal Filme 4");
	}
	

	@Override
	public Iterator getIterator() {
		return new IteratorFilme(canais);
	}

}
