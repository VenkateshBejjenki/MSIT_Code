import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Initial_Screen {

	public static void main(String[] args) {
		System.out.println("1 Create paypal Account\n2 Sign in to paypal");
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("\nSelect an option");
		try {
			int chooo=Integer.parseInt(input.readLine());
			
			switch(chooo){
				case 1:new account_check();
				break;
				case 2:
				Sign_in sd=new Sign_in();
				if(sd.x==1){
					System.out.println("1) Add Fund\n2) Withdraw Amount\n3) Transfer Amount\n4)Requst Amount");
				}
				break;
			
			}
		}catch (Exception e) {System.out.println(e.getMessage());}
	}

}
