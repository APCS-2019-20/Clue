import java.util.ArrayList;
import java.util.Arrays;

public class Board 
{
	//Board ArrayList, for simplicity only contains rooms, no spaces 
	static ArrayList<String> board = new ArrayList<String>();
	
	public static void createBoard()
	{
		
			board.add("Kitchen");
			board.add("Ballroom");
			board.add("Conservatory");
			board.add("Billiard Room");
			board.add("Library");
			board.add("Study");
			board.add("Hall");
			board.add("Lounge");
			board.add("Dining Room");
			board.add("Stairway");
	}
	
	public static void selectRoom()
	{
		createBoard();
		System.out.println("Which room would you like to go to?");
		for(int i=0; i<board.size(); i++)
		{
			System.out.println(board.get(i));
		}
	}

}
