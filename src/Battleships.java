//import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Battleships {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Battleships!");
		
		//TimeUnit.SECONDS.sleep(0);
		//Thread.sleep(1000);
		
		System.out.println("Please input your name...");
		String input = scan.nextLine();
		Player player1 = new Player(input);
		System.out.println("Great, let's get started " + player1.name + ".");

		System.out.println();
		
		AIPlayer firstAI = new AIPlayer();
		System.out.println("Your AI opponent's name is " + firstAI.name);
		
		System.out.println();
		System.out.println("END");
		
		//newBoard.createBoard();

	}
	


}
