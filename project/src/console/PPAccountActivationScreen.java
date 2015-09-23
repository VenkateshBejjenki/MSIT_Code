package console;

import accounts.PPAccount;
import accounts.PPRestrictedAccount;
import accounts.Profile;
import persistance.DataStore;
import utils.PPToolkit;
import utils.pending_trans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class PPAccountActivationScreen {
	
	public static void show() throws IOException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter email to login");
		String email = scan.nextLine(); //change to get console input
		
		/*
		 * TODO
		 * fetch the account object using email address
		 * check if the account is suspended
		 * if suspended then activate it
		 * if activation code invalid, retry for 2 more attempts
		 * on successful activation show main menu
		 * on failure show the error message and continue to main menu
		 */				
		
		PPAccount account = DataStore.lookupAccount(email);
		if(account!=null){
			if(account.isActivated()==false){
				int j=0,flag=0;
				while(j<3){
					if(j==0)
						System.out.println("Enter activation code");
					else
						System.out.println("Enter valid activation code");
				String act=scan.nextLine();
				if(account.getActivationCode().toString().equalsIgnoreCase(act)){
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
						for(int i=0;i<v.size();i++){
							account_check=v.get(i);
							if(account_check.getEmail().toString().equalsIgnoreCase(email)){
								account_check.setActivated(true);
								System.out.println("Your account is activated login again");
								flag=1;
								break;
							}
						}
						usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
						//v.add(account);
						usr_reg.writeObject(v);
						usr_reg.close();
						if(flag==1)
							break;
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
					
				}
				
				j++;
				
			}
				
			}else{
				for(int h=0;h<10;h++)
					System.out.print("--");
				System.out.println("\nHi '"+account.getProfile().getName()+"' You are account type is '"+account.AccountType+"'");
				for(int h=0;h<10;h++)
					System.out.print("--");
				if(account.AccountType.toString().equalsIgnoreCase("Personal")){
					int exit=1,options;
					while(exit!=0){
					System.out.println("\n1) Suspend Account\n2) Funds\n3) Transctations\n4) Pending Transctations \n5) Exit");
					options=scan.nextInt();
					
						switch(options){
						case 1:{
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
									for(int i=0;i<v.size();i++){
										account_check=v.get(i);
										if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
											account_check.setActivated(false);
											break;
										}
									}
									usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
									//v.add(account);
									usr_reg.writeObject(v);
									usr_reg.close();
									exit=0;
								} catch (ClassNotFoundException e) {
									e.printStackTrace();
								}
						}
						break;
						case 2:{
							System.out.println("\n1) Add fund\n2) Withdraw Fund\n3) Request Fund\n4) Send Fund\n5) Exit");
							int g=scan.nextInt();
							switch(g){
							case 1:{
								PPAccountScreen add=new PPAccountScreen((String) account.getEmail());
								add.getAddFund();
							}
								break;
							case 2:{
								PPAccountScreen sub=new PPAccountScreen((String) account.getEmail());
								sub.getwithdrawFunds();
							}
								break;
							case 3:{
								PPAccountScreen sub=new PPAccountScreen((String) account.getEmail());
								sub.getrequestMoney();
							}
								break;
							case 4:{
								//send fund
								PPAccountScreen send=new PPAccountScreen((String) account.getEmail());
								send.getsendMoney();
							}
								break;
							case 5:
								break;
							default:System.out.println("Enter valid option");
								break;
							}
						}
							break;
							
						case 3:{
							//Transcations
							Iterator itr;
							Profile pr=new Profile();
							ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("members.txt"));
							Vector<PPAccount> v=new Vector<PPAccount>();
							try {
								v=(Vector<PPAccount>)os1.readObject();
								PPAccount ss=new PPAccount(pr);
								System.out.println("---------------------------------------------------------------------");
								System.out.println("| Date | Time | PPAccount |  narration |  reference |  status |  debit |  credit |");
								System.out.println("---------------------------------------------------------------------");
								for(int i=0;i<v.size();i++){
									
									ss=v.get(i);
									if(ss.getEmail().equals(account.getEmail())){
									itr=ss.getTransactions().iterator();
									 while(itr.hasNext()){
										   System.out.println(itr.next());  
										  }
								}
							}
									
									os1.close();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						}
					}
							break;
						case 4:{
							pending_trans tran=new pending_trans((String) account.getEmail());
						}
							break;
						case 5:exit=0;
							break;
						default:System.out.println("Enter correct option");
							break;
						}
					}
				
				}
				else if(account.AccountType.toString().equalsIgnoreCase("Student")){
					
					int exit=1,options;
					while(exit!=0){
					System.out.println("\n1) Suspend Account\n2) Funds\n3) Transctations\n4) Pending Transctations \n5) Exit");
					options=scan.nextInt();
					switch(options){
					case 1:{
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
								for(int i=0;i<v.size();i++){
									account_check=v.get(i);
									if(account_check.getEmail().toString().equalsIgnoreCase((String) account.getEmail())){
										account_check.setActivated(false);
										break;
									}
								}
								usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
								//v.add(account);
								usr_reg.writeObject(v);
								usr_reg.close();
								exit=0;
							} catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
					}
					break;
					case 2:{
						System.out.println("1) Withdraw Fund\n2) Request Fund\n3) Exit");
						int g=scan.nextInt();
						switch(g){
						case 1:{
							PPRestrictedAccount student=new PPRestrictedAccount(account.getProfile());
							student.getwithdrawFunds((String)account.getEmail());
							
						}
							break;
						case 2:{
							PPRestrictedAccount student=new PPRestrictedAccount(account.getProfile());
							student.getrequestMoney((String)account.getEmail());
						}
							break;

						case 3://exit
							break;
						default:System.out.println("Enter valid option");
							break;
						}
					}
						break;
					case 3:{
						Iterator itr;
						Profile pr=new Profile();
						ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("members.txt"));
						Vector<PPAccount> v=new Vector<PPAccount>();
						try {
							v=(Vector<PPAccount>)os1.readObject();
							PPAccount ss=new PPAccount(pr);
							System.out.println("---------------------------------------------------------------------");
							System.out.println("| Date | Time | PPAccount |  narration |  reference |  status |  debit |  credit |");
							System.out.println("---------------------------------------------------------------------");
							for(int i=0;i<v.size();i++){
								
								ss=v.get(i);
								if(ss.getEmail().equals(account.getEmail())){
								itr=ss.getTransactions().iterator();
								 while(itr.hasNext()){
									   System.out.println(itr.next());  
									  }
							}
						}
								
								os1.close();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					}
					}
					break;
					case 4:{
						pending_trans tran=new pending_trans((String) account.getEmail());
					}break;
					case 5:exit=0;
						break;
					default:System.out.println("Enter correct option");
					break;
					
				}
					
					
					}
					
				}else if(account.AccountType.toString().equalsIgnoreCase("Business")){
					
				}
			}
		}else{
			System.out.println("invalid account");
		}
		
		//check if account is active. if yes then ask for suspending it
		
		// if yes suspend it if not go back to main menu
		
		// accept activation code, check if valid, if not give 2 more attempts
		
		//proceed to main menu
		MainMenu.show();
	
	}

}