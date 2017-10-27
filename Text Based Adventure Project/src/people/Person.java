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
	public Person(String firstName, String lastName, String gender, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String chooseMove() 
	{
		if(x.next() == "n" )
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
