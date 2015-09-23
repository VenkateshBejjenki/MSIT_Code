class Try    {
      void disp()   {
    	  System.out.println("It works");
      } 
}
 
class Test extends Try    {
    //  void disp()   {}
      public static void main(String args[]){
         Try t=new Try();
         Test t1=new Test();
         Try v;
         v=t1;
         v.disp();
      }
}