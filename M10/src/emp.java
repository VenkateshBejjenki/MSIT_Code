import java.util.Scanner;

public class emp {  
int id;  
String name;  
Addess address;  
 
public static void main(String[] args) {  
	int n=2;
	emp[] ep=new emp[n];
	for(int i=0;i<n;i++){
		ep[i]=new emp();
		ep[i].address=new Addess();
	}
	Scanner inll=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student details");
	for(int i=0;i<n;i++){
		System.out.println("Enter id");
		ep[i].id=inll.nextInt();
		System.out.println("Enter Name");
		ep[i].name=sc.nextLine();
		System.out.println("Enter the City");
		ep[i].address.city=sc.nextLine();
		System.out.println("Enter state");
		ep[i].address.state=sc.nextLine();
		System.out.println("Enter Country");
		ep[i].address.country=sc.nextLine();
		
	}
	for(int i=0;i<n;i++){
		System.out.println(ep[i].id+"\t"+ep[i].name+"\t"+ep[i].address.city+"\t"+ep[i].address.state+"\t"+ep[i].address.country);		
	}

}  
}  