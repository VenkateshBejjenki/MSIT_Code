/*
 * Author :- Rajesh Kumar Sheela
 */

interface MSITStudent{
	void getGPA(int x);
}
interface MSITMentor{
	
	void getSalary(int y);
}


class Ta implements MSITStudent, MSITMentor {

	String name;
	int roll;
	public void getGPA(int x) {
		System.out.println("GPA is "+x);
	}

	public void getSalary(int y) {
		System.out.println("Salary is "+y);
		
	}

	
   
}

public class details{
	public static void main(String[] argsv){
		MSITStudent t=new Ta();
		t.getGPA(9);
		MSITMentor m=new Ta();
		m.getSalary(100000);
		m=new Ta();
		
	}
}
