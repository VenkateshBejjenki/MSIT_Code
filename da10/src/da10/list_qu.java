package da10;

import java.util.Scanner;

class node{
	int data;
	node next;
	node pre;	
	node()
    {
        next = null;
        pre = null;
        data = 0;
    }
	node(int d, node n, node p)
    {
        data = d;
        next = n;
        pre = p;
    }
}
class DoubleList{
	node start;
	node end;
	DoubleList(){
		this.start=null;
		this.end=null;
	}
	static int count =0;
	
	void insert(int d){
	node temp=new node(d,null,null);
		if(start==null){
			start=temp;
			end=start;
		}else{
			end.next=temp;
			temp.pre=end;
			end=temp;
		}
		count++;
	}
	
	boolean isEmpty(){		//returns wether list is empty or not
		return (start==null);
	}
	
void PopFront(){
	if(!isEmpty()){
		start=start.next;
		end=start;
		count--;
	}
}

void PopBack(){
	node t=start;
	int cl=0;
	count--;
	while(t.next!=null){
		cl++;
		if(cl==(count-1)){
			t.next=null;
			break;
		}
	t=t.next;
	}
}
	void display(){
		node f=start;
		int flag=0;
		System.out.println("\nTotal elements are "+count);
		while(f.next!=null){
			System.out.print(f.data+" -> ");
			f=f.next;
			flag=1;
		}
		if(flag==1)
			System.out.println(f.data+"\n");
		else
			System.out.println("no elements are present");
	}
	void empty(){
		end=null;
		start=null;
		count=0;
	}
	
	

	void rev(){
		node f=end;
		int flag=0;
		System.out.println("\nTotal elements are "+count);
		while(f.pre!=null){
			System.out.print(f.data+" -> ");
			f=f.pre;
			flag=1;
		}
		if(flag==1)
			System.out.println(f.data+"\n");
	}
}

public class list_qu {

	public static void main(String[] args) {
		DoubleList obj=new DoubleList();
		int x=1;
		Scanner sc=new Scanner(System.in);
		while(x!=0){
			System.out.println("1}--Enqueue\n2}--Display\n3}--Peek\n4}--Dnqueue\n5}--EmptyAll");
			System.out.println("enter the option");
		switch (sc.nextInt()) {
		case 1:System.out.println("Enter the value");
				obj.insert(sc.nextInt());
				break;
		case 2:obj.display();
				break;
		case 3:System.out.println("Peek element is "+obj.start.data);
				break;
		case 4:obj.PopFront();
				break;
		case 5:obj.empty();break;
		default:x=0;
			break;
			}
		}

	}
}
