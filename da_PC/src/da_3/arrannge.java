package da_3;

import java.util.Scanner;

public class arrannge {

	public static void main(String[] args) {
	
		int x=1;
		Scanner sc=new Scanner(System.in);
		stack st=new stack(30);
		while(x!=0){
			System.out.println("Insert---1\nDiaplay---2");
			switch (sc.nextInt()) {
			case 1:st.push(sc.nextInt());
				break;
			case 2:st.displayTheStack();
				break;
			default:x=0;
				break;
			}
		}

	}

}
