package da9;

import java.util.Scanner;

class node{		//node class
	int data;
	node next;
	
	node(int d){
		this.data=d;
		this.next=null;
	}
	node(){
		
	}
}
class linklist {	// linklist class
	node head;
	void display(){
		node t= head;
		int flaf=0;
		while(t!=null){
			System.out.print(t.data+" -> ");
			t=t.next;
			flaf=1;
		}
		if(flaf==0)
			System.out.println("No elements are present");
		System.out.println();
	}
	boolean isEmpty(){		//returns wether list is empty or not
		return (head==null);
	}

	void empty(){
		head=null;
	}
	
	int count(){
		int c=0;
		node t=head;
		while(t.next!=null){
			c++;
			t=t.next;
		}
		return ++c;
	}
	
	void removeFirst(){		//Remove First element
		if(!isEmpty())
			head=head.next;
		else
			System.out.println("Empty list");
	}
	
	void pushFrount(int x){
		node temp=new node(x);
		if(head==null){
			head=temp;
		}else{
			temp.next=head;
			head=temp;
		}
		
	}
	
	void popback(){
		node t=head;
		node temp=new node();
		int i=0;
		while(i<count()){
			i++;
			if(i==(count()-1)){
				t.next=null;
				break;
			}
			t=t.next;
		}	
	}
}

public class stack_linked {

	public static void main(String[] args) {
		linklist obj=new linklist();
		int x=1;
		Scanner sc=new Scanner(System.in);
		while(x!=0){
			System.out.println("1}--Push\n2}--Display\n3}--Peek\n4}--Pop\n5}--EmptyAll");
			System.out.println("enter the option");
		switch (sc.nextInt()) {
		case 1:System.out.println("Enter the value");
				obj.pushFrount(sc.nextInt());
				break;
		case 2:obj.display();
				break;
		case 3:System.out.println("Peek element is "+obj.head.data);
				break;
		case 4:obj.removeFirst();
				break;
		case 5:obj.empty();break;
		default:x=0;
			break;
			}
		}

	}

}
