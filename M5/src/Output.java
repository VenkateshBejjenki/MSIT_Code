/**Create a class called State() with the following member functions
*Create string array with size n to store n districts:
**public void readDistricts(); //read N = no of districts, dynamically allocated memory 
*for N strings, read each district name from the scanner object.
* public void printDistricts(); //print the district names on the standard output (display-screen);

1. Create an object for the class State in the main program
2.Call read_districts() and printDistricts() from the main program

Name the program as: PC1_State.java

Dynamic String array example
*/
import java.util.Scanner;

class State{
	String ar[];
	public void readDistricts(int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings of "+n);
		for(int i=0;i<n;i++){
			ar[i]=sc.nextLine();
		}
	}
	
	 public void printDistricts(int n){
		 for(int i=0;i<n;i++){
				System.out.println(ar[i]);
			}
	 }
}

class Output 
{
	 public static void main(String args[])  {
		     int n;
		     State obj=new State();
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter n value\n");
			 n=sc.nextInt();
			 obj.ar=new String[n];	//Dynamic Allocating of memory
			 
			 obj.readDistricts(n);
			 obj.printDistricts(n);
		
    } 
  }
