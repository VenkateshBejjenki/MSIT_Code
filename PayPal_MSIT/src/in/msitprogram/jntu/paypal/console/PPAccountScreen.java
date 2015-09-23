package in.msitprogram.jntu.paypal.console;

import java.io.IOException;
import java.util.Scanner;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.persistance.DataStore;

public class PPAccountScreen {
	PPAccount account;
	Scanner scan;
	
	public PPAccountScreen(String email) {
		scan = new Scanner(System.in);
		account = DataStore.lookupAccount(email);
	}

	public void show() throws IOException {
		
		//check if account is active
		
		//if active
		
			// print the account summary
			System.out.println(account);
			
			// print menu and accept menu options
			// for all the paypal account operations
			
		
	}

	private void withdrawFunds() throws IOException {
		// implement the withdraw funds user interface here
		
		//use the account object as needed for withdraw funds
		
	}

	private void requestMoney() {
		// 	implement the request money user interface here
		
		//use the account object as needed for request money funds
	}

	private void sendMoney() {
		// implement the send moeny user interface here
		
		//use the account object as needed for send money funds
	}

	private void addFunds() throws IOException {
		// implement the add funds user interface here
		
		//use the account object as needed for add funds
	}

}