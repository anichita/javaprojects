import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag{
	
	private final String type;
	private ArrayList<ISurprise> randomBag;
	
	public RandomBag(){
		this.type = "RANDOM";
		this.randomBag = new ArrayList<ISurprise>(10);
	}
	
	public String getType() {
		return this.type;
	}
	
	public ArrayList<ISurprise> getBag() {
		return this.randomBag;
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.randomBag.add(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		ArrayList<ISurprise> bag = ((IBag) bagOfSurprises).getBag();
		for (int i = 0; i < bag.size(); i++) {
			this.randomBag.add(bag.get(i));
		}
		bag.clear();
		
	}

	@Override
	public ISurprise takeOut() {
		if (this.randomBag.size() == 0)
		return null;
		
		Random takeRandom = new Random();
		int index = takeRandom.nextInt(this.randomBag.size());
		ISurprise s = this.randomBag.get(index);
		this.randomBag.remove(index);
		return s;
	}

	@Override
	public boolean isEmpty() {
		if (this.randomBag.size() > 0)
			return false;
		return true;
	}

	@Override
	public int size() {
		
		return this.randomBag.size();
	}

}
