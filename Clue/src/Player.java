import java.util.ArrayList;

public class Player 
{
	
	private String name;
	private String roomCard;
	private String weaponCard;
	private String playerCard;
	private String currentRoom;
	
	public ArrayList<String> info = new ArrayList<String>();
	
	private String weaponSuggestion;
	private String playerSuggestion;
	
	public Player(Board b)
	{
		// fill this out later with more specific things
		// needed to create a new player and include board player is playing on
	}
	
	public void displayInfo()
	{
		for (int i=0; i< info.size(); i++)
		{
			System.out.print("| " + info.get(i) + " ");
		}
		System.out.println();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roomCard
	 */
	public String getRoomCard() {
		return roomCard;
	}

	/**
	 * @param roomCard the roomCard to set
	 */
	public void setRoomCard(String roomCard) {
		this.roomCard = roomCard;
	}

	/**
	 * @return the weaponCard
	 */
	public String getWeaponCard() {
		return weaponCard;
	}

	/**
	 * @param weaponCard the weaponCard to set
	 */
	public void setWeaponCard(String weaponCard) {
		this.weaponCard = weaponCard;
	}

	/**
	 * @return the playerCard
	 */
	public String getPlayerCard() {
		return playerCard;
	}

	/**
	 * @param playerCard the playerCard to set
	 */
	public void setPlayerCard(String playerCard) {
		this.playerCard = playerCard;
	}

	/**
	 * @return the currentRoom
	 */
	public String getCurrentRoom() {
		return currentRoom;
	}

	/**
	 * @param currentRoom the currentRoom to set
	 */
	public void setCurrentRoom(String currentRoom) {
		this.currentRoom = currentRoom;
	}

	/**
	 * @return the weaponSuggestion
	 */
	public String getWeaponSuggestion() {
		return weaponSuggestion;
	}

	/**
	 * @param weaponSuggestion the weaponSuggestion to set
	 */
	public void setWeaponSuggestion(String weaponSuggestion) {
		this.weaponSuggestion = weaponSuggestion;
	}

	/**
	 * @return the playerSuggestion
	 */
	public String getPlayerSuggestion() {
		return playerSuggestion;
	}

	/**
	 * @param playerSuggestion the playerSuggestion to set
	 */
	public void setPlayerSuggestion(String playerSuggestion) {
		this.playerSuggestion = playerSuggestion;
	}
	

}
