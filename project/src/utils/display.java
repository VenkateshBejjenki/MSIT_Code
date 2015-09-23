package utils;

import accounts.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Vector;

public class display {

	public static void main(String[] args){
		try {
			 Iterator itr;
			Profile pr=new Profile();
			ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<PPAccount> v=new Vector<PPAccount>();
			v=(Vector<PPAccount>)os1.readObject();
			PPAccount ss=new PPAccount(pr);
			for(int i=0;i<v.size();i++){
				ss=v.get(i);
				System.out.println(ss.getEmail()+" "+ss.getAccountBal()+" "+ss.isActivated());
				itr=ss.getTransactions().iterator();
				 while(itr.hasNext()){  
					   System.out.println(itr.next());  
					  }
				 
				System.out.println("\n");
				
				
			}
			os1.close();
		}catch(Exception e){System.out.println(e.getMessage());}

		
	}
}