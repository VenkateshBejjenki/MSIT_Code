package test;
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
			start.pre=temp;
			temp.next=start;
			start=temp;
			
		}
		count++;
	}
	void PushBack(int d){
		node temp=new node(d, null, null);
		if(start == null)
        {
            start = temp;
            end = start;
        }
        else
        {
            temp.pre=end;
            end.next=temp;
            end = temp;
        }
        count++;
	}
	void insertBle(int x,int y){
		node b=new node(y, null, null);
		node temp=new node();
		node o=new node();
		count++;
		if(x==1){
			insert(y);
			return;
		}else{
			node t=start;
			while(t.data!=x){
				temp=t;
				t=t.next;
			}
			o.next=temp.next;
			temp.next=b;
			b.next=t;
			b.pre=temp;
			t.pre=b;
		}
	}
	void insertEle(int x,int y){
		node b=new node(y, null, null);
		node temp=new node();
		count++;
		if(x==1){
			insert(y);
			return;
		}else{
			node t=start;
			while(t.data!=x){
				//temp=t;
				t=t.next;
			}
			System.out.println(temp.data+" "+t.data);
			temp.next=t.next;
			t.next=b;
			b.pre=t;
			b.next=temp.next;
			temp.next.pre=b;
			
	}
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
	}
	void empty(){
		node f=start;
		node e=end;
		f.next=null;
		e.pre=null;
		count=0;
	}
	
void RemoveIndex(int x){
	node t=start;
	node temp=new node();
	int i=0;
	count--;
	while(i!=x){
		i++;
		if(t.next==null){
			System.out.println("Element not found");
			break;
		}
		else{
			temp=t;
			t=t.next;
		}
		
	}
	if(t==start){
		start=start.next;
	}else{
		temp.next=t.next;
		temp.pre=t.pre;
	}
}
	
void removeEle(int b){
	node t=start;
	node temp=new node();
count--;
	int i=0;
	while(i<count){
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
	
	if(t==start){
		start=start.next;
		end=end.next;
	}else{
		temp.next=t.next;
		temp.pre=t.pre;
	}
	i++;
	}
	
	
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
public class test {
	public static void main(String[] args){
		DoubleList d=new DoubleList();
		int x=1;
		Scanner sc=new Scanner(System.in);
		while(x!=0){
			System.out.println("1)-->PushFront\n2)-->Display-Forward\n3)--PushBack\n4)--Insert Element after a specified Element\n5)--Insert Element before a specified Element\n6)--PopFront\n7)--PopBack\n8)--Display Reverse");
			System.out.println("9)--Empty\n10)--removeEle\n11)--Remove at Index\nEnter the selection");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter the element");
					d.insert(sc.nextInt());
				break;
			case 2:d.display();break;
			case 3:System.out.println("enter element");
			       d.PushBack(sc.nextInt()); break; 
			case 4:System.out.println("Enter the specified element and value");
					d.insertEle(sc.nextInt(),sc.nextInt());break;
			case 5:System.out.println("Enter the specified element and value");
					d.insertBle(sc.nextInt(), sc.nextInt());break;
			case 6:d.PopFront();break;
			case 7:d.PopBack();break;
			case 8:d.rev();break;
			case 9:d.empty();break;
			case 10:System.out.println("Enter element position to delete");
			   d.removeEle(sc.nextInt());break;
			case 11:System.out.println("Enter the index to remove");
			d.RemoveIndex(sc.nextInt());break;
			default:x=0;
				break;
			}
			
		}
	}
}
