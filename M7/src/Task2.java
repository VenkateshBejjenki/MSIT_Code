/*
 * Program:- Write a Java Program which does the following: 
 * Author:- Rajesh Kumar Sheela
 
 */
import java.util.*;
class MSITStudent{
	String StudentName;
	int StudentNumber;
	int MiniSem;
	boolean isEligible;
	boolean isRegistered;
	
	public void Registration(boolean b){
		if(b==true){
			System.out.println("Registration Open");
		}else{
			System.out.println("Registration Can not be done");
		}
	}
	
	public boolean Eligibility(){
		Random rand = new Random();
		boolean b=rand.nextBoolean(); // gets true or false
		return b;
	}
}
public class Task2 {
	public static void main(String[] args) {
		MSITStudent msit=new MSITStudent();
		boolean v=msit.Eligibility();
		msit.Registration(v);
		

	}

}
