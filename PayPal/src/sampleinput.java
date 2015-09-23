import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;


public class sampleinput {
	public static void main(String[] argsv){
		Scanner read=new Scanner(System.in);
		Scanner read2=new Scanner(System.in);
		ObjectOutputStream usr_reg;
		
		try{
			
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			Vector<account> v=new Vector<account>();
			
			account ac=new account();
			System.out.println("Enter Name");
			ac.name=read.nextLine();
			System.out.println("Enter Email ");
			ac.Email=read.nextLine();
			System.out.println("Enter password ");
			ac.pass=read.nextLine();
			System.out.println("Date of birth");
			ac.dob=read.nextLine();
			System.out.println("Enter Address");
			ac.address=read.nextLine();
			System.out.println("Enter account type\n-->1 for Personal\n-->2 for Student\n-->3 for Business");
			ac.account_type=read.nextInt();
			if(ac.account_type==2){
				System.out.println("Enter parent email id");
				ac.pt_email=read2.nextLine();
			}
			System.out.println("Enter phone number");
			ac.phone=read.nextLong();
			v.add(ac);
			usr_reg.writeObject(v);
			usr_reg.close();
			
			
		}catch(Exception e){System.out.println(e.getMessage());}
	}

}
