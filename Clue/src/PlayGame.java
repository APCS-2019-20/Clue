
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) 
	{
		//Test
		//Assign player character
		//Game selects person, place, and weapon then continues 
		//Give character 3 cards (weapon, person, place); have to guess other cards 
		//Ask which room go to? 
		//Make suggesstions in rooms 
			//Pull up list of people, weapons, and places 
			//Ask if want to suggest person, place, or weapon 
			//Player keeps track of wrong answers 
		//Make accusation when ready 
		

	//	intro();
		
		Board testBoard = new Board();
		testBoard.setupMurder();
		
		Player testPlayer = new Player(testBoard);
		testBoard.introduction(testPlayer);
		
		
		boolean dummy = true;
		while (dummy)
		{
			testBoard.basePrompt(testPlayer);
			testBoard.promptPlayerSuggestion(testPlayer);
			testBoard.checkSuggestion(testPlayer);
		}
		

	}
	
	
	private static void intro() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Game of Clue! Do you want instructions? Yes (1) or No (2)?");
		int choice = userInput.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Players wander around the Clue game board mansion trying to solve the mystery of who was killed, by which weapon, and in what room. "
					+ "\nClue cards are given to each player but this is still not enough to solve the mystery. "
					+ "\nClue board game players begin making their accusations on who, where, and with what they think the murder took place. "
					+ "\nIf another player can prove them wrong by showing them one of his clue cards, the game continues and intensifies as more and more clues are given.");
		
		}
		
		
		System.out.println("");
		System.out.println("Let's get started!");
		System.out.println();
	}

	
	
	


}
