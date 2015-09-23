package four;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node pre;
	Node(int s){
		this.data=s;
		this.next=null;
		this.pre=null;
	}
}


public class DoubleLinkedList {
	Node start;
	Node end;
	void insert(int x){
		Node temp=new Node(x);
		if(start==null){
			start=temp;
			end=start;
		}else{
			Node t=start;
			while(t.next!=null){
				t=t.next;
			}
			t.next=temp;
			temp.pre=t;
			end=temp;
		}
	}
	
	void Display(){
		System.out.println("For");
		Node t=start;
		while(t.next!=null){
			System.out.println("element is "+t.data);
			t=t.next;
		}
		System.out.println("element is "+t.data);
		System.out.println("rev");
		t=end;
		while(t.pre!=null){
			System.out.println(t.data);
			t=t.pre;
		}
		System.out.println(t.data);
	}
	
	void ele_position_del(int x){
		int c=0;
		Node t=start;
		while(c!=x){
			c++;
			t=t.next;
		}
		t.next=t.next.next;
		t.next.pre=t;
	}
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int x=1;
		DoubleLinkedList d=new DoubleLinkedList();
		while(x!=0){
			System.out.println("1--insert at end\n2--Diaplay\n3--Delete by position");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter value");
				d.insert(sc.nextInt());
				break;
			case 2:d.Display();break;
			case 3:System.out.println("Enter position ");
			 		d.ele_position_del(sc.nextInt());break;
			default:x=0;
				break;
			}
		}
	}
}
