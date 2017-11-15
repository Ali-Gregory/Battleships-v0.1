//import static System;

public class board {
	
	public void createBoard() {
		int size = 5;
		int width = size * 2;
		
		System.out.print("  |");

		for (int i = 1; i < (size + 1); i++) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		System.out.print("--|");
		
		for (int j= 0; j < (width + 1); j++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		System.out.print("END");
		
	}
	
	public void displayBoard() {
		
	}

}
