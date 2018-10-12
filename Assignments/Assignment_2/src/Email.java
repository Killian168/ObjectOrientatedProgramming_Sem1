/**
 * Description: The Email class is responsible for creating and sending
 * email to the client, whether the bought any items or not.
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

public class Email {

	private Customer customer;
	private Order order;
	
	public Email(Customer customer, Order order, boolean payment) {
		this.customer = customer;
		this.order = order;
	}// End Constructor
	
	public String generateEmail(boolean payment) {
		String greetings = ("\nHello " + customer.getFirstName() + "\n");
		String emailContent =  null;
		String emailAddress = (customer.getEmailAddress()+"\n");
		String signOff = ("\n\nRegards,\nAssignment2");
		
		if (payment == true) {
			emailContent = ("Your order\nOrder Number:" + this.order.getOrderNumber() + "\nHas been payed for and your order is as follows:\n" + this.order.listOrderItems() + "\n\nYour total is:" + this.order.getTotal()
							+ "\nThis order is being delivered to:\n" + this.order.getDeliveryAddress().catAddress() + "\n\nAnd billed to:\n" + this.order.getBillingAddress().catAddress());
		}
		else {
			emailContent = ("Your order\nOrder Number:" + this.order.getOrderNumber() + "\nhas not been payed,  as there was issues with your card.\nThe order has been cancelled");
		}
		return (greetings+emailAddress+emailContent+signOff);
	}
	
	public void sendEmail(String fullEmail) {
		System.out.println(fullEmail);
	}
}// End Class Email
