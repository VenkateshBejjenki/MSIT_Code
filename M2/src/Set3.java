/*
 Author:-Rajesh Kumar Sheela
 Program:-  Write a Java program to find second maximum of given 3 integers using if else? 
 */
public class Set3 {
	public static void main(String[] args) {
		int a,b,c;
		a=3;
		b=2;
		c=1;

		if(a>b&&a>c){
			if(b>c)
				System.out.println("Second Biggest Number is "+b);
			else
				System.out.println("Second Biggest Number is "+c);
		
		}else if(b>a&&b>c){
			if(a>c)
				System.out.println("Second Biggest Number is "+a);
			else
				System.out.println("Second Biggest Number is "+c);
			
		}else if(c>b&&c>a){
			if(b>a)
				System.out.println("Second Biggest Number is "+b);
			else
				System.out.println("Second Biggest Number is "+a);
				
			}
		

	}

}
