
package in.msitprogram.jntu.paypal.console;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author pg
 *
 */
public class MainMenu {
	
	public static void show() throws IOException{
		System.out.println("-----------------------------------------------");
		System.out.println("-------------------PAYPAL----------------------");
		System.out.println("-----------------------------------------------");
		System.out.println("1 Create paypal Account\n2 Sign in to paypal");
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("\nSelect an option");
		try {
			int chooo=Integer.parseInt(input.readLine());
			
			switch(chooo){
				case 1:{
						System.out.println("Enter your Email Id ");
						String email=input.readLine();
						new PPNewAccountScreen(email);
						
					break;
				}
				case 2:
					break;
					default:System.out.println("Invalid Option");
					break;
			
			}
		}catch (Exception e) {System.out.println(e.getMessage());}
		//show the welcome message with the main menu options
		
		//take the menu option as input from the console
		
		//take email address as input from the console
		
		//based on the given menu option instantiate the respective screens
	}

	private static void PPNewAccountScreen() {
		// TODO Auto-generated method stub
		
	}

}
