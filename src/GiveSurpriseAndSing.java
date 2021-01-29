
public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	@Override
	public ISurprise give() {
		this.giveWithPassion();
		return super.give();
	}

	@Override
	public void giveAll() {
		super.giveAll();
	}

	GiveSurpriseAndSing(String type, int waitType){
		super(type, waitType);
	}
	
	@Override
	protected void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
		
	}

}
