import java.util.Scanner;

public class Menu {
	
	Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		System.out.println("Type 1 for AI mode");
		System.out.println("Type 2 for PvP mode");
		System.out.println("Type r for Rules");
		String choice = scanner.nextLine();
		if (choice.equals("r")) {
			//i want to call the rules from readme idk how
			System.out.println("test");
		}
		
	}
	public static void main(String[] args) {
	Menu test = new Menu();
}

}

