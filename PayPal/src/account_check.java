import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;


public class account_check {
	account ac=new account();
	static Scanner read=new Scanner(System.in);
	Scanner read2=new Scanner(System.in);
	
	public account_check(){
		System.out.println("Enter Email ");
		String Email=read.nextLine();
		//System.out.println((isRegister(Email))+"---");
		if(isRegister(Email)){
			create_one(Email);
		}else{
			System.out.println("User already exists");
		}
	}
	
	public boolean isRegister(String email){
		ObjectInputStream ino=null ;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<account> v=new Vector<account>();
			v=(Vector<account>)ino.readObject();
			ino.close();
			account ac1=new account();
			for(int i=0;i<v.size();i++){
				ac1=v.get(i);
				if(ac1.Email.equals(email)){
					return false;
				}
			}
			
		} catch (Exception e) {System.out.println(e.getMessage());}

		return true;
	}
	
	
	public void create_one(String Email){
		ObjectOutputStream usr_reg;
		ObjectInputStream ino ;
		try{
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<account> v=new Vector<account>();
			v=(Vector<account>)ino.readObject();
			ino.close();
			usr_reg= new ObjectOutputStream(new FileOutputStream("members.txt"));
			account ac2=new account();
			
			System.out.println("Enter Name");
			ac2.name=read.nextLine();
			System.out.println("Enter password ");
			ac2.pass=read.nextLine();
			System.out.println("Date of birth");
			ac2.dob=read.nextLine();
			System.out.println("Enter Address");
			ac2.address=read.nextLine();
			System.out.println("Enter account type\n-->1 for Personal\n-->2 for Student\n-->3 for Business\n");
			ac2.account_type=read.nextInt();
			if(ac2.account_type==2){
				System.out.println("Enter parent email id");
				ac2.pt_email=read2.nextLine();
			}
			
			System.out.println("Enter phone number");
			ac2.phone=read.nextLong();
			ac2.Email=Email;
			v.add(ac2);
			usr_reg.writeObject(v);
			usr_reg.close();
			
			
		}catch(Exception e){System.out.println(e.getMessage());}
	}
}
