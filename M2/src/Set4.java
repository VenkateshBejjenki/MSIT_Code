/*
 Author:-Rajesh Kumar Sheela
 Program:- Write a program to print the Electricity bill of a given customer. 
 */
public class Set4 {
	public static void main(String[] args) {
		int x=0;
		float bill=0;
		if(x<200&&x!=0)
			bill=(float) ((float)x*(1.2));
		else if(x>=200&&x<400)
			bill=(float) ((float)(x-200)*(1.6))+(float) ((float)200*(1.2));
		else if(x>=400&&x<600)
			bill=(float) ((float)(200)*(1.6))+(float) ((float)200*(1.2))+(float) ((float)(x-400)*(2));
		else if(x>=600)
			bill=(float) ((float)(200)*(1.6))+(float) ((float)200*(1.2))+(float) ((float)(200)*(2))+(float) ((float)(x-600)*(2.50));
		else
			bill=25;

		if(bill>300){
			bill+=15*bill/100;
		}
		System.out.println("Used "+x+" Units charge will be :- Rs "+bill);
			

	}

}
