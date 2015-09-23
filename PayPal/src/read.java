import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;


public class read {


	public static void main(String[] args){
		try {
			ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<account> v=new Vector<account>();
			v=(Vector<account>)os1.readObject();
			account ss=new account();
			//System.out.println(v.size());
			for(int i=0;i<v.size();i++){
				ss=v.get(i);
				System.out.println("-----------------------------------");
				System.out.println("Name:- "+ss.name);
				System.out.println("Phone Number:- "+ss.phone);
				System.out.println("email:- "+ss.Email);
				System.out.println("DOB:- "+ss.dob);
				System.out.println("Address "+ss.address);
				System.out.println("Password is "+ss.pass);
				if(ss.account_type==1){
					System.out.println("Account Type is Personal");
				}else if(ss.account_type==2){
					System.out.println("Account Type is Student your parent id is "+ss.pt_email);
				}else if(ss.account_type==3){
					System.out.println("Account Type is Business");
				}
				System.out.println("-----------------------------------\n");
			}
			os1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
