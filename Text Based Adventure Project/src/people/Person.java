package people;
import java.util.Scanner;
import rooms.Room;

public class Person 
{
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	static Scanner x = new Scanner(System.in);
	public Person(String firstName, String lastName, String gender, String DOB )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String chooseMove(Scanner in) 
	{
		String response = "";
		System.out.println("Where would you like to move, " + this.firstName + "?");
		if(in.next() == "n" || in.next() == "N")
		{
			response = "North";
			System.out.println("You have moved into a room");
		}
		return response;
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
