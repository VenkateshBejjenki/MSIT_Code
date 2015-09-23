/*
 Program:-1. Write a java program to assign 10 int values to the array numbers and print the sum and average of the array?  
 Author:-Rajesh Kumar Sheela
 */
public class A1 {
	public static void main(String[] args) {
		int[] array= new int[10];
		for(int i=0;i<10;i++)
			array[i]=i;
		int sum=0;
		double avg;
		for(int i=0;i<10;i++)
			sum+=i;
		avg=(double)sum/10;
		System.out.println("Sum of 10 numbers is "+sum+"\nAverage is "+avg);
	}

}
