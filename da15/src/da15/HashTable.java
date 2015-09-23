package da15;

import java.util.Scanner;

class Node{
	int key;
	String value;
	Node next;
	Node(String h){
		this.value=h;
		this.next=null;
	}
}

public class HashTable {

	//Node Start;
	Node[] array = new Node[30];
	void insert(String data){
		Node temp=new Node(data);
		int key=((int)data.charAt(0))%10;
		System.out.println(key+" "+((int)data.charAt(0)));
		if(array[key]==null){
			array[key]=temp;
			array[key].key=key;
		}
		else{
			Node start=array[key];
			while(start.next!=null){
				start=start.next;
			}
			start.next=temp;
			array[key].key=key;
		}
	}
	
	void Display(){
		System.out.println("Key Value");
		for(int i=0;i<30;i++){
			if(array[i]!=null){	
				if(array[i].next==null)
					System.out.println(array[i].key+" "+array[i].value);
				else if(array[i].next!=null){
					System.out.println(array[i].key);
					while(array[i].next!=null){
						System.out.print("   ");
						System.out.println(array[i].value);
						array[i]=array[i].next;
					}
				}
			}
	}
}
	
	public static void main(String[] args){
		HashTable ht=new HashTable();
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		int x=1;
		while(x!=0){
			System.out.println("1---Insert\n2---Display");
			switch (in.nextInt()) {
			case 1:System.out.println("Enter the value");
				ht.insert(sc.nextLine());
				break;
			case 2:ht.Display();break;
			default:x=0;
				break;
			}
		}
		
	}
}
