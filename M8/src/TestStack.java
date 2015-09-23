import java.util.*;

class MyIntStack {
   private int[] contents;
   private int tos;  // Top of the stack
   static int g=0;
   // constructors
   public MyIntStack(int capacity) {
      contents = new int[capacity];
      tos = -1;
   }
   public void push(int element) {
	   
      contents[g++]=element;
   }
 
   public int pop() {
	   contents[g]='\0';
	return --g;
      
   }
 
   public int peek() {
	   
	return contents[g];
      
   }
 
   public boolean isEmpty() {
	   int fl=0;
	   for(int i=0;i<contents.length;i++){
		   if(contents[i]!='\0'){
			   fl=1;
		   }
	   }
	   if(fl==1)
		   return false;
	   else
		   return true;
      
   }
 
   public boolean isFull() {
	   int c=0;
	   for(int i=0;i<contents.length;i++){
		   if(contents[i]!='\0'){
			   c++;
		   }
	   }
	   if(contents.length==c)
		   return false;
	   else
		   return true;
      
   }
   
}

class TestStack{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int x=sc.nextInt();
		MyIntStack my=new MyIntStack(x);
		System.out.println("Enter the array element to push");
		int c=sc.nextInt();
		my.push(c);
		System.out.println("recently inserted element is "+my.peek());
		
		System.out.println("isempty "+my.isEmpty());
		
		System.out.println("isfull "+my.isFull());
		
		System.out.println("Removes the recently inserted element");
		my.pop();		
	   }
	
}