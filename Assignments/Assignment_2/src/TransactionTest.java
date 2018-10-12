/**
 * Description: TransactionTest is a class that does one thing only
 * It provides methods for testing out different test scenarios 
 * for our Shopping Cart Transaction classes
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

import java.util.Calendar;

public class TransactionTest
{
    
    /**
     * main method to execute the TransactionTest methods
     */
    public static void main(String[] args)
    {
       TransactionTest test = new TransactionTest();
       test.transaction1(); // calls the method with our test scenario
       test.transaction2(); // calls the method with our test scenario 2
    }
    
    /*
     * Description: First test scenario
     * Return: void
     * Parameters: none
     */
    public void transaction1()
    {  
        
    	System.out.println("\n********************************* Transaction 1 ***************************************\n");
	    //1. Create New Customer
	    Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");
	    
	    //2. Create shopping Cart
	    ShoppingCart shoppingCart = new ShoppingCart(customer);
	    //3. Add 3 items
	    Item item1 = new Item("Iphone", 64567845678L);
	    Item item2 = new Item("Iphone XS", 6989434567L);
	    Item item3 = new Item("Iphone XR", 98765434567L);
	    
	    item1.setPrice(1000);
	    item2.setPrice(1500);
	    item3.setPrice(1200);
	    
	    shoppingCart.addItem(item1);
	    shoppingCart.addItem(item2);
	    shoppingCart.addItem(item3);
	    
	    //4. Finalize the cart and create an order
	    Order order = new Order(customer, shoppingCart);
	    
	    //5. Add a delivery address for the order
	    Address address = new Address("Reaskaun", "Ennis", "V56IY3R", "Ireland");
	    order.setDeliveryAddress(address);
	    
	    //6. Add a payment
	    Calendar calendar = Calendar.getInstance();
	    calendar.clear();
	    calendar.set(Calendar.MONTH, 9);
	    calendar.set(Calendar.YEAR, 2020);
	    
	    Payment payment = new Payment(customer, 2345678675436543L, calendar, address, "AIB", "MasterCard");
	    
	    //7. Validate the payment
	    //8. Send success email
	    order.processOrder();
	    order.confirmOrder(payment.isValidCard());
   
	    System.out.println("\n********************************* End Transaction 1 ***************************************\n");
    
    }// End Test Scenario 1
    
    /*
     * Description: Second test scenario
     * Return: void
     * Parameters: none
     */
    public void transaction2() {
    	
    	System.out.println("\n********************************* Transaction 2 ***************************************\n");
    	
    	//1. Create customer
    	Customer customer = new Customer("Brian", "Sweetman", "b.sweet@ymail.com");
    	//2. Create Cart
    	ShoppingCart shoppingCart = new ShoppingCart(customer);
    	//3. The user adds 3 items
    	Item item1 = new Item("Iphone", 64567845678L);
	    Item item2 = new Item("Iphone XS", 6989434567L);
	    Item item3 = new Item("Iphone XR", 98765434567L);
	    
	    item1.setPrice(1000);
	    item2.setPrice(1500);
	    item3.setPrice(1200);
	    
	    shoppingCart.addItem(item1);
	    shoppingCart.addItem(item2);
	    shoppingCart.addItem(item3);
	    
    	//4. Display the Cart
	    System.out.println("Your cart items are:" + shoppingCart.listCartItems());
	    
    	//5. Removes an item
	    shoppingCart.removeItem(item1);
	    
    	//6. Confirms the cart
	    Order order = new Order(customer, shoppingCart);
	    Address address = new Address("Reaskaun", "Ennis", "V56IY3R", "Ireland");
	    order.setDeliveryAddress(address);
	    
    	//7. Confirms the order
    	//8. The user submits a payment
	    Calendar calendar = Calendar.getInstance();
	    calendar.clear();
	    calendar.set(Calendar.MONTH, 9);
	    calendar.set(Calendar.YEAR, 2020);
	    
	    Payment payment = new Payment(customer, 2345678675436543L, calendar, address, "AIB", "NasterCard");
	    
    	//9. Payment not valid
    	//10. Email
	    order.confirmOrder(payment.isValidCard());
    
	    System.out.println("********************************* End Transaction 2 ***************************************");
	    
    }// End Test Scenario 2
}// End Class TransactionTes
