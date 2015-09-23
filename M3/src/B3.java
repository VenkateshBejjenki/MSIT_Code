/*
 Program:- Write a program ComputePI to compute the value of π, using the following series expansion, as shown below, where n=50. using for loop    
 Author:-Rajesh Kumar Sheela
 */
public class B3 {
	public static void main(String[] args) {
		double sum=0.0;
		int x=0;
		for(int i=1;i<50;i++){
			if(i%2==0) 	//even
			{
				sum-=(double)1/(x+i);
			}else{	//odd
				sum+=(double)1/(x+i);
			}
			x++;
			//System.out.println(sum);
		}
		System.out.println("pi = "+4*sum);

	}

}
