package in.msitprogram.jntu.paypal.accounts;

import java.util.ArrayList;

public class PPAccount
{
	/**
	 * 
	 */
	private Profile profile;
	private String email;
	private float accountBal;
	private boolean isActivated;
	private String activationCode;
	private ArrayList<Transaction> transactions;
	
	public PPAccount(Profile profile) {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		// implement this function to return a beautiful looking string
		// to display the summary of the account
		return null;
	}

	public void activate(String activationCode) 
	{
		
		// TODO Auto-generated method stub
		
	}
	
	public void suspend() 
	{
		// TODO Auto-generated method stub
	}


	public boolean withdraw(float withdrawAmount) {
		
		return false;
	}


	public boolean addFunds(float creditAmount) 
	{
		
		return false;
	}
	
	public boolean sendMoney(float creditAmount) 
	{
		
		return false;
	}
	
	public boolean requestMoney(float creditAmount) 
	{
		
		return false;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
