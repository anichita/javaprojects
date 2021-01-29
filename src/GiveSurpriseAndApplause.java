
public class GiveSurpriseAndApplause extends AbstractGiveSurprises {
	
	@Override
	public ISurprise give() {
		this.giveWithPassion();
		return super.give();
		
	}

	@Override
	public void giveAll() {
		super.giveAll();
	}

	GiveSurpriseAndApplause(String type, int waitType){
		super(type, waitType);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");

	}

	@Override
	public void put(ISurprise newSurprise) {
		// TODO Auto-generated method stub
		super.put(newSurprise);
	}

	@Override
	public IBag getBag() {
		// TODO Auto-generated method stub
		return super.getBag();
	}

	@Override
	public void put(IBag surprises) {
		// TODO Auto-generated method stub
		super.put(surprises);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

}
