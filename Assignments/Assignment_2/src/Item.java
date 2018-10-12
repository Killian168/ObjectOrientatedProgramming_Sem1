 /**
 * Description: The Item class holds the information about
 * a single shopping item
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

public class Item {
	private String name;
	private int price;
	private long itemId;

	/*
	 * Class Constructor
	 */
	public Item(String itemName, long id) {
		name = itemName;
		itemId = id;
	}
	
	/*
	 * Methods
	 */
	
	// Converts the Item to a String
	@Override // Overrides a default
	public String toString(){
		
		String out = "Item Id: " + itemId + "\t" + name +"\tPrice: " + price;
		
		return out;
	}
	
	/*
	 * Getters and Setters
	 */
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}// End Class Item
