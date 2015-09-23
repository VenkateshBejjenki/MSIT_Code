/*
 * Problem:-Write a program to demonstrate that all the exceptions raised by the statements given below are caught and handled. This program should include a TestDriver (a main method) class to demonstrate all the exceptions raised by the statements. The exceptions should be handled by displaying an appropriate error message to the console. 

 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class B1 {
	public static void main(String[] args){
		//BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the no of elements to enter");
		int c=n.nextInt();
		int[] j=new int[8];
		for(int i=0;i<c;i++){
			try{
				j[i]=n.nextInt();
			}catch (Exception e) {
				System.out.println(e);
			    System.out.println(e.getMessage());
			}
		}
		int y=0,k = 0;
		for(int i1=0;i1<c;i1++)
			System.out.println(j[i1]);
		System.out.println("Enter the elements to Remove");
		int rm=n.nextInt();
		
		for (int h=0;h<c-1;h++){
			if(j[h]==rm){
				k=h;break;}
		}
		
		for(int i1=k;i1<c-k;i1++){
			j[i1]=j[i1+1];
		}
			//System.out.println(j[i1]);
	}
}
