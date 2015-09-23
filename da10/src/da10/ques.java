package da10;

import java.util.Arrays;
import java.util.Scanner;

class imp_que implements Queues{

	String[] array;
	imp_que(int size){
		array=new String[size];
		Arrays.fill(array, " ");
	}
	static int frount=-1;
	static int rear=-1;
	static int ii=-1;
	
	public void Enqueue(String x) {
		if(frount<0){
			array[++ii]=x;
			frount++;
			rear++;
		}else{
			array[++ii]=x;
			rear++;
		}
		
	}

	public void Dqueue() {
		
		if(frount<=rear)
			frount++;
		else
			System.out.println("Sorry List is empty");
	}

	public void Frount() {
		System.out.println(array[frount]);
	}

	public boolean isEmpty() {
	
		return (frount==rear);
	}

	public void Display() {
		
		for (int i = frount; i <=rear; i++) {
			System.out.println(array[i]);
		}
	}
	
}
public class ques {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		int x=1;
		imp_que eq=new imp_que(10);
		while(x!=0){
			System.out.println("1)--Enqueue\n2)--Diaplay\n3)--Dqueue\n4)--Front\n5)--isEmpty()");
			switch (in.nextInt()) {
			case 1:System.out.println("Enter the element");
					eq.Enqueue(sc.nextLine());break;

			case 2:eq.Display();break;
			case 3:eq.Dqueue();break;
			case 4:eq.Frount();break;
			case 5:if(eq.isEmpty())System.out.println("Sorry List is empty"); else System.out.println("List is not empty");break;
			default:x=0;
				break;
			}
		}

	}

}
