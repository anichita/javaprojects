import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	
	private int number;
	private String type;
	//private static Random generate;
	
	public Candies (int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	@Override
	public void enjoy() {
		System.out.println(this.number + " of " + this.type + " candies.");	
	}
	
	public static Candies generate() {
		ArrayList<String> candies = new ArrayList<String>(Arrays.asList("chocolate", "jelly",
				"fruits", "vanilla"));
		
		// sa incerc sa implementez random in main cu un singur obiect
		Random generate = new Random();
		
		// limit the number of candies from 1 to 20
		int number = 0;
		do {
		number = generate.nextInt(20);
		} while (number == 0);
		int type = generate.nextInt(candies.size());
		
		return new Candies(number, candies.get(type));
	}

}
