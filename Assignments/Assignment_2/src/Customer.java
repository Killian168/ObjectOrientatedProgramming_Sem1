/**
 * Description: Customer holds all the necessary data
 * about the user so that they can place an order
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

import java.util.UUID; 

public class Customer {
    private String firstName;
    private String surName;
    private String emailAddress;
    private final UUID customerId;
    private Address billingAddress;
    private Address deliveryAddress;
    
    public Customer(String firstName, String surName, String emailAddress){
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId  = makeCustomerId();
        billingAddress = new Address();
        deliveryAddress = new Address();
    }
    
    public UUID getId() {
        return customerId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        
        return surName;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    private UUID makeCustomerId() {
        return UUID.randomUUID();
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public void setSurName(String sur) {
        surName = sur;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public UUID getCustomerId() {
		return customerId;
	}

}
