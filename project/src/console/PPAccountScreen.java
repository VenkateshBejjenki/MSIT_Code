package console;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import accounts.PPAccount;
import accounts.Profile;
import accounts.Transaction;
import persistance.DataStore;

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
		System.out.println("Your default account bal is "+account.getAccountBal());
		System.out.println("Enter ammount to WithDraw");
		float addM=scan.nextFloat();
		float x;
		if(account.getAccountBal()>=addM){
			x=account.getAccountBal()-addM;
		

		PPAccount account_check = null; 
		Profile pro=new Profile();
		ObjectInputStream ino=null ;
		ObjectOutputStream usr_reg=null;
		ino = new ObjectInputStream(new FileInputStream("members.txt"));
		Vector<PPAccount> v=new Vector<PPAccount>();
		try {
			v=(Vector<PPAccount>)ino.readObject();
			ino.close();
			account_check=new PPAccount(pro);
			account_check.setTransactions(new ArrayList<Transaction>());
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat time = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();

			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
					account_check.setAccountBal(x);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "Credit",(String)account_check.getEmail(),"True", 0, x);
					account_check.getTransactions().add(t);
					System.out.println(t.toString());
					break;
				}
			}
			
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			usr_reg.writeObject(v);
			usr_reg.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);;
		}
		
		
	}else{
		System.out.println("Enter bal is grater than current bal");
	}
		
		// implement the withdraw funds user interface here
		
		//use the account object as needed for withdraw funds
		
	}
	public void getwithdrawFunds(){
		try {
			withdrawFunds();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public void getrequestMoney() {
	requestMoney();
}
	
	private void requestMoney() {
		// 	implement the request money user interface here
		
		System.out.println("Your default account bal is "+account.getAccountBal());
		System.out.println("Enter email to Request");
		String frd_email=scan.nextLine();
		System.out.println("Enter ammount to Request");
		float send_fund=scan.nextFloat();
		
		
		
		System.out.println(frd_email+" "+send_fund+"----"+account.getAccountBal()+" "+account.getEmail());
		
		PPAccount account_check = null; 
		Profile pro=new Profile();
		ObjectInputStream ino=null ;
		ObjectOutputStream usr_reg=null;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPAccount> v=new Vector<PPAccount>();
			v=(Vector<PPAccount>)ino.readObject();
			ino.close();
			account_check=new PPAccount(pro);
			account_check.setTransactions(new ArrayList<Transaction>());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat time = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			
			int flag=0;
			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase(frd_email))
					flag=1;
			}
			if(flag==1){
				
			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
					//account_check.setAccountBal(account.getAccountBal()-send_fund);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "Requsting",frd_email,"Pending", 0, send_fund);
					account_check.getTransactions().add(t);
				}else if(account_check.getEmail().toString().equalsIgnoreCase(frd_email)){
					//account_check.setAccountBal(account_check.getAccountBal()+send_fund);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "Requsting",(String)account.getEmail(),"Pending", send_fund, 0);
					account_check.getTransactions().add(t);
				}
			
			}
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			usr_reg.writeObject(v);
			usr_reg.close();
			}else{
				System.out.println("User Not present");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		//use the account object as needed for request money funds
	}
	public void getsendMoney(){
		
			sendMoney();
		
	}

	
	private void sendMoney() {
		// implement the send moeny user interface here
		System.out.println("Your default account bal is "+account.getAccountBal());
		System.out.println("Enter email to Send");
		String frd_email=scan.nextLine();
		System.out.println("Enter ammount to Send");
		float send_fund=scan.nextFloat();
		
		
		
		System.out.println(frd_email+" "+send_fund+"----"+account.getAccountBal()+" "+account.getEmail());
		
		PPAccount account_check = null; 
		Profile pro=new Profile();
		ObjectInputStream ino=null ;
		ObjectOutputStream usr_reg=null;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPAccount> v=new Vector<PPAccount>();
			v=(Vector<PPAccount>)ino.readObject();
			ino.close();
			account_check=new PPAccount(pro);
			account_check.setTransactions(new ArrayList<Transaction>());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat time = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			
			int flag=0;
			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase(frd_email))
					flag=1;
			}
			if(flag==1){
			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
					account_check.setAccountBal(account.getAccountBal()-send_fund);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "Credit",frd_email,"True", 0, send_fund);
					account_check.getTransactions().add(t);
				}else if(account_check.getEmail().toString().equalsIgnoreCase(frd_email)){
					account_check.setAccountBal(account_check.getAccountBal()+send_fund);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "debit ",(String)account.getEmail(),"True", send_fund, 0);
					account_check.getTransactions().add(t);
				}
			
			}
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			usr_reg.writeObject(v);
			usr_reg.close();
			}else{
				System.out.println("User Not present");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		//use the account object as needed for send money funds
	}

	public void getAddFund(){
		try {
			addFunds();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void addFunds() throws IOException {
		
		// implement the add funds user interface here
		System.out.println("Your default account bal is "+account.getAccountBal());
		System.out.println("Enter ammount to add");
		float addM=scan.nextFloat();
		float x=account.getAccountBal()+addM;
		
		
		PPAccount account_check = null; 
		Profile pro=new Profile();
		ObjectInputStream ino=null ;
		ObjectOutputStream usr_reg=null;
		ino = new ObjectInputStream(new FileInputStream("members.txt"));
		Vector<PPAccount> v=new Vector<PPAccount>();
		try {
			v=(Vector<PPAccount>)ino.readObject();
			ino.close();
			account_check=new PPAccount(pro);
			account_check.setTransactions(new ArrayList<Transaction>());
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat time = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();

			for(int i=0;i<v.size();i++){
				account_check=v.get(i);
				if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
					account_check.setAccountBal(x);
					Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "debit ",(String)account_check.getEmail(),"True", x, 0);
					account_check.getTransactions().add(t);
					System.out.println(t.toString());
					break;
				}
			}
			
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			usr_reg.writeObject(v);
			usr_reg.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);;
		}
		//DataStore.writeAccount(account);
		//use the account object as needed for add funds
	}

}