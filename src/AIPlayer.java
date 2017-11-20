import java.util.Random;

public class AIPlayer extends Competitor {
	Random rand = new Random();
	int difficulty = 0;
	String aiNames[] = {"GLaDOS", "HAL 9000", "Ultron", "SHODAN"};

	public AIPlayer() {
		// TODO Auto-generated constructor stub
		int randNum = rand.nextInt(aiNames.length-1);
		this.name = aiNames[randNum];
		
		System.out.println("AI player's name is " + this.name);
	}

}
