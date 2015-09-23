import java.util.Scanner;
class Calculator {
      int result;
		     int sum(int x, int y)
			    {
					result=x+y;
						return result;
			     }
		     int difference(int x, int y)
		     	{
		    	 result=x-y;
		    	 return result;
		     	}
		     int product(int x, int y)
		     	{
		    	 result=x*y;
		    	 return result;
		     	}
		     int division(int x, int y)
		     	{
		    	 result=x/y;
		    	 return result;
		     	}
 }
class  PB2_Calculator
{
   public static void main(String args[])
   {
      int i1, i2;
      Scanner sc=new Scanner(System.in);
      Calculator  m=new Calculator();      // creating object
      // Reading input from user
      System.out.println("Enter the value one");
      i1=sc.nextInt();
      System.out.println("Enter the value Two");
      i2=sc.nextInt();
         // example of calling a method
          System.out.println("Sum "+m.sum(i1,i2));
          System.out.println("difference "+m.difference(i1,i2));
          System.out.println("product "+m.product(i1,i2));
          System.out.println("division "+m.division(i1,i2));

    }
}