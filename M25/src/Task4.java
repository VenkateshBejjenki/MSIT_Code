import java.io.*;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

class students implements Serializable{
	int Roll_no;
	long phone_no;
	String Name;
	double IT_marks,SS_marks;
}

public class Task4 {

	public static void main(String[] args){
		Scanner scs = new Scanner(System.in);
		Scanner scs2 = new Scanner(System.in);
		ObjectOutputStream os;
		try {
			os = new ObjectOutputStream(new FileOutputStream("Students.txt"));//input
			System.out.println("Enter n value");
			int n=scs.nextInt();
			students[] s=new students[n];
			Vector<students> v=new Vector<students>();
			//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<n;i++){
				s[i]=new students();
				System.out.println("Enter the rollnumber "+(i+1));
				s[i].Roll_no=scs.nextInt();
				System.out.println("Enter the name "+(i+1));
				s[i].Name=scs2.nextLine();
				System.out.println("Enter the phone number "+(i+1));
				s[i].phone_no=scs.nextLong();
				System.out.println("Enter the IT Marks "+(i+1));
				s[i].IT_marks=scs.nextDouble();
				System.out.println("Enter the SS Marks "+(i+1));
				s[i].SS_marks=scs.nextDouble();
				v.add(s[i]);
			}
			os.writeObject(v);
			os.close();
		}catch(Exception e){System.out.println(e.getMessage());}
		
	}
}
