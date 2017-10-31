package items;

public class Item 
{
	public String description;
	private boolean consumable;
	
	public Item(String description, boolean consumable)
	{
		this.description = description;
		this.consumable = consumable;
	}
}
