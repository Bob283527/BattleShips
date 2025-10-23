//https://www.w3schools.com/java/java_arrays.asp

public class Board {
	//creating prvate char arrays for both players
	private char[][] player1Board;
	private char[][] player2Board;
	
	//ship lengths
	public int carrierPoint = 5;
	public int battleshipPoint = 4;
	public int cruiserPoint = 3;
	public int submarinePoint = 3;
	public int destroyerPoint = 2;


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
			return player1BoardStr + "\n" + player2BoardStr;
			
			}
			
			//Method for diff types of ships
		public void placeShips() {
			/*
			 * For each ship ask the user for the row letter and column number
			 * ask for Horizontal and Vertical positions
			 * Convert row letter to number
			 * get ship length based on ship type used from the vars above
			 * check if ship placement is inside the board
			 * check if cells already have a ship inside
			 * if invaluid then show msg for user and reprompt them
			 * if valid then fill cells with S for ship
			 * Repeat until all ships placed myb eloop prob 
			 * print board to confirm placements after each input from user then print final board after confirming one last time
			 * 
			 * starting code I have rgiht now:
			 * Scanner scan = new Scanner(System.in);
			 * for (int i = 0; i < 6; i++) { 5 ships so i use 6
			 * 	System.out.println("Enter row letter (A-J): ");
			 * 	char rowChar = scan.nextLine(); //check for upercase o rlowercase later
			 * 	System.out.println("Enter column num (1-10): ");
			 * 	int colNum = scan.next();
			 * 	System.out.println("Horizontal (H) or Vertical (V)? : ");
			 *  char dirChar = scan.next();
			 * 
			 * have to convert letter to num
			 * need to get ship len from vars above
			 * need a boundary check
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
