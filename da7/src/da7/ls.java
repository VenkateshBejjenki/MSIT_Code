package da7;

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
	void reverse(){
		node before = null;
		node tmp = head;
		while (tmp != null) {
		    node next = tmp.next;
		    tmp.next = before;
		    before = tmp;
		    tmp = next;
		}
		head = before;
		node v=head;
		int f=0;
		while(v.next!=null){
			System.out.print(v.data+"->");
			v=v.next;
			f=1;
		}
		if(f==1)
			System.out.println(v.data);
		System.out.println();
	}
	void empty(){
		head=null;
	}
	void remove(int b){
		node t= head;//cur
		node temp= head;//pre
		int i=0;
		
		while(t.data!=b){
			if(t.next==null){
				System.out.println("Element not found");
				break;
			}
			else{
				temp=t;
				t=t.next;
			}
		}
		
		if(t==head){
			head=head.next;
		}else{
			temp.next=t.next;
		}
		
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
	

	void insert(int d){
		node temp=new node(d);
		if(head==null){
			head=temp;
		}else{
			temp.next=head;
			head=temp;
		}
	}
	
	void RemoveIndex(int x){
		node t= head;//cur
		node temp= head;//pre
		int i=0;
		
			while(i!=x){
				if(t.next==null){
					System.out.println("Element not found");
					break;
				}
				else{
					temp=t;
					t=t.next;
				}
				i++;
			}
			if(t==head){
				head=head.next;
			}else{
				temp.next=t.next;
			}
	}
	void InsertAfter(int x,int y){
		node t=head;
		node temp=new node();
		node b=new node(y);

		while(t.next!=null){
			if(t.data==x){
				temp.next=t.next;
				t.next=b;
				b.next=temp.next;
				break;
			}
			t=t.next;
			
		}
		
	}
	void InsertBefore(int x,int y){ 
		node t=head;
		node temp=new node();
		node b=new node(y);
		while(t.data!=x){
			temp=t;
			t=t.next;
		}
		b.next=t;
		temp.next=b;
	}
	void RemoveLast(){
		node t=head;
		int cl=0;
		while(t.next!=null){
			cl++;
			if(cl==(count()-1)){
				t.next=null;
				break;
			}
		t=t.next;
		}	
	}
	void pushBack(int x){
		node t=head;
		node temp=new node();
		node b=new node(x);
		while(t.next!=null){
			temp=t;
			t=t.next;
		}
		t.next=b;
		b.next=null;
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
	void search(int b){
		node t=head;
		int flag=0;
		while(t!=null){
			if(t.data==b){
				System.out.println("element "+b+" is in list");
				flag=1;
				break;
			}
			t=t.next;
		}
		if(flag==0)
		System.out.println("element "+b+" is not in list");
	}

}

class ls{
	public static void main(String[] args) {
		linklist obj=new linklist();
		int x=1;
		Scanner sc=new Scanner(System.in);
		while(x!=0){
		System.out.println("Enter the selection\n1)--add\n2)--Display\n3)--Remove\n4)--RemoveFirst/popFirst\n5)--No of elements\n6)--RemoveLast\n7)--Remove at index\n8)--Insert After\n9)--Insert Before\n10)--pushBack\n11)--pushFrount\n12)--popback");
		System.out.println("13)--Make All Empty\n14)--reverse");
		switch (sc.nextInt()) {
		case 1:System.out.println("Enter the value");
				obj.insert(sc.nextInt());
				break;
		case 2:obj.display();
				break;
		case 3:System.out.println("enter the element to remove");
				obj.remove(sc.nextInt());
				break;
		case 4:obj.removeFirst();
				break;
		case 5:System.out.println(obj.count());
				break;
		case 6:obj.RemoveLast();
			break;
		case 7:System.out.println("Enter the index pos");
			obj.RemoveIndex(sc.nextInt());
			break;			
		case 8:System.out.println("Enter the index and element");
				obj.InsertAfter(sc.nextInt(), sc.nextInt());
			break;
		case 9:System.out.println("Enter the index and element");
			obj.InsertBefore(sc.nextInt(), sc.nextInt());
			break;
		case 10:System.out.println("Enter the element");
			obj.pushBack(sc.nextInt());
			break;
		case 11:System.out.println("Enter the element");
			obj.pushFrount(sc.nextInt());
			break;
		case 12:obj.popback();break;
		case 13:obj.empty();break;
		case 14:obj.reverse();break;
		default:x=0;
			break;
			}
		}
	}
}
