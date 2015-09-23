import java.util.Scanner;

/*
 * 
 * Program:- Write a program TestThread.java that takes a positive integer n from the command line and creates exactly n threads that print out their own name. Here is a sample execution: 
 * 
 *Author:- Rajesh Kumar Sheela
 * */

class loc extends Thread{
	public void run(){
			System.out.println(getName());
	}
}
public class TestThread {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the na value");
		int n=inp.nextInt();
		loc[] tt=new loc[n];
		for(int i=0;i<n;i++)
			tt[i]=new loc();
		for(int i=0;i<n;i++)
			tt[i].start();
	}

}
