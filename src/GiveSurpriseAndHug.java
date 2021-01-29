
public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	@Override
	public ISurprise give() {
		this.giveWithPassion();
		return super.give();
	}

	@Override
	public void giveAll() {
		super.giveAll();
	}

	GiveSurpriseAndHug(String type, int waitType){
		super(type, waitType);
	}
	
	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
		
	}
	

}
