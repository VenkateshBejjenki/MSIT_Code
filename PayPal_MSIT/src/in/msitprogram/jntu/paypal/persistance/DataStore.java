package in.msitprogram.jntu.paypal.persistance;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.accounts.PPRestrictedAccount;

public class DataStore
{
	
	public static PPAccount lookupAccount(String email) 
	{
		PPAccount account = null; //initialize it after reading from file
		// write code to open the files, read
		
		
		if(account.getEmail().equals(email))
			return account;
		return null;
	}
	
	public static void writeAccount(PPAccount account)
	{
		
	}
	
}
