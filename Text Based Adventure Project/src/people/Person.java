package people;
import java.util.Map;
import java.util.Scanner;

import board.Board;
import rooms.Room;

public class Person 
{
	public String firstName;
	public String lastName;
	public String gender;
	public String age;
	
	public Person(String firstName, String lastName, String gender, String age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String chooseMove(Board factory, String move, int xPos, int yPos) 
	{
		if(move.equals("n") || move.equals("N") || move.equals("north") || move.equals("North"))
		{
			if(yPos == 1)
				return "You cannot move north anymore, there is a wall. Please try another move.";
			else
			{
				yPos--;
				return "You move to the north.";
			}
		}
		else if(move.equals("s") || move.equals("S") || move.equals("south") || move.equals("South"))
		{
			if(yPos == 5)
				return "You cannot move south anymore, there is a wall. Please try another move.";
			else
			{
				yPos++;
				return "You move to the south.";
			}
		}
		else if(move.equals("e") || move.equals("E") || move.equals("east") || move.equals("East"))
		{
			if(xPos == 5)
				return "You cannot move east anymore, there is a wall. Please try another move.";
			else
			{
				xPos++;
				return "You move to the east.";
			}
		}
		else if(move.equals("w") || move.equals("W") || move.equals("west") || move.equals("West"))
		{
			if(xPos == 1)
				return "You cannot move west anymore, there is a wall. Please try another move.";
			else
			{
				xPos--;
				return "You move to the west.";
			}
		}
		else
		{
			return "Please enter a valid direction.";
		}
	}

	public void setRoom(Room room) 
	{
		
	}

	public String print() 
	{
		if();
	}

	public void printRoom() 
	{
		
		
	}


}
