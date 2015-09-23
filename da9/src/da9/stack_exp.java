package da9;

import java.util.Arrays;

public class stack_exp {
	int size;
	char[] array;
	int top =-1;
	stack_exp(int size){
		this.size=size;
		this.array=new char[size];
		//Arrays.fill(array,'\0');
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
	void push(char s){
		if(top+1<size){
			array[++top]=s;
			 System.out.println("PUSH " + s + " Was Added to the Stack\n");
		}else System.out.println("Sorry But the Stack is Full");
		displayTheStack();
	}
	char peek(){
		//System.out.println("the peek is "+array[top]);
		if(top!=-1)
			return array[top];
		else 
			return '\0';
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
			array[top--]=' ';
			displayTheStack();
		}else{
			//displayTheStack();
			//System.out.println("Sorry strack is empty");
		}
	}
}
