//https://www.w3schools.com/java/java_arrays.asp

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
				//https://www.w3schools.com/java/java_arrays_loop.asp
				player1Board[i][j] = '~';
				player2Board[i][j] = '~';
			}
		}
	}
		//will now study the toString() method on w3School
		//creating method for toString
		/*
		 * https://www.w3schools.com/java/ref_string_tostring.asp?utm_source=chatgpt.com
		 * used this link to understand toStrng
		 * overwrote/override the built in method with ours for out purposes
		 */
		public String toString() {
			
			String player1BoardStr = "Player 1 Board:\n";
			String player2BoardStr = "Player 2 Board: \n";
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
				//creates strings that will be added onto each other 

					player1BoardStr += player1Board[i][j] + " ";
					player2BoardStr += player2Board[i][j] + " ";
				}
				//creates a new line every 10 cells
			player1BoardStr += "\n";
			player2BoardStr += "\n";
			}
			return player1BoardStr + "\n" + player1BoardStr;
			
			}
			//tester method for testing type 
		public static void main(String[] args) {
			Board testBoard = new Board();
			System.out.println(testBoard);
		}
}


			//below is all my stuped code commented out with the other comments not deleting so i know what i did wrong this time
			
			//below is my broken code because i tried to append a new line in my string however what i actlly did was
			//overwrite the entire string
			
	//layer1BoardStr = player1Board + "\n";
//		player2BoardStr = player2Board + "\n";
				//creates a new line after each 10 cells made hopefully
				
			//turn(player1BoardStr.toString() + "\n" + player2Board.toString());
			//returns both arrays with the water/~ hopefully if not then i will have to change some things\
			// / n for creating a new line to seperate the 2 diff boards
