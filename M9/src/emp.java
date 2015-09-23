/*
 * Program:-This problem uses Employee, Temporary employee and full time employee class in inheritance model. Create Employee class as base class and create TemporaryEmployee and FulltimeEmployee as sub class for Employee class.

			Employee class  : It is a registered employee which has member variables such as Name, Surname, Address and BasicSalary salary. it should have constructor to initialize members and display function to display details . And also it should have getBasicSalary method to get Basic Salary.
			
			Temporary Employee : It has additional member variables to Employee such as no_of_days_worked. It should also have claculateNetSalary Method which have to calculate no_of_days_worked * BasicSalary / (number of days that month have). Basic salary have to be taken from base class. while creating basic salary constructor pass values to Employee's members though super keyword.
			
			Full time Employee : it have additional member variable providentfund(in percentage). It should also have claculateNetSalary Method which have to calculate ( basicsalary +(basic salary * providentfund/100)) Basic salary have to be taken from base class. while creating basic salary constructor pass values to Employee's members though super keyword.
			
			In main method create 4 TemporaryEmployees and 4 FulltimeEmployees.
			 
 * Author:- Rajesh Kumar SHeela
 
 */
class Employee{
	String Name, Surname, Address;
	int BasicSalary;
	Employee(String s1,String s2,String s3,int x){
		this.Name=s1;
		this.Surname=s2;
		this.Address=s3;
		this.BasicSalary=x;
	}
	void getBasicSalary(int x){
		
	}
	
}
class TemporaryEmployee extends Employee{

	TemporaryEmployee(String s1, String s2, String s3, int x) {
		super(s1, s2, s3, x);
	}
	void claculateNetSalary(int no_of_days_worked,int no_of_days){
		System.out.println(Name+" "+Surname);
		System.out.println(no_of_days_worked*BasicSalary/no_of_days+" Rs");
		
	}
}
class FulltimeEmployee extends Employee{

	FulltimeEmployee(String s1, String s2, String s3, int x) {
		super(s1, s2, s3, x);
	}

	void claculateNetSalary(int providentfund){
		System.out.println(Name+" "+Surname);
		System.out.println(BasicSalary +(BasicSalary * providentfund/100)+" Rs");
	}
	
}
class emp{
	public static void main(String[] args){
		TemporaryEmployee temp = new TemporaryEmployee("Rajesh","Sheela","Ktdm", 20000);
		temp.claculateNetSalary(20, 30);
		FulltimeEmployee full = new FulltimeEmployee("kumar","Sheela","Ktdm", 20000);
		full.claculateNetSalary(5);
			
		}
}