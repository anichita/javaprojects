import java.util.ArrayList;

public class FIFOBag implements IBag {
	
	private final String type;
	private ArrayList<ISurprise> fifoBag;

	public FIFOBag() {
		this.type = "FIFO";
		this.fifoBag = new ArrayList<ISurprise>(10);
	}
	
	public String getType() {
		return this.type;
	}
	
	public ArrayList<ISurprise> getBag(){
		return this.fifoBag;
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		this.fifoBag.add(newSurprise);
		
	}
	
	@Override
	public void put(IBag bagOfSurprises) {
		ArrayList<ISurprise> bag = ((FIFOBag) bagOfSurprises).getBag();
		for (ISurprise surprise : bag) {
			this.fifoBag.add(surprise);
		}
		
		bag.clear();
		 
	}

	@Override
	public ISurprise takeOut() {
		ISurprise s = this.fifoBag.get(0);
		this.fifoBag.remove(0);
		return s;
	}

	@Override
	public boolean isEmpty() {
		if (this.fifoBag.size() > 0)
			return false;
		return true;
	}

	@Override
	public int size() {
		
		return this.fifoBag.size();
	}

}
