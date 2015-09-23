package three;

import java.util.Scanner;

 class Node {
	String data;
	Node next;
	Node(String s){
		this.data=s;
		this.next=null;
	}
}

public class stack{
	Node head;
	Node start=head;
	void push(String d){
		Node temp=new Node(d);
			temp.next=start;
			start=temp;
		
	}
	
	void pop(){
		Node t=start;
		start=t.next;
	}
	
	void Diaplay(){
		Node t=start;
		while(t.next!=null){
			System.out.println("elements are "+t.data);
			t=t.next;
		}
		System.out.println("elements are "+t.data);
		
	}
	
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		int x=1;
		stack f=new stack();
		while(x!=0){
			System.out.println("1--push\n2--pop\n3--Display");
			switch (in.nextInt()) {
			case 1:System.out.println("Enter the string");
				f.push(sc.nextLine());
				break;
			case 2:f.pop();break;
			case 3:f.Diaplay();break;
			default:x=0;
				break;
			}
		}
	}
	
}
