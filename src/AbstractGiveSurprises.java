import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	
	private IBag myBag;
	private int waitTime;
	
	public AbstractGiveSurprises(String type, int waitTime) {
		this.myBag = BagFactory.getBagFactory(type);
		this.waitTime = waitTime;
		
	}
	
	public void put(ISurprise newSurprise) {
		this.myBag.put(newSurprise);
	}
	
	public IBag getBag() {
		return this.myBag;
	}
	
	public void put(IBag surprises) {
		this.myBag.put(surprises);
	}
	
	public ISurprise give() {
		return this.myBag.takeOut();
	}
	
	public void giveAll() {
		ISurprise surprise = null;
		do {
			surprise = this.give();
			surprise.enjoy();
			try {
			  TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				
			  e.printStackTrace();
			}
			
		} while (!this.myBag.isEmpty());
		
		
	}
	
	public boolean isEmpty() {
		return this.myBag.isEmpty();
	}
	
	// vizibila doar in interiorul pachetului si pe lantul de mostenire
	protected abstract void giveWithPassion();
	
}
