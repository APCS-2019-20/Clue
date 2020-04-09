import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Board 
{
	//ArrayLists for base info
	private ArrayList<String> Rooms = new ArrayList<String>();
	private ArrayList<String> Weapons = new ArrayList<String>();
	private ArrayList<String> Players = new ArrayList<String>();
	
	//ArrayLists for cards
	private ArrayList<String> roomCards = new ArrayList<String>();
	private ArrayList<String> weaponCards = new ArrayList<String>();
	private ArrayList<String> playerCards = new ArrayList<String>();
	
	//Creates murderRoom, murderWeapon, and murderer for each game
	private String murderRoom;
	private String murderWeapon;
	private String murderer;
	
	//ArrayList for other players' cards 
	private ArrayList<String> cardsIfWrong = new ArrayList<String>();
	
	//Other necessary statics 
	static Scanner scanner = new Scanner(System.in);
	
	//Automatically fills ArrayLists when instantiate a new board 
	public Board()
	{
		
			Rooms.add("Kitchen");
			Rooms.add("Ballroom");
			Rooms.add("Conservatory");
			Rooms.add("Billiard Room");
			Rooms.add("Library");
			Rooms.add("Study");
			Rooms.add("Hall");
			Rooms.add("Lounge");
			Rooms.add("Dining Room");
			Rooms.add("Cellar");
			
			roomCards.add("Kitchen: A favorite room of anyone wishing to steal a midnight snack");
			roomCards.add("Dining Room: It would be so nice to have a family dinner all together...if they could all get along for half an hour");
			roomCards.add("Lounge: A perfect place to curl up with a good book and a hot cup of tea on a rainy afternoon");
			roomCards.add("Ballroom: A beautiful open space, perfect for any sort of event...after being deep cleaned");
			roomCards.add("Hall: A relatively large open passage...but it can be quite creepy at night");
			roomCards.add("Conservatory: A bright, open room that looks positively amazing early in the morning");
			roomCards.add("Billiard Room: A perfect room for friends to gather in to play billards");
			roomCards.add("Library: A book lovers paridise, a whole room lined from top to bottom with shelves and shelves of books");
			roomCards.add("Study: If you can't find the elusive owner of the mansion, you might want to check in the study");
			roomCards.add("Cellar: A scary, dark, place");
			
			Weapons.add("Wrench");
			Weapons.add("Candlestick");
			Weapons.add("Lead Pipe");
			Weapons.add("Rope");
			Weapons.add("Revolver");
			Weapons.add("Knife");
			
			weaponCards.add("Revolver: A multi-chambered hand gun, capable of shooting multiple shots (if you want to fill something...or someone with lead)");
			weaponCards.add("Knife: A long, straight knife with a relatively thin blade (sharp enough to slice through flesh...)");
			weaponCards.add("Lead Pipe: A good sized length of hollow lead pipe (heavy enough to kill someone...)");
			weaponCards.add("Rope: A solid 6ft of sturdy rope (perfect to strangle someone with...)");
			weaponCards.add("Candlestick: A beautiful piece of metal work, only the finest for the mansion (sturdy piece of metal to hit someone over the head with...)");
			weaponCards.add("Wrench: Very handy tool for everyday hany work (also quite heafty if you were to swing it)");
			
			Players.add("Miss Scarlet");
			Players.add("Mrs. White");
			Players.add("Mrs. Peacock");
			Players.add("Colonel Mustard");
			Players.add("Professor Plum");
			Players.add("Mr. Green");
			
			playerCards.add(" Mrs. Peacock: Mrs. Peacock is a socialite and a terrible gossip. Inviting her to your parties can be a mistake. Not inviting her can be far worse.");
			playerCards.add("Colonel Mustard: Colonel Mustard playes in the stereotypical 'great white hunter' and is the fianc�e of Mrs. Peacock.");
			playerCards.add("Mr. Green: A central character in the village, Green spends most of his time attending to community affairs and ensuring the peace and quiet of the village is not disrupted.");
			playerCards.add("Professor Plum: Inventor, Archaeologist, Professor, Explorer. Plum is all of these and continues his quest for knowledge and innovation.");
			playerCards.add(" Miss Scarlet: She is a huge drama queen and always has to be the center of attention.");
			playerCards.add("Mrs. White: Maid and Cook to the Boddy family at the mansion, Mrs. White has given her services for over 40 years. She is the backbone of the mansion.");
			
	}
	
	//Randomly selects murder/room/weapon and removed from "cards" ArrayList
	public void setupMurder()
	{
		Random rand = new Random();
		
		int randRoom = rand.nextInt(9);
		murderRoom = roomCards.get(randRoom);
		roomCards.remove(randRoom);
		
		int randWeapon = rand.nextInt(6);
		murderWeapon = weaponCards.get(randWeapon);
		weaponCards.remove(randWeapon);
		
		int randPlayer = rand.nextInt(6);
		murderer = playerCards.get(randPlayer);
		playerCards.remove(randPlayer);
		
	}
	
	//Error check & display 
	public void displayMurder()
	{
		System.out.println("Murder: " + murderer);
		System.out.println("Room: " + murderRoom);
		System.out.println("Weapon: " + murderWeapon);
	}
	
	//Randomly assigns player character 
	public String assignName()
	{
		Random rand = new Random();
		int randPlayer = rand.nextInt(5);
		String n = playerCards.get(randPlayer);
		return n;
		
	}
	
	//Randomly assigns player room card 
	public String pickRoomCard()
	{
		Random rand1 = new Random();
		int randRoom = rand1.nextInt(8);
		String r = roomCards.get(randRoom);
		return r;
	}
	
	//Randomly assigns player weapon card
	public String pickWeaponCard()
	{
		Random rand2 = new Random();
		int randWeapon = rand2.nextInt(5);
		String w = weaponCards.get(randWeapon);
		return w;
	}
	
	//Randomly assigns player a player card
	public String pickPlayerCard()
	{
		Random rand3 = new Random();
		int randPlayer = rand3.nextInt(5);
		String p = playerCards.get(randPlayer);
		return p;
	}
	
	//Display game and tells player character name
	public void introduction(Player p)
	{
		System.out.println("Today you will be playing as: " + p.getName());
		//System.out.println("Let's get started");
	}
	
	//Suggestions & accusations 
	public void basePrompt(Player p)
	{
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println(p.getName() + ", you are currently in the " + p.getCurrentRoom() + " with the following information:");
		p.displayInfo();
		System.out.println();
		System.out.println("Would you like to (1) enter a room, (2) make an accusation, or (3) end the game?");
		
		String input = scanner.nextLine();
		int choice = Integer.parseInt(input);
		
		if (choice==1)
			promptPlayerRoom(p);
		if (choice==2)
			accusation(p);
		if (choice==3)
			System.out.println("Thanks for playing");
			System.exit(0);
		
	}
	
	//Prompts player to select room and reset current room
	public void promptPlayerRoom(Player p)
	{
		System.out.println("Which room would you like to examine?");
		for (int i=0; i < Rooms.size(); i++)
		{
			System.out.println(i + ": " + Rooms.get(i));
		}
		String input = scanner.nextLine();
		int choice = Integer.parseInt(input);
		
		p.setRoomCard(Rooms.get(choice));
	}
	
	//Prompts player to pick weapon and murderer 
	public void promptPlayerSuggestion(Player p)
	{
		System.out.println("You are now in the: " + p.getCurrentRoom());
		System.out.println("What weapon would you like to suggest?");
		for (int i=0; i < Weapons.size(); i++)
		{
			System.out.println(i + ": " + Weapons.get(i));
		}
		String input = scanner.nextLine();
		int choice = Integer.parseInt(input);
		
		p.setWeaponSuggestion(Weapons.get(choice));
		
		System.out.println("What person would you like to suggest?");
		for (int i=0; i < Players.size(); i++)
		{
			System.out.println(i + ": " + Players.get(i));
		}
		 input = scanner.nextLine();
		 choice = Integer.parseInt(input);
		
		p.setPlayerSuggestion(Players.get(choice));
		
		System.out.println("Your Suggestion: " + p.getPlayerSuggestion() + " in the " + p.getCurrentRoom() + " with the " 
				+ p.getWeaponSuggestion() + ".");
		System.out.println();
	}
	
	//Checks suggestion, utilizes cardsIfWrong 
	public void checkSuggestion(Player p)
	{
		if (!p.getCurrentRoom().equals(murderRoom))
			cardsIfWrong.add(p.getCurrentRoom());
		if (!p.getWeaponSuggestion().equals(murderWeapon))
			cardsIfWrong.add(p.getWeaponSuggestion());
		if (!p.getPlayerSuggestion().contentEquals(murderer))
			cardsIfWrong.add(p.getPlayerSuggestion());
		
		if (cardsIfWrong.size() == 0)
		{
			System.out.println("None of the other players show you any cards.");
		}
		else
		{
			Random rand = new Random();
			int randCard = rand.nextInt(cardsIfWrong.size());
			String w = cardsIfWrong.get(randCard);
			System.out.println("One of the other players show you the follwoing card: " + w);
			p.info.add(w);
		}
		cardsIfWrong.clear();
		System.out.println("Press 'Enter' to continue");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}
	
	//Accusation part 
	public void accusation(Player p)
	{
		System.out.println("What player would you like to accuse?");
		for (int i=0; i < Players.size(); i++)
		{
			System.out.println(i + ": " + Players.get(i));
		}
		String input = scanner.nextLine();
		int choice = Integer.parseInt(input);
		
		String pAccusation = Players.get(choice);
		
		System.out.println("What weapon do you think they used?");
		for (int i=0; i < Weapons.size(); i++)
		{
			System.out.println(i + ": " + Weapons.get(i));
		}
		input = scanner.nextLine();
		choice = Integer.parseInt(input);
		
		String wAccusation = Weapons.get(choice);
		
		System.out.println("In which room did the murder occur?");
		for (int i=0; i < Rooms.size(); i++)
		{
			System.out.println(i + ": " + Rooms.get(i));
		}
		input = scanner.nextLine();
		choice = Integer.parseInt(input);
		
		String rAccusation = Rooms.get(choice);
		
		if (pAccusation.equals(murderer) && wAccusation.equals(murderWeapon) && rAccusation.equals(murderRoom))
		{
			System.out.println("You solved the murder! Congratulations, you win!!!");
			System.exit(0);
		}
		else
		{
			System.out.println("Sorry, but you were wrong. You lose. ");
			System.exit(0);
		}
	}

}
