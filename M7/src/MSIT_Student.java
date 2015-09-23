import java.util.*;

class MSIT_Student
{
	
	String StudentName;
	int StudentNumber;
	int whichMiniSem;
	boolean iseligible;
	
	public static boolean isEligibility()
	{
		Random rand=new Random();
		return rand.nextBoolean();
	}

     public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		MSIT_Student[] objects=new MSIT_Student[n];
		Scanner in=new Scanner(System.in);
		// write your code here
		for ( int i=0; i<n; i++) {
			objects[i]=new MSIT_Student();
			}
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the Student Name");
			objects[i].StudentName=in.nextLine();
			System.out.println("Enter the Roll number");
			objects[i].StudentNumber=sc.nextInt();
			System.out.println("Enter the Sem number");
			objects[i].whichMiniSem=sc.nextInt();
			objects[i].iseligible = MSIT_Student.isEligibility();
			
			
		}
		for(int i=0;i<n;i++)
			System.out.println("Student Name '"+objects[i].StudentName+"' Roll number '"+objects[i].StudentNumber+"' sem '"+objects[i].whichMiniSem+"'");
			

	}
   

} 