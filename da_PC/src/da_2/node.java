package da_2;

public class node {
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
	
	void insert(int d){
		node temp=new node(d);
		if(head==null){
			head=temp;
		}else{
			temp.next=head;
			head=temp;
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
	
	void result(){
		node t=null;
		node k=head;
		int x=0,f=0;
		while(k.next!=null){
			x=k.data;
			f=0;
			t=head;
			for (int i = 0; i <count(); i++) {
				if(t.data==x){
					f++;
				}
				t=t.next;
			}
			if(f>1)
				remove(x);
		k=k.next;
	}
		display();
}
	
	
	void remove(int b){
		node t= head;//cur
		node temp= head;//pre
			while(t.data!=b){
					temp=t;
					t=t.next;
			}
			if(t==head){
				head=head.next;
			}else{
				temp.next=t.next;
			}
	}
}