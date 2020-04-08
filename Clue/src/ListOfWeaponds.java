import java.util.ArrayList;

public class ListOfWeaponds {

	public static void main(String[] args) 
	{
		ArrayList <WeaponCard> Weapons = new ArrayList <WeaponCard>();
		
		Weapons.add(new WeaponCard("Revolver", "A multi-chambered hand gun, capable of shooting multiple shots (if you want to fill something...or someone with lead)"));
		Weapons.add(new WeaponCard("Knife", "A long, straight knife with a relatively thin blade (sharp enough to slice through flesh...)"));
		Weapons.add(new WeaponCard("Lead Pipe", "A good sized length of hollow lead pipe (heavy enough to kill someone...)"));
		Weapons.add(new WeaponCard("Rope", "A solid 6ft of sturdy rope (perfect to strangle someone with...)"));
		Weapons.add(new WeaponCard("Candlestick", "A beautiful piece of metal work, only the finest for the mansion (sturdy piece of metal to hit someone over the head with...)"));
		Weapons.add(new WeaponCard("Wrench", "Very handy tool for everyday hany work (also quite heafty if you were to swing it)"));
	}

}
