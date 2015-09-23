/*
 * Program;- Creating and joining threads

    Write a short program that prints "Hello world" from a thread.
    Now modify the program to print "Hello world" five times, once from each of five different threads.
    Now modify the printed string to include the thread number; ensure that all threads have a unique thread number. 
    
 * Author :- Rajesh kumar sheela
 * */

class join extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println("Hello World !"+getName());
	}
}
public class A1 {

	public static void main(String[] args) {
		join j1=new join();
		join j2=new join();
		join j3=new join();
		join j4=new join();
		join j5=new join();
		
		try{
			j1.start();
			j1.join();
			
			j2.start();
			j2.join();
			
			j3.start();
			j3.join();
			
			j4.start();
			j4.join();
			
			j5.start();
			//j5.join();
			
			
		}catch(Exception e){System.out.println(e);}  
		
	}

}
