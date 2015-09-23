package one_two;

import java.util.Scanner;

class Node{

	int data;
	Node next;
	Node(int x){
		this.data=x;
		this.next=null;
	}
}
public class Single_Linkedlist{
	Node root;
	Node start=root;
	void insert_big(int d){
		Node newNode=new Node(d);
		if(root==null){
			root=newNode;
			start=root;
		}else{
			Node s=root;
			newNode.next=s;
			start=newNode;
		}
	}
	int count(){
		Node f=start;
		int c=0;
		while(f.next!=null){
			c++;
			f=f.next;
		}
		return c;
	}
	
	void MiddleEle(){
		Node x=start;
		for(int i=0;i<count();i++){
			if(i==(count()/2)){
				System.out.println("Middle element is "+x.data);
				return;
			}
			x=x.next;
		}
	}
	
	void insert(int d){
		Node newNode=new Node(d);
		if(root==null){
			root=newNode;
			start=root;
		}else{
			Node s=start;
			while(s.next!=null){
				s=s.next;
			}
			s.next=newNode;
		}
	}
	void Delete(int x){
		int c=0;
		Node temp=root;
		while(c!=x){
			c++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	void display(){
		Node t=start;
		while(t.next!=null){
			System.out.println(t.data);
			t=t.next;
		}
		System.out.println(t.data);
	}
	
	void search(int x){
		int flag=0;
		Node t=root;
		while(t.next!=null){
			if(t.data==x){
				flag=1;
				System.out.println("The element "+x+" is found");
				return;
			}
			t=t.next;
		}
		if(flag==0)
			System.out.println("The element "+x+" is not found");
	}
	
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		
		Single_Linkedlist d=new Single_Linkedlist();
		int x=1;
		while(x!=0){
			System.out.println("1--Insert at end\n2--Delete at postion\n3--Search\n4--Display\n5--Insert at start\n6--Middle Element");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter element");
				d.insert(sc.nextInt());
				break;
			case 2:System.out.println("Enter element to delete at postion");
				d.Delete(sc.nextInt());break;
			case 3:System.out.println("Enter element to search");
			     d.search(sc.nextInt());break;
			case 4:d.display();break;
			case 5:System.out.println("Insert at start");
			 		d.insert_big(sc.nextInt());break;
			 		
			case 6:d.MiddleEle();break;
			default:x=0;
				break;
			}
			
		}
		
	}
}