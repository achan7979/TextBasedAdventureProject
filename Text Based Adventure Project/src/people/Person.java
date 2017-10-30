package people;
import java.util.Scanner;
import rooms.Room;

public class Person 
{
	public String firstName;
	private String lastName;
	private String gender;
	private int age;
	public Person(String firstName, String lastName, String gender, String DOB )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String chooseMove(String string) 
	{
		if(string.equals("n") || string.equals("N") || string.equals("north") || string.equals("North"))
		{
			return "You move down a deep dark eerie hallway a few meters";
		}
		else if(string.equals("s") || string.equals("S") || string.equals("south") || string.equals("South"))
		{
			return "You move into a room";
		}
		else if(string.equals("e") || string.equals("E") || string.equals("east") || string.equals("East"))
		{
			return "East";
		}
		else if(string.equals("w") || string.equals("W") || string.equals("west") || string.equals("West"))
		{
			return "West";
		}
		else
		{
			return "Please enter a valid direction.";
		}
	}

	public String getFirstName() 
	{
		return this.firstName;
	}

	public void setRoom(Room room) 
	{
		
	}

	public char[] print() 
	{
		
	}

	public void printRoom() 
	{
		
		
	}


}
