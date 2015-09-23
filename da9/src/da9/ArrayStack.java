package da9;

import java.util.Arrays;
import java.util.Scanner;

class stack extends StackADT{
	int size;
	String[] array;
	int top =-1;
	stack(int size){
		this.size=size;
		this.array=new String[size];
		Arrays.fill(array, " ");
	}
	void displayTheStack(){
		for (int i = 0; i <100; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("|  "+(i+1)+" ");
		}
		System.out.println();
		for (int i = 0; i <100; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("| "+array[i]+" ");
		}
		System.out.println();
		for (int i = 0; i <100; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	void push(String s){
		if(top+1<size){
			array[++top]=s;
			 System.out.println("PUSH " + s + " Was Added to the Stack\n");
		}else System.out.println("Sorry But the Stack is Full");
		displayTheStack();
	}
	void peek(){
		System.out.println("the peek is "+array[top]);
	}
	
	void PushMany(String s){
		String[] tempString = s.split(" ");
		for (int i = 0; i < tempString.length; i++) {
			 push(tempString[i]);
		}
		
	}
	boolean isEmpty(){
		return top==-1;
	}
	void popAll(){
		for (int i =array.length; i >=0; i--) {
			pop();
		}
	}
	void pop(){
		if(top>=0){
			System.out.println("POP " + array[top] + " Was Removed From the Stack\n");
			array[top--]=" ";
			displayTheStack();
		}else{
			displayTheStack();
			System.out.println("Sorry strack is empty");
		}
	}
}


public class ArrayStack {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		stack s=new stack(10);
		int x=1;
		while(x!=0){
			System.out.println("1}--Push\n2}--Display\n3}--Peek\n4}--Pop\n5}--PopAll\n6}--PushMany\n7}--IsEmpty");
			System.out.println("enter the option");
			switch (in.nextInt()) {
			case 1:System.out.println("Push element");
				s.push(sc.nextLine());
				break;
			case 2:s.displayTheStack();break;
			case 3:s.peek();break;
			case 4:s.pop();break;
			case 5:s.popAll();break;
			case 6:System.out.println("Enter the many elements");s.PushMany(sc.nextLine());break;
			case 7:if(s.isEmpty()==true)System.out.println("Stack is empty\n");break;
			default:x=0;
				break;
			}
		}
	}

}
