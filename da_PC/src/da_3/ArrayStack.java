package da_3;

import java.util.Arrays;

class stack extends StackADT{
	int size;
	int[] array;
	int top =-1;
	int[] a1=new int[30];
	int[] a2=new int[30];
	stack(int size){
		this.size=size;
		this.array=new int[size];
		//Arrays.fill(array,'\0');
	}
	void displayTheStack(){
		display();
		System.out.println();
		for (int i = 0; i <80; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0)
				System.out.print("| "+array[i]+" ");
		}
		System.out.println();
		for (int i = 0; i <80; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	void push(int s){
		if(top+1<size){
			array[++top]=s;
			 System.out.println("PUSH " + s + " Was Added to the Stack\n");
		}else System.out.println("Sorry But the Stack is Full");
		//displayTheStack();
	}
	int peek(){
		//System.out.println("the peek is "+array[top]);
		return array[top];
	}

	boolean isEmpty(){
		return top==-1;
	}
	void popAll(){
		for (int i =array.length; i >=0; i--) {
			pop();
		}
	}
void display(){
int c,d,n,swap;
for (int i = 0; i < a1.length; i++) {
	if(array[i]>0)
		a1[i]=array[i];
	else
		a2[i]=array[i];
}
popAll();
n=a1.length;
for(c=0;c<(n-1);c++) {
    for(d=0;d<n-c-1;d++) {
	        if(a1[d]>a1[d+1])
	        {
	          swap    = a1[d];
	          a1[d]   = a1[d+1];
	          a1[d+1] = swap;
	        }
    }
  }
n=a2.length;
for(c=0;c<(n-1);c++) {
    for(d=0;d<n-c-1;d++) {
	        if(a2[d]<a2[d+1])
	        {
	          swap    = a2[d];
	          a2[d]   = a2[d+1];
	          a2[d+1] = swap;
	        }
    }
  }

	for (int i = 0; i < a1.length; i++) {
		if(a1[i]!=0)
			push(a1[i]);
	}
	for (int i = 0; i < a2.length; i++) {
		if(a2[i]!=0)
			push(a2[i]);
	}

}
	
	void pop(){
		if(top>=0)
			array[top--]=0;
	}
}

