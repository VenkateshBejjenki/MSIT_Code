import java.util.Scanner;

/*
 Program:-You can have n number of classes in your java program, provided you are saving your program with the class name which contain main method.    
 Author:-Rajesh Kumar Sheela
 */
class Integer {
     
         int N;
         int sum=0;
  
  
  public void readInteger() {
	System.out.println("enter N");
	Scanner sc=new Scanner(System.in);// to take input from keyboard
	N=sc.nextInt();
       
  }
  public void printMessage() {
       for (int i = 0 ; i < N ; i++) {
            System.out.println("MSIT @ IIIT Hyderabad and JNTU Hyderabad");
      }
  }
  
  public int addInteger(int no){
	  for(int i=0;i<no;i++)
		  sum+=i;
	  return sum;
  }

}
class  PB1_Integer{
	public static void main(String args[])
	{
	             // write your code here to create object and call respective methods
		int v,x;
		Integer intobj=new Integer();
		intobj.readInteger();
		intobj.printMessage();
		System.out.println("enter NO");
		Scanner sc=new Scanner(System.in);
		v=sc.nextInt();
		x=intobj.addInteger(v);
		System.out.println("Sum of "+v+" Integers is "+x);
	}
}