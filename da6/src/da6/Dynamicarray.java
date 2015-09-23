package da6;

import java.util.Scanner;

class array
{
	
	static int[] list=new int[1];
	static int x=0;
	// add elements at the end
	void add(int y)
	{
		list[x++]=y;
		if(x>=list.length){
			int[] new_list=new int[list.length];
			for(int i=0;i<list.length;i++)
				new_list[i]=list[i];
			list=new int[new_list.length*2];
			for(int i=0;i<new_list.length;i++)
				list[i]=new_list[i];
		}
	}
	
	
	// inserting an element y at index x1
	void Insert(int x1,int y){
		int temp;
		if(list[x1]!=0){
			temp=list[x1];
			list[x1]=y;
			x++;
			if(x1>=list.length){
				int[] new_list=new int[list.length];
				for(int i=0;i<list.length;i++)
					new_list[i]=list[i];
				list=new int[new_list.length*2];
				for(int i=0;i<new_list.length;i++)
					list[i]=new_list[i];
			}
			for(int j=list.length-1;j>x1;j--){
					list[j]=list[j-1];
					if(j==(x1+1))
							list[j]=temp;
			}
		}else{
			list[x]=y;
		}
		
	}
	
	//counting no of elements
	void count(){
		int count=0;
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				count++;
		System.out.println("Number of elements in list = "+count);
	}
	// modifing element at given index
	void modifi(int x,int y){
		list[x]=y;
	}
	
	//printing all elements
	void print(){
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				System.out.println(list[i]);
	}
	
	//deleting elements at given index
	void del(int x){
		if(list[x]!=0){
			for(int i=x;i<list.length-1;i++){
				list[i]=list[i+1];
			}
		}else{
			list[x]=0;
		}
	}
}

// main class
public class Dynamicarray {

	public static void main(String[] args) {
		int x=1;
		array a=new array();
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("1) Add\n2) Inesrt\n3) Count\n4) Modifi\n5) Print\n6) Delete\n7) Exit ");
			System.out.println("Enter the selection");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the value to enter");
				a.add(scan.nextInt());
				break;
				
			case 2:
				System.out.println("Enter the index value and value");
				a.Insert(scan.nextInt(),scan.nextInt());
				break;

			case 3:a.count();
				break;
				
			case 4:
				System.out.println("Enter the index to modifi");
				a.modifi(scan.nextInt(),scan.nextInt());
				break;
				
			case 5:a.print();
				break;
				
			case 6:System.out.println("Enter the index to delete");
				a.del(scan.nextInt());
				break;
				
			case 7:x=0;
				break;
				
			default:
				break;
			}
		}while(x!=0);// infinet loop

	}

}
