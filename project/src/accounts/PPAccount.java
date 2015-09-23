package accounts;

import java.io.Serializable;
import java.util.ArrayList;

public class PPAccount implements Serializable
{

	private Profile profile;
	private String email;
	private float accountBal;
	private boolean isActivated;
	private String activationCode;
	public String AccountType;
	public String ptemail;
	private ArrayList<Transaction> transactions;
	
	public PPAccount(Profile profile) {
		// TODO Auto-generated constructor stub
		this.profile=profile;
	}
	/*public PPAccount(){
		
	}*/

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
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(float d) {
		this.accountBal = d;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	
}
