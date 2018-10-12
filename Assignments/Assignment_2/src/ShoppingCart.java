/**
 * Description: ShoppingCart provides a place to hold all
 * the items a customer might wish to buy in a placeholder
 * that can be edited before an order is placed.
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private Calendar timeStamp; // Holds creation date/time of the Cart
    private final String cartID; // Hold a unique CartID
    private ArrayList<Item> items; // Hold all users items
    private int total; // Hold total price of items in Cart
    private Customer customer; // Hold the users Customer class
    private boolean cartClosed; // Holds Status of the Cart 
    						// True == Open 
    						// False == Closed
    
    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart(Customer customer)
    {
        this.timeStamp = getTimeStamp();
        this.cartID = makeCartId();
        this.customer = customer;
        this.items = new ArrayList<>();
        this.total = 0;
        this.cartClosed = false;
    }// End Constructor
    
    /*
     * Methods
     */
    
    // Creates a time-stamp for the cart creation
    private Calendar getTimeStamp() {
    	return Calendar.getInstance();
    }
    
    // Creates a unique Cart ID
    private String makeCartId() {
    	String uniqueID = UUID.randomUUID().toString();
    	return uniqueID;
    }
    
    // Closes the cart for editing
    public void closeCart() {
    	this.cartClosed = true;
    }
    
    // Adds an item to the cart
    public void addItem(Item item) {
    	if (cartClosed == false) {
    		this.items.add(item);
    	}
    	else {
    		System.out.println("Sorry, this cart is closed");
    	}
    }
    
    // Removes and item to the cart
    public void removeItem(Item item) {
    	if (cartClosed == false) {
    		this.items.remove(item);
    	}
    	else {
    		System.out.println("Sorry, this cart is closed");
    	}
    }
    
    /*
     * Getters and Setters
     */

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isCartClosed() {
		return cartClosed;
	}

	public void setCartClosed(boolean cartOpen) {
		this.cartClosed = cartOpen;
	}

	public String getCartID() {
		return cartID;
	}

	public void setTimeStamp(Calendar timeStamp) {
		this.timeStamp = timeStamp;
	}
    
	public String listCartItems() {
		String string1 = "";
		
		for (int i=0; i<this.items.size(); i++) {
			string1 += ("\n" + this.items.get(i));
		}
		
		return string1;
	}
    
}// End Class ShoppingCart
