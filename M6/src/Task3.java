/*
 * Program:-Write a program that simulates rolling of two 6-sided dice until their combined result comes up as 7. You must use Random function to roll 6 sided dice.
			The following is the skeleton code for throwing dice until you get sum of two dice throws 7 
 * Author:- Rajesh Kumar SHeela
 
 */
import java.util.*;
public class Task3 {
	public static void main(String[] args) {
		
		 Random rand = new Random();
	        int tries = 0;
	        int sum = 0;
	        int roll1, roll2;

	        while (sum != 7) {
	        	roll1=rand.nextInt(5)+1;
	        	roll2=rand.nextInt(5)+1;
	            sum = roll1 + roll2;
	            if(sum!=7)
	            	System.out.println(roll1 + " + " + roll2 + " = " + sum);
	            tries++;
	        }
	        
	        System.out.println("You won after " + tries + " tries!");
	}

}
