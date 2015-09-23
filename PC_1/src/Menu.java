/*
 * Program:-PC_1
 * Author:- Rajesh Kumar Sheela
 * 
 */

import java.util.*;

class Bookshelf{
	static Scanner scnn=new Scanner(System.in);
	private int maximumNumberOfBooks;
	String[] books;
	Bookshelf(int x){
		this.maximumNumberOfBooks=x;
		this.books=new String[maximumNumberOfBooks];
	}
	
	void addABook(){		//This should place a book at the specified position
		for(int i=0;i<maximumNumberOfBooks;i++){
			System.out.println("Enter the book name "+(i+1));
			books[i]=scnn.nextLine();
		}
	}
	void getABook(){		// by specifying the book's position
		System.out.println("Enter the book index\n");
		int index = scnn.nextInt();
		if(!(index>maximumNumberOfBooks))
			System.out.println(books[index-1]);
		else
			System.out.println("There is no book present at give index\n");
	}
	void removeABook(){		//specifying the index of the book to remove.
		int flag=0;
		System.out.println("Enter book name to remove\n");
		String rem_st=scnn.nextLine();
		for(int i=0;i<maximumNumberOfBooks;i++){
			if(rem_st.equals(books[i])){
				System.out.println("ok");
				books[i]="\0";
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("enter book is not present\n");
		}
	}
	void getAList(){		//provide a nicely formatted String containing the titles of each Textbook
		for(int i=0;i<maximumNumberOfBooks;i++){
			if(books[i]!="\0")
				System.out.println(books[i]);
			}
		System.out.println();
	}
}


public class Menu {

	public static void main(String[] args) {
		int x=1,input;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Max no of books ");
		int c=scn.nextInt();
		Bookshelf b=new Bookshelf(c);
		b.addABook();
		do{
			System.out.println("Remove Book\t--1");
			System.out.println("get a Book\t--2");
			System.out.println("Display Books\t--3");
			System.out.println("Exit\t--4");
			System.out.println();
			input=scn.nextInt();
			
			switch(input){
			case 1:b.removeABook();break;
			case 2:b.getABook();break;
			case 3:b.getAList();break;
			case 4:x=0;System.out.println("Thank You..!");break;
			}
			
		}while(x!=0);
		

	}

}
