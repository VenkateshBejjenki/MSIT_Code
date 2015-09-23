/*
 Program:-Write a Java program SumAndAverage to produce the sum and average of 1, 2, 3, ..., to 100 using for, while, do while. The output shall look like:    
 Author:-Rajesh Kumar Sheela
 */
public class B1 {
	public static void main(String[] args) {
		int sum = 0,j=0; 
		double average; 
		System.out.println("Using for loop");	//Using for loop
		for(int i=1;i<=100;i++)
			sum+=i;
		System.out.println("Sum is :- "+sum);
		average=sum/100;
		System.out.println("average is :- "+average);

		System.out.println("\nUsing while loop");		//Using while loop
		sum=0;average=0;
		while(j<=100){
			sum+=j;
			j++;
		}
		System.out.println("Sum is :- "+sum);
		average=sum/100;
		System.out.println("average is :- "+average);
		
		System.out.println("\nUsing do-while loop");		//Using do-while loop
		sum=0;average=0;;j=0;
		do{
			sum+=j;
			j++;
		}while(j<=100);
		System.out.println("Sum is :- "+sum);
		average=sum/100;
		System.out.println("average is :- "+average);
	}

}
