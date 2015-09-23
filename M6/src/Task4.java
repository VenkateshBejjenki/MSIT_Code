/*
 * Program:-Modify the above program to play 3 dice games using a method. 
 * Author:- Rajesh Kumar SHeela
 
 */
import java.util.*;
public class Task4 {
	public static void main(String[] args) {
	        int tries = 0;
	        int sum = 0;
	        int roll1, roll2,roll3;

	        while (sum != 7) {
	        	roll1=game();
	        	roll2=game();
	        	roll3=game();
	            sum = roll1 + roll2+roll3;
	            //if(sum!=7)
	            	System.out.println(roll1 + " + " + roll2+ " + " + roll3 + " = " + sum);
	            tries++;
	        }
	        
	        System.out.println("You won after " + tries + " tries!");

	}
	public static int game(){
		Random rand = new Random();
		return rand.nextInt(5)+1;
		
	}

}
