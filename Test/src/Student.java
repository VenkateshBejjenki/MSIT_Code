
class Student 
{
	int rollno=30;
	String name="MSIT";
	public static void main(String[] args) 
	{
		Student ob=new Student();
		

		System.out.println(ob);
	}
	public String toString()
	{
           return "Roll no: "+rollno+" Name: "+name;
			  
	}
}