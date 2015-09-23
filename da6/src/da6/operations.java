package da6;

import java.util.Scanner;

class array_p{
	
	static int[] list=new int[1];
	static int x=0;
	static int a=2;
	static int b=0;
	void pushBack(int y){
		list[x++]=y;
		if(x>=list.length){
			int[] new_list=new int[list.length];
			for(int i=0;i<list.length;i++)
				new_list[i]=list[i];
			list=new int[new_list.length+a++];
			for(int i=0;i<new_list.length;i++)
				list[i]=new_list[i];
		}
	}
	int count(){
		int count=0;
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				count++;
		return count;
		
	}
	
	void print(){
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				System.out.println(list[i]);
	}
	void popBack(int x){
		if(list[x]!=0){
			for(int i=x;i<list.length-1;i++){
				list[i]=list[i+1];
			}
		}else{
			list[x]=0;
		}
		b=(3*list.length)/4;
		if(count()<b){
			int[] new_list=new int[list.length];
			for(int i=0,p=0;i<list.length;i++)
				if(list[i]!=0)
					new_list[p++]=list[i];
			list=new int[b];
			for(int i=0;i<b;i++)
				list[i]=new_list[i];
		}
	}
}


public class operations {

	public static void main(String[] args) {
		int x=1;
		array_p a=new array_p();
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("1) Pushback\n2) count\n3) print\n4) PopBack\n5) Exit");
			System.out.println("Enter the selection");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the value to enter");
				a.pushBack(scan.nextInt());
				break;
			case 2:System.out.println("Number of elements in list = "+a.count());
				break;	
			case 3:a.print();
				break;	
			case 4:System.out.println("Enter the index to delete");
				a.popBack(scan.nextInt());
				break;
			case 5:x=0;
				break;
			default:
				break;
			}
		}while(x!=0);

	}

}
