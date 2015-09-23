/*
 Program:-Write a Java program PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use a "switch-case" statement.  
 Author:-Rajesh Kumar Sheela
 */
public class A1 {
	public static void main(String[] args) {
		 int number = 15;	//number should find year
	       switch(number) {			//staring switch case
	       default: System.out.println("OTHER");break;
	         case 1:System.out.println("ONE"); break;
	         case 3:System.out.println("THREE"); break;
	         case 4:System.out.println("FOUR"); break;
	         case 8:System.out.println("EIGHT"); break;
	         case 6:System.out.println("SIX"); break;
	         case 7:System.out.println("SEVEN"); break;
	         case 2:System.out.println("TWO"); break;
	         case 9:System.out.println("NINE"); break;
	         case 5:System.out.println("FIVE"); break;
	          
	      }

	}

}
