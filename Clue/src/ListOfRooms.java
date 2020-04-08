import java.util.ArrayList;

public class ListOfRooms {

	public static void main(String[] args) 
	{
		ArrayList <RoomCard> Rooms = new ArrayList <RoomCard>();
		
		Rooms.add(new RoomCard("Kitchen", "A favorite room of anyone wishing to steal a midnight snack"));
		Rooms.add(new RoomCard("Dining Room", "It would be so nice to have a family dinner all together...if they could all get along for half an hour"));
		Rooms.add(new RoomCard("Lounge", "A perfect place to curl up with a good book and a hot cup of tea on a rainy afternoon"));
		Rooms.add(new RoomCard("Ballroom", "A beautiful open space, perfect for any sort of event...after being deep cleaned"));
		Rooms.add(new RoomCard("Hall", "A relatively large open passage...but it can be quite creepy at night"));
		Rooms.add(new RoomCard("Conservatory", "A bright, open room that looks positively amazing early in the morning"));
		Rooms.add(new RoomCard("Billiard Room", "A perfect room for friends to gather in to play billards"));
		Rooms.add(new RoomCard("Library", "A book lovers paridise, a whole room lined from top to bottom with shelves and shelves of books"));
		Rooms.add(new RoomCard("Study", "If you can't find the elusive owner of the mansion, you might want to check in the study"));
	}
	

}
