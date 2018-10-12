/**
 * Description: The order class is responsible for processing
 * an order and sending the user its information
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

import java.util.UUID;
import java.util.ArrayList;

public class Order {

	private Customer customer;
	private ShoppingCart shoppingCart;
	private ArrayList<Item> orderItems;
	private String orderNumber;
	private Payment payment;
	private Email email;
	private double total;
	private Address deliveryAddress;
	private Address billingAddress;
	private boolean status; // True == Confirmed
							// False == Not Confirmed
	
	/*
	 * Class Constructor
	 */
	public Order(Customer customer, ShoppingCart shoppingCart) {
		this.customer = customer;
		this.shoppingCart = shoppingCart;
		this.orderItems = shoppingCart.getItems();
		this.orderNumber = makeOrderNumber();
		this.payment = null;
		this.email = null;
		this.status = false;
		this.total = getTotalItems();
		this.setDeliveryAddress(customer.getDeliveryAddress());
	}// End constructor
	
	/*
	 * Methods
	 */
	
	// Processes the Order
	public void processOrder() {
		
		// If there is no Delivery address prompt error message
		if (!(this.deliveryAddress.isEmpty())) {
			System.out.println("Error - You have no delivery address");
		}
		
		// If there is no Billing Address set it equal to the Delivery Address
		if (this.billingAddress == null) {
			this.billingAddress = this.deliveryAddress;
		}
		
		// Removes all the items in the shopping cart items array (Cleans the Cart)
		for (int i=0; i<this.shoppingCart.getItems().size(); i++) {
			this.shoppingCart.getItems().remove(i);
		}
		
		// Close the cart for editing
		this.shoppingCart.closeCart();
	}
	
	// Confirms the Order and send out an email with the order details
	public void confirmOrder(boolean payment) {
		this.email = new Email(this.customer, this, payment);
		// Sends Email
		this.email.sendEmail(email.generateEmail(payment));
		this.status = true;
	}
	
	// Updates the users order
	public void update(Customer customer, ShoppingCart shoppingCart) {
		this.customer = customer;
		this.shoppingCart = shoppingCart;
		this.orderItems = shoppingCart.getItems();
		this.orderNumber = makeOrderNumber();
		this.payment = null;
		this.email = null;
		this.status = false;
	}
	
	// Makes a Unique Order number
	private String makeOrderNumber() {
		return (UUID.randomUUID().toString());
	}
	
	// Lists all the items ordered
	public String listOrderItems() {
		String string1 = "";
		
		for (int i=0; i<this.orderItems.size(); i++) {
			string1 += ("\n" + this.orderItems.get(i).toString());
		}
		
		return string1;
	}
	
	/*
	 * Getters and Setters
	 */

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Item> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(ArrayList<Item> orderItems) {
		this.orderItems = orderItems;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	private double getTotalItems() {
		double total = 0;
		for(int i=0; i<this.orderItems.size(); i++) {
			total += this.orderItems.get(i).getPrice();
		}
		return total;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
}// End Class Order
