import java.util.Arrays;
import java.util.List;

public class MinionToy implements ISurprise {
	
	private Minion myMinion;
	private static int cnt;
	
	public MinionToy(Minion myMinion) {
		this.myMinion = myMinion;
	}
	
	@Override
	public void enjoy() {
	
		System.out.println(this.myMinion.getDescription());
		
	}
	
	public static MinionToy generate() {
		List<Minion> minions = Arrays.asList(Minion.values());
		return new MinionToy(minions.get(count(minions.size())));
		
	}
	
	public static int count(int size) {
		if (cnt == size)
			cnt = 0;
		if (cnt < size) {
			return cnt++;
		} 
		
		return 0;
	}

}
