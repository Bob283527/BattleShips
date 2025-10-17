public class Board {
	//creating prvate char arrays for both players
	private char[][] player1Board;
	private char[][] player2Board;
	
	public Board() {
		//creates the board as a 10x10 using the previously made char arrays\
	//for readability and if i wanna create a new board with diff sizes of cells
		player1Board = new char[10][10];
		player2Board = new char[10][10];
		
		//nested for loop for filling each board with water cells\
		//will use ~ as water cells
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				//replaces the cells with ~ to do dis i replaced the cells with [i][j] 
				//found this out using guess logic and it worked so i kept i
				player1Board[i][j] = '~';
				player2Board[i][j] = '~';
			}
		}
	}
		//will now study the toString() method on w3School
		//creating method for toString
		public String toString() {
			
			String player1BoardStr = "Player 1 Board:\n";
			String player2BoardStr = "Player 2 Board: \n";
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
				//creates strings that will be added onto each other 
					player1BoardStr += player1Board[i][j] + " ";
					player2BoardStr += player2Board[i][j] + " ";
				}
			}
			player1BoardStr += "\n";
			player2BoardStr += "\n";
			//below is my broken code because i tried to append a new line in my string however what i actlly did was
			//overwrite the entire string
			
	//layer1BoardStr = player1Board + "\n";
//		player2BoardStr = player2Board + "\n";
				//creates a new line after each 10 cells made hopefully
				
			return(player1BoardStr.toString() + "\n" + player2Board.toString());
			//returns both arrays with the water/~ hopefully if not then i will have to change some things\
			// / n for creating a new line to seperate the 2 diff boards
			}
			//tester method for testing type 
		public static void main(String[] args) {
			Board testBoard = new Board();
			System.out.println(testBoard);
		}
}

