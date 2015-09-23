
import java.util.*;

class Mentor
{
	 String MentorName,Offered_course;
	 int whichMiniSem;
}

class MSITStudent
{
	
	String studentName;
	int StudentNumber;
	int whichMiniSem;
	boolean isEligible;
       Mentor mentors[]=new Mentor[6];	
	MSITStudent nStudents[];   // to store n student details;



	public static boolean isEligibility()
	{
		Random rand=new Random();
		boolean b=rand.nextBoolean();
		return b;
	}

        public static void main(String[] args) 
	{
		 MSITStudent st=new MSITStudent();

		 Scanner sc=new Scanner(System.in);
		 Scanner isc=new Scanner(System.in);

		int n;
		System.out.println("how many students you want to register\n");
		n=sc.nextInt();
		
		st.nStudents=new MSITStudent[n];
		
		for(int i=0;i<n;i++)
			st.nStudents[i]=new MSITStudent();
		
		for(int i=0;i<6;i++)
			st.mentors[i]=new Mentor();
		
		System.out.println("enter the student details");
		for(int i=0;i<n;i++){
			st.nStudents[i].studentName=sc.nextLine();
			st.nStudents[i].StudentNumber=isc.nextInt();
			st.nStudents[i].whichMiniSem=isc.nextInt();
		}
		
		for(int i=0;i<6;i++){
			st.nStudents[i].mentors[i]=new Mentor();
		}
		System.out.println("enter the Mentors details");
		for(int i=0;i<6;i++){
			st.nStudents[i].mentors[i].MentorName=sc.nextLine();
			st.nStudents[i].mentors[i].Offered_course=isc.nextLine();
			st.nStudents[i].mentors[i].whichMiniSem=isc.nextInt();
		}
			
		
		

	}
   

} 