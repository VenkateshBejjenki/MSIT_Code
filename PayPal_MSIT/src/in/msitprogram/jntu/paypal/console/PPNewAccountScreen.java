package in.msitprogram.jntu.paypal.console;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.Vector;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.accounts.PPBusinessAccount;
import in.msitprogram.jntu.paypal.accounts.PPRestrictedAccount;
import in.msitprogram.jntu.paypal.accounts.Profile;
import in.msitprogram.jntu.paypal.utils.PPToolkit;

public class PPNewAccountScreen {
	Profile profile;
	PPAccount account;
	String email;
	Scanner scan;
	
	public PPNewAccountScreen(String email) {
		profile = new Profile();
		scan = new Scanner(System.in);
		this.email = email;
		try {
			show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void show() throws IOException {
		ObjectInputStream ino=null ;
		int flag=0;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPNewAccountScreen> v=new Vector<PPNewAccountScreen>();
			v=(Vector<PPNewAccountScreen>)ino.readObject();
			ino.close();
			PPNewAccountScreen ac1=new PPNewAccountScreen(this.email);
			if(v!=null){
				for(int i=0;i<v.size();i++){
					ac1=v.get(i);
					if(ac1.email.equals(email)){
						System.out.println("Email Alredy exixts");
						flag=1;
						break;
					}
					
				}
			}
			if(flag==0){
				System.out.println("You can create account");
			}
			
		} catch (Exception e) {System.out.println("File not found");}
		
		//check if the account with the given email address exists 
		
		//if not create the user profile
		
		//show the account types
		
		//based on the given account type selected create the account object
	}

	private Profile createProfile() {
		// use this for creating the profile
		
		return profile;
	}

	private void createBusinessAccount() throws IOException {
		//use this for creating the business account
	}

	private void createStudentAccount() throws IOException {
		//use this for creating the student account 
	}

	/*
	 * this method create the personal account, saves it to the file system
	 * and redirects the users to the next screen
	 */
	private void createPersonalAccount() throws IOException {
		//use this for creating the personal account
	}
	
	private void completeAccountCreation() throws IOException{
		//generate activation code and set it to account
		
		//send activation code to the phone
		
		//ask & redirect the user to the activation screen or the main menu
		
	}

}
