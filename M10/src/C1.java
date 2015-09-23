/*
  Problem Description: Inner classes: Write an inner class with methods to convert temperatures between Celsius and Fahrenheit in both directions. The declaration of temperature variables, reading of their values, invoking the conversion methods should be specified in an outer class. 
  
  Author:- Rajesh Kumar Sheela
  
   */
import java.util.*;
public class C1 {

	class Celsius{
		void display(double x){
			System.out.println("Value is " +((x*9/5)+32) );
		}
	}
	class Fahrenheit{
		void display(double x){
			System.out.println("Value is " + ((x*2)+30));
				}
		
	}
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int x=1;
		double input;
		C1 o=new C1();
		do{
			System.out.println("Celsius to Fahrenheit :: 1");
			System.out.println("Fahrenheit to Celsius :: 2");
			System.out.println("Exit			:: 3\n");
			System.out.println("Enter the choise");
			switch(sc.nextInt()){
			case 1:{
				C1.Celsius cle=o.new Celsius();
				System.out.println("Enter a value for converting Celsius to Fahrenheit  ");
				input=sc.nextInt();
				cle.display(input);
				break;
			}
						
			
			case 2:{
					C1.Fahrenheit fle =o.new Fahrenheit();
					System.out.println("Enter a value for converting Fahrenheit to Celsius   ");
					input=sc.nextInt();
					fle.display(input);
					break;
			}
				
			case 3:x=0;break;
			}
		}while(x!=0);
		
	}

}
