
public class SuspectCard 
{
	private String firstName;
	private String lastName;
	private String eyeColor;
	private String hairColor;
	private int age;
	private String title;
	private String description;

	public SuspectCard(String f, String l, String e, String h, int a, String t, String d)
	{
		this.firstName = f;
		this.lastName = l;
	    this.eyeColor = e;
		this.hairColor = h;
		this.age = a;
		this.title = t;
		this.description = d;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEyeColor() {
		return eyeColor;
	}
	
	public String getHairColor() {
		return hairColor;
	}

	public int getAge() {
		return age;
	}

	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
}
