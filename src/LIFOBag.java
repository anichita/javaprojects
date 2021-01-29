import java.util.ArrayList;

public class LIFOBag implements IBag{
	
	private final String type;
	private ArrayList<ISurprise> lifoBag;
	
	public LIFOBag() {
		this.type = "LIFO";
		this.lifoBag = new ArrayList<ISurprise>(10);
	}
	
	public String getType() {
		return this.type;
	}
	
	public ArrayList<ISurprise> getBag() {
		
		return this.lifoBag;
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.lifoBag.add(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		ArrayList<ISurprise> bag = ((LIFOBag)bagOfSurprises).getBag();
		
		for (ISurprise surprise : bag) {
			this.lifoBag.add(surprise);
		}
		
		bag.clear();
		
	}

	@Override
	public ISurprise takeOut() {
		int index = this.lifoBag.size() - 1;
		ISurprise s = this.lifoBag.get(index);
		this.lifoBag.remove(index);
		return s;
	}

	@Override
	public boolean isEmpty() {
		if (this.lifoBag.size() > 0)
			return false;
		return true;
	}

	@Override
	public int size() {
		
		return this.lifoBag.size();
	}

}
