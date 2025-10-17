public class Board {
	//creating prvate char arrays for both players
	private char[][] player1Board;
	private char[][] player2Board;
	
	public Board() {
		//creates the board as a 10x10 using the previously made char arrays\
		for readability and if i wanna create a new board easier with diff sizes
		player1Board = new char[10][10];
		player2Board = new char[10][10];
		
		//nested for loop for filling each board with water cells\
		will use ~ as water cells
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				//replaces the cells with ~ to do dis i replaced the cells with [i][j] 
				//found this out using guess logic and it worked so i kept i
				player1Board[i][j] = "~";
				player2Board[i][j] = "~";
			}
		}
		//will now study the toString() method on w3School
	}
}

