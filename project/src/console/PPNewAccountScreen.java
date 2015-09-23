package console;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import persistance.DataStore;
import accounts.*;
import utils.PPToolkit;

public class PPNewAccountScreen implements Serializable {
	Profile profile;
	PPAccount p;
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
		
		if(DataStore.lookupAccount(this.email)==null){
			profile=createProfile();
			p=new PPAccount(profile);
			System.out.println("Enter account type\nBusiness--1\nStudent--2\nPersonal--3");
			switch(scan.nextInt()){
				
			case 1:try {
					createBusinessAccount();
					} catch (IOException e) {e.printStackTrace();}
			break;
			case 2:try {
					createStudentAccount();
					} catch (IOException e) {e.printStackTrace();}
			break;
		
			case 3:try {
					createPersonalAccount();
					} catch (IOException e) {e.printStackTrace();}
			break;
			
			}
		}else{
			System.out.println("User already in");
		}
		//check if the account with the given email address exists 
		
		//if not create the user profile
		
		//show the account types
		
		//based on the given account type selected create the account object
	}

	private Profile createProfile() {
		// use this for creating the profile
		System.out.println("Enter name");
		profile.setName(scan.nextLine());
		System.out.println("Enter the phone");
		profile.setPhone(scan.nextLine());
		System.out.println("Enter address");
		profile.setAddress(scan.nextLine());

		return profile;
	}

	private void createBusinessAccount() throws IOException {
		//use this for creating the business account
		p.AccountType="Business";
		MyStringRandomGen ran=new MyStringRandomGen();
		p.setEmail(this.email);
		System.out.println("Enter the accountBal");
		p.setAccountBal(scan.nextFloat());
		p.setActivated(false);
		p.setActivationCode(ran.generateRandomString());
		p.setTransactions(new ArrayList<Transaction>());
		completeAccountCreation();
	}

	private void createStudentAccount() throws IOException {
		//use this for creating the student account 
		p.AccountType="Student";
		System.out.println("Enter your parent email id");
		Scanner scan2=new Scanner(System.in);
		p.ptemail=scan2.nextLine();
		
		MyStringRandomGen ran=new MyStringRandomGen();
		p.setEmail(this.email);
		System.out.println("Enter the accountBal");
		p.setAccountBal(scan.nextFloat());
		p.setActivated(false);
		p.setActivationCode(ran.generateRandomString());
		p.setTransactions(new ArrayList<Transaction>());
		completeAccountCreation();
	}

	/*
	 * this method create the personal account, saves it to the file system
	 * and redirects the users to the next screen
	 */
	private void createPersonalAccount() throws IOException {
		//use this for creating the personal account
		MyStringRandomGen ran=new MyStringRandomGen();
		System.out.println("Enter the accountBal");
		p.setEmail(this.email);
		p.setAccountBal(scan.nextFloat());
		p.setActivated(false);
		p.setActivationCode(ran.generateRandomString());
		p.AccountType="Personal";
		p.setTransactions(new ArrayList<Transaction>());
		completeAccountCreation();
	}
	
	private void completeAccountCreation() throws IOException{
		//generate activation code and set it to account
		System.out.println("\nlogin email "+p.getEmail()+"\nYour Activation code is "+p.getActivationCode());
		//System.out.println(p.AccountType+"\n"+p.getEmail());
		
		DataStore.writeAccount(p);
		
		//send activation code to the phone
		
		//ask & redirect the user to the activation screen or the main menu
		
	}

}
