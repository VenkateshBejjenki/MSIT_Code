import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.Vector;


public class Sign_in {
	account ac=new account();
	int x;
	static Scanner read=new Scanner(System.in);
	public Sign_in(){
		System.out.println("Email");
		String email=read.nextLine();
		System.out.println("Password");
		String pass=read.nextLine();
		if(ieExists(email,pass)){
			System.out.println("hi Your are in");
			x=1;
			//System.out.println("1) Add Fund\n2) Withdraw Amount\n3) Transfer Amount\n4)Requst Amount");
		}else{
			x=0;
			System.out.println("Problem in login");
		}
	}

	public boolean ieExists(String email,String pass){
		ObjectInputStream ino=null ;
		try {
			ino = new ObjectInputStream(new FileInputStream("members.txt"));
			Vector<account> v=new Vector<account>();
			v=(Vector<account>)ino.readObject();
			ino.close();
			account ac1=new account();
			for(int i=0;i<v.size();i++){
				ac1=v.get(i);
				if(ac1.Email.equals(email)&&ac1.pass.equals(pass)){
					return true;
				}
			}
			
		} catch (Exception e) {System.out.println(e.getMessage());}

		return false;
		
		
	}
}
