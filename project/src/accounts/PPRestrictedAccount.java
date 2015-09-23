package accounts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import persistance.DataStore;

public class PPRestrictedAccount extends PPAccount {
	private String parentEmail;
	private float withdrawLimit;
	Scanner scan=new Scanner(System.in);

	public PPRestrictedAccount(Profile profile) {
		super(profile);
		this.withdrawLimit=10000;
		this.parentEmail=super.ptemail;
		// TODO Auto-generated constructor stub
	}
	
	
	private void withdrawFunds(String email) throws IOException {
		PPAccount account = DataStore.lookupAccount(email);
		Profile pro =new Profile();
		System.out.println("Your default account bal is "+account.getAccountBal());
		System.out.println("Enter ammount to WithDraw");
		float addM=scan.nextFloat();
		float x;
		if(account.getAccountBal()>=addM&&addM<=withdrawLimit){
			x=account.getAccountBal()-addM;
		

		PPAccount account_check = null; 
		
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
	public void getwithdrawFunds(String email){
		try {
			withdrawFunds(email);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void getrequestMoney(String email) {
		requestMoney(email);
	}
		
		private void requestMoney(String email) {
			// 	implement the request money user interface here
			PPAccount account = DataStore.lookupAccount(email);
			Profile pro =new Profile();
			System.out.println("Your default account bal is "+account.getAccountBal());
			//System.out.println("Enter email to Request");
			String frd_email=account.ptemail;
			System.out.println("Enter ammount to Request");
			float send_fund=scan.nextFloat();
			
			
			
			System.out.println(frd_email+" "+send_fund+"----"+account.getAccountBal()+" "+account.getEmail());
			
			PPAccount account_check = null; 
			
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

}
