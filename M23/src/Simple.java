import java.io.*;  
class Simple{  
 public static void main(String args[]){  
  try{  
   FileWriter fw=new FileWriter("abc.txt");  
   fw.write("v v v vq");  
   fw.close();  
  }catch(Exception e){System.out.println(e);}  
  System.out.println("success");  
 }  
}  