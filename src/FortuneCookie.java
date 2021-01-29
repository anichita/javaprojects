
import java.util.Random;

public class FortuneCookie implements ISurprise{
	private String message;
	//private Random generate;
	
			
	public FortuneCookie(String message) {
		this.message = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Fortunate Cookie: " + this.message);	
	}

	public static FortuneCookie generate() {
		// source: https://quotes.yourdictionary.com/articles/funny-fortune-cookie-sayings.html
		String[] fortunes = {"The fortune you seek is in another cookie.", "A closed mouth gathers no feet.",
				"A conclusion is simply the place where you got tired of thinking.", "A cynic is only a frustrated optimist.",
				"A foolish man listens to his heart. A wise man listens to cookies.", "You will die alone and poorly dressed.",
				"A fanatic is one who can't change his mind, and won't change the subject.", "If you look back, you’ll soon be going that way.",
				"You will live long enough to open many fortune cookies.", "An alien of some sort will be appearing to you shortly.",
				"Do not mistake temptation for opportunity.", "He who laughs last is laughing at you.",
				"He who throws dirt is losing ground.", "Some men dream of fortunes, others dream of cookies.",
				"We don’t know the future, but here’s a cookie.", "You will be hungry again in one hour.",
				"It’s about time I got out of that cookie.", "Never forget a friend. Especially if he owes you.",
				"All fortunes are wrong except this one.", "I am worth a fortune."};
		
		Random generate = new Random();
		int nr = generate.nextInt(fortunes.length);
		
		return new FortuneCookie(fortunes[nr]);
		
		
	}
	
	

}
