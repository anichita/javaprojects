
public class BagFactory {
	
	private BagFactory() {
		
	}
	
	public static IBag getBagFactory(String type) {
		IBag bag = null;
		
		if (type.equals("RANDOM"))
			bag = new RandomBag();
		else if (type.equals("FIFO"))
			bag = new FIFOBag();
		else if (type.equals("LIFO"))
			bag = new LIFOBag();
		
		return bag;
	}

}
