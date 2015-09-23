import java.util.Random;


public class Dice {

	public static int roll(){
		Random randomGenerator = new Random();
		//r.nextInt(High-Low) + Low;
		int randomInt = randomGenerator.nextInt(6-1)+1;
		return randomInt;
		
	}
}
