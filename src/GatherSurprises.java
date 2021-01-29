import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	
	private GatherSurprises() {
		
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		Random random = new Random();
		int nr = 0;
		ArrayList<ISurprise> surprises = new ArrayList<ISurprise>(n);
		
		for (int i = 0; i < n; i++) {
			nr = random.nextInt(3);
			switch (nr) {
			case 0:
				surprises.add(FortuneCookie.generate());
				break;
			case 1:
				surprises.add(Candies.generate());
				break;
			case 2:
				surprises.add(MinionToy.generate());
				break;
			default:	
			}
		}
		return surprises;
	
	}
	
	public static ISurprise gather() {
		Random random = new Random();
		ISurprise s = null;
		int nr = random.nextInt(3);
		
		switch (nr) {
		case 0:
			s = FortuneCookie.generate();
			break;
		case 1:
			s =  Candies.generate();
			break;
		case 2:
			s = MinionToy.generate();
			break;
		default:	
		}
		
		return s;
		
	}

}
