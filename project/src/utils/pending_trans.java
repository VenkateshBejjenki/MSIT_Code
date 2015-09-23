package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import persistance.DataStore;
import accounts.PPAccount;
import accounts.Profile;
import accounts.Transaction;

public class pending_trans {
	String email;
	public pending_trans(String email){
		this.email=email;
		see();
	}
	public void see(){
		try {
			Scanner scn=new Scanner(System.in);
			 Iterator itr;
			Profile pr=new Profile();
			PPAccount account = DataStore.lookupAccount(email);
			ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPAccount> v=new Vector<PPAccount>();
			v=(Vector<PPAccount>)os1.readObject();
			os1.close();
			PPAccount ss=new PPAccount(pr);
			for(int i=0;i<v.size();i++){
				ss=v.get(i);
				if(ss.getEmail().equals(account.getEmail())){
				
					System.out.println("`````````````````````````");
					System.out.println("Pending status in account");
					System.out.println("`````````````````````````");
				itr=ss.getTransactions().iterator();
				 while(itr.hasNext()){  
					 Transaction st=(Transaction)itr.next();
					 if(st.getStatus().toString().equalsIgnoreCase("Pending")){
						 System.out.println(st);
						 System.out.println("Yes--1 / No--2");
						 int opt=scn.nextInt();
						 if(opt==1){
							 System.out.println("yes");
							/* 
							 PPAccount account_check = null; 
								Profile pro=new Profile();
								
								ObjectOutputStream usr_reg=null;
								try {
									
									account_check=new PPAccount(pro);
									account_check.setTransactions(new ArrayList<Transaction>());
									DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
									DateFormat time = new SimpleDateFormat("HH:mm:ss");
									Date date = new Date();
									
									int flag=0;
									for(int i1=0;i1<v.size();i1++){
										account_check=v.get(i1);
										if(account_check.getEmail().toString().equalsIgnoreCase(st.getReference()))
											flag=1;
									}
									if(flag==1){
									for(int i1=0;i1<v.size();i1++){
										account_check=v.get(i1);
										float send_fund=st.getCredit();
										String frd_email=st.getReference();
										
										if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
											account_check.setAccountBal(account.getAccountBal()-send_fund);
											
											Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "Credit",frd_email,"True", 0, send_fund);
											
											account_check.getTransactions().add(t);
										}else if(account_check.getEmail().toString().equalsIgnoreCase(frd_email)){
											account_check.setAccountBal(account_check.getAccountBal()+send_fund);
											Transaction t=new Transaction(dateFormat.format(date),time.format(date), account_check, "debit ",account.getProfile().getName(),"True", send_fund, 0);
											
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
								}
								*/
						 }else if(opt==2)
						 {
							 System.out.println("no");
							 
							 }else{
								 System.out.println("choose correct option");
							 }
						 
						 
						 }
					     
					  }
				}
	
			}
			
		}catch(Exception e){System.out.println(e.getMessage());}
	}
}
