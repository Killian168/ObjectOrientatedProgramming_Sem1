/**
 * Description: The Payment class provides validation on
 * card payment and bank details so that a customer can
 * buy the items they order
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

import java.util.Calendar;

public class Payment {

	private Customer customer;
	private String cardType;
	private long cardNum;
	private Calendar cardDate;
	private Address address;
	private String bankName;
	private boolean validCard;
	
	/*
	 * Class Constructor
	 */
	public Payment(Customer customer, long cardNum, Calendar cardDate, Address address, String bankName, String cardType) {
		
		this.customer = customer;
		setCardType(cardType);
		setCardNum(cardNum);
		setCardDate(cardDate);
		this.address = address;
		this.bankName = bankName;
		validCard = isValid(this);
		
	}// End constructor
	
	/*
	 * Methods
	 */
	
	/* Checks to see if the Payment details entered are valid card details
	 * Returns: True is it is Valid
	 * 			False if it is not Valid
	 */
	private boolean isValid(Payment payment) {
		
		boolean cardNum1 = false;
		boolean cardType1 = false;
		boolean cardDate1 = false;
		
		if ((this.cardType != null)&&(!this.cardType.isEmpty())) {
			cardType1 = true;
		}
		
		if ((this.cardNum != 0)) {
			cardNum1 = true;
		}
		
		if((this.cardDate.after(Calendar.getInstance())&&(this.cardDate != null))) {
			cardDate1 = true;
		}
		
		if (cardType1 == true && cardNum1 == true && cardDate1 == true) 
		{
			return true;
		}
		else {
			return false;
		}
	}

	/* Checks the Date on the Card to make sure it is not expired
	 * Returns: True if the date is Valid
	 * 			False if the date is not Valid
	 */
	private boolean checkCardDate(Calendar cardDate) {
		if (cardDate.after(Calendar.getInstance())) {
			return true;
		}
		else {
			System.out.println("Sorry the date on your card is invalid");
			return false;
		}
		
	}

	/* Checks the Type on the Card to make sure it is either MasterCard or Visa
	 * Returns: True if the Type is Valid
	 * 			False if the Type is not Valid
	 */
	private boolean checkCardType(String cardType) {
		if(cardType.equals("MasterCard") || cardType.equals("Visa")) {
			return true;
		}
		else {
			System.out.println("Sorry your card type is invalid");
			return false;
		}
	}
	
	/* Checks to see if the Card Number is a Valid 16 digit number
	 * Returns: True if the Number is Valid
	 * 			False if the Number is not Valid
	 */
	private boolean checkCardNum(long cardNum) {
		if ((cardNum > 1000000000000000L) && (cardNum < 9999999999999999L)) {
			return true;
		}
		else {
			System.out.println("Sorry your card number is invalid");
			return false;
		}
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

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		if(checkCardType(cardType)) {
			this.cardType = cardType;
		}
		else {
			this.cardType = null;
		}
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		if(checkCardNum(cardNum)) {
			this.cardNum = cardNum;
		}
		else {
			this.cardNum = 0L;
		}
	}

	public Calendar getCardDate() {
		return cardDate;
	}

	public void setCardDate(Calendar cardDate) {
		if (checkCardDate(cardDate)) {
			this.cardDate = cardDate;
		}
		else {
			this.cardDate = null;
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public boolean isValidCard() {
		return validCard;
	}

	public void setValidCard(boolean validCard) {
		this.validCard = validCard;
	}
}// End Class Payment