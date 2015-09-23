public class MyThread extends Thread {
   public void run(){  
    System.out.println("thread is running...");  
  } 
   public static void main(String[] args) {
     MyThread obj = new MyThread();
     obj.start();
}
}