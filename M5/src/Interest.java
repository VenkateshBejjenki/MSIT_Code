import java.util.Scanner;
class Sal{
	static int Principle_Amount;
	static int no_of_Years;
	static int Rate_of_Interest;
	static Scanner sc=new Scanner(System.in);
	
	public static void readPrincipleAmount(){
		System.out.println("Enter the PrincipleAmount");
		Principle_Amount=sc.nextInt();
	}
	public static void readNoOfYears(){
		System.out.println("Enter the NoOfYears");
		no_of_Years=sc.nextInt();
	}
	public static void readInterestRatePY(){
		System.out.println("Enter the InterestRate");
		Rate_of_Interest=sc.nextInt();
	}
	public static void calcuateSimpleInterest(){
		System.out.println(Principle_Amount*no_of_Years*Rate_of_Interest/100);
	}
	public static void calculateCompoundInterest(){
		int f;
		System.out.println("Enter the Coumponding per year");
		f=sc.nextInt();
		System.out.println(Principle_Amount*Math.pow(1+(Rate_of_Interest/(100*f)),(f*no_of_Years)));
	}
}

public class Interest {

	public static void main(String[] args) {
		
		Sal mem=new Sal();
		mem.readPrincipleAmount();
		mem.readNoOfYears();
		mem.readInterestRatePY();
		mem.calcuateSimpleInterest();
		mem.calculateCompoundInterest();
	}

}
