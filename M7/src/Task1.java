
/*
 * Program:-Write another class TestOverLoading and create object for class OverLoading and call all the overloading methods. You can have n number of classes in your java program, provided you are saving your program with the class name which contain main method. The skeleton code of OverLoading class has been given below.
 * Author:- Rajesh Kumar Sheela
 
 */
class OverLoading
{
		public void printData(int a)
		{
			System.out.println(a);

		}
		public void printData(double a)
		{
			System.out.println(a);

		}
		public void printData(float a)
		{
			System.out.println(a);

		}
		public void printData(char a)
		{
			System.out.println(a);

		}
		public void printData(boolean a)
		{
			System.out.println(a);

		}
		public void printData(String a)
		{
			System.out.println(a);

		}
		public void printData(long a)
		{
			System.out.println(a);

		}
}
public class Task1 {
	public static void main(String[] args) {
		
		OverLoading o=new OverLoading();
		o.printData(1);
		o.printData('c');
		o.printData(1.2);
		o.printData(1222222222);
		o.printData(true);
		o.printData("Rajesh");
		o.printData(1.001);
	}

}
