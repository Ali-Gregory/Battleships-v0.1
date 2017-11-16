//import static System;

public class board {
	
	char[][] boardArray;

	public board(int size) {
		boardArray = new char[size + 2][size + 2];
		
		//Populate Array with row/column numbers and styling
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray.length; j++) {
				
		
				if (j == 1) {
					boardArray[i][j] = '|';
					
				}
				else if ((i == 1)) {
						boardArray[i][j] = '-';
				}
				else if ((i == 0) && (1 < j) ) {
					boardArray[i][j] = (char) (j + 47);
				}
				else if ((j == 0) && (1 < i ) ) {
					boardArray[i][j] = (char) (i + 47);
				}
			}
		}
	}
	
	public void drawBoard() {
		for (char[] u : boardArray) {
			System.out.println(u);
		}
	}
	

	
	public void updateBoard() {
		
	}

}
