package persistance;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import accounts.*;

public class DataStore
{
	
	public static PPAccount lookupAccount(String email) 
	{
		PPAccount account = null; 
		Profile pro=new Profile();
		//initialize it after reading from file
		// write code to open the files, read
		ObjectInputStream ino=null ;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPAccount> v=new Vector<PPAccount>();
			v=(Vector<PPAccount>)ino.readObject();
			ino.close();
			account=new PPAccount(pro);
			for(int i=0;i<v.size();i++){
				account=v.get(i);
				if(account.getEmail().toString().equalsIgnoreCase(email)){
					return account;
				}
			}
			
		} catch (Exception e) {System.out.println(e.getMessage());}
		return null;
	}
	
	public static void writeAccount(PPAccount account)
	{
		ObjectOutputStream usr_reg=null;
		ObjectInputStream ino=null ;
		
			
				try {
					
					ino = new ObjectInputStream(new FileInputStream("members.txt"));
					/*if(ino==null){
						Vector<PPAccount> v=new Vector<PPAccount>();
						ino.close();
						usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
						v.add(account);
						usr_reg.writeObject(v);
						usr_reg.close();
					}*///else{
						Vector<PPAccount> v=new Vector<PPAccount>();
						v=(Vector<PPAccount>)ino.readObject();
						ino.close();
						usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
						v.add(account);
						usr_reg.writeObject(v);
						usr_reg.close();
					//}
					
				} catch (Exception e) {
					Vector<PPAccount> v=new Vector<PPAccount>();
					try {
						usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
						v.add(account);
						usr_reg.writeObject(v);
						usr_reg.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			
			
			
			
		
	}
	
}
