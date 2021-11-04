package aggregate;

import java.util.ArrayList;

import iterator.Iterator;
import iterator.PanquecariaMenuIterator;

public class PanquecariaMenu implements AggregateMenu{

	public ArrayList<MenuItem> itens;
	
	public PanquecariaMenu() {
		itens = new ArrayList<MenuItem>();
		
		itens.add(new MenuItem("Marmita P", "Marimita de 300 gramas com cardápio do dia", false, 8.0));
		itens.add(new MenuItem("Marmita M", "Marimita de 400 gramas com cardápio do dia", false, 9.0));
		itens.add(new MenuItem("Marmita G", "Marimita de 500 gramas com cardápio do dia", false, 10.0));
		
	}

	@Override
	public Iterator getIterator() {
		return new PanquecariaMenuIterator(itens);
	}

}
