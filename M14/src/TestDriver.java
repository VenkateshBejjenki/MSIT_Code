import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Problem:-Write a program to demonstrate that all the exceptions raised by the statements given below are caught and handled. This program should include a TestDriver (a main method) class to demonstrate all the exceptions raised by the statements. The exceptions should be handled by displaying an appropriate error message to the console.
 * 
 * Author :- Rajesh Kumar Sheela
 * 
 * */
class IntDemo{
	void display (int x, int y){
		System.out.println(x/y);
	}
}
 
public class TestDriver {
	 
	public static void main(String[] argsv) throws NumberFormatException, IOException{
		IntDemo ina=new IntDemo();
		try{
			ina.display(1, 0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try{
		int x = Integer.parseInt(buf.readLine());
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		
		int c[] = { 1 };
		try{
			c[42] = 99;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		String name=null;
		try{
			System.out.println(name.length());
		}catch(NullPointerException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Final Is Excuted");
		}
		
		try{
			System.out.println(1/0);
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		
	}
}
