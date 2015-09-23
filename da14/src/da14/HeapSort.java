package da14;

import java.util.Scanner;

class Books implements Comparable<Books>
{
	String name;
	int price;
	public Books(String name, int price) 
	{
		this.name = name;
		this.price = price;
	}
	public int compareTo(Books  bk) 
	{	 
		if(this.price==bk.price)  
		return 0;  
		else if(this.price>bk.price)  
		return 1;  
		else  
		return -1;
	}
	@Override
	public String toString() {
		return "Books [name=" + name + ", price=" + price + "]";
	}
	
}
public class HeapSort 
{
	Books books[];
	int start;
	Scanner scn;
	public HeapSort() 
	{
		scn=new Scanner(System.in);
		
	}
	public void heapify(Books[] b)
	{
		start=(b.length-1)/2;
		while(start>=0)
		{
			pushDown(b, start, b.length-1);
			start=start-1;
		}
	}
	public void pushDown(Books arr[],int start,int end)
	{
		int root,swap,child;
		root=start;
		while(((root*2)+1)<=end)
		{
			 child = (root*2)+1;
			 swap=root;
			 //int res = arr[swap].compareTo(child);
			 int res = arr[swap].compareTo(arr[child]);
			 if(res==-1)
			 {
				 swap=child;
			 }
			 int res1= arr[swap].compareTo(arr[child+1]);
			 if(child+1<=end && res1==-1)
			 {
				 swap=child+1;
			 }
			 if(swap==root)
			 {
				 return;
			 }
			 else
			 {
				 swap(root,swap);
				 root=swap;
			 }
		}
	}
	public void swap(int index1,int index2)
	{
		Books temp=books[index1];
		books[index1]=books[index2];
		books[index2]=temp;
	}
	public void sort(Books b[])
	{
		heapify(b);
		int end=books.length-1;
		while(end>0)
		{
			swap(end,0);
			end--;
			pushDown(books, 0, end);
		}
		
	}
	public static void main(String[] args) 
	{
		HeapSort bst=new HeapSort();
		int choice;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Sort");
            choice = bst.scn.nextInt();
           

            switch(choice)
            {
                case 1: System.out.println("Enter no of the book");
                		int n=bst.scn.nextInt();
                		bst.books=new Books[n];
                       System.out.println("Enter name and price");
                       
                       for(int i=0;i<n;i++)
                       {
                    	   String name=bst.scn.next();
                    	   int price=bst.scn.nextInt();
                    	   bst.books[i] = new Books(name, price);
                       }
                       break;
                case 2: for(int j=0;j<bst.books.length;j++)
                			System.out.println(bst.books[j]);
                		
                		break;
              
                case 3: bst.sort(bst.books);
                		break;
            }
        }while(choice!=4);

	}

}
