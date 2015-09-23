package da_2;

import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		linklist l= new linklist();
		int x=1;
		Scanner sv=new Scanner(System.in);
		while(x!=0){
			System.out.println("1)----Insert-----(1");
			System.out.println("2)----output-----(2");
			System.out.println("3)----Display-----(3");
			switch (sv.nextInt()) {
			case 1:System.out.println("Enter element");
			  		l.insert(sv.nextInt());
				break;
			case 2:l.result();break;
			case 3:l.display();break;
			default:x=0;
				break;
			}
		}

	}

}
