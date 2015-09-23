import java.io.*;
import java.util.*;
 class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}
public class Vector_reading
{
   public static void main(String [] args)
   {
      
      try
      {
         FileInputStream fileIn = new FileInputStream("employee.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
		 Vector<Employee> v=new Vector<Employee>();
		 v=extracted(in);
          Employee e =new  Employee();
		 
         for(int i=0;i<v.size();i++)
		  {
             e=v.get(i);
			System.out.println("Deserialized Employee...");
			 System.out.println("Name: " + e.name);
             System.out.println("Address: " + e.address);
             System.out.println("SSN: " + e.SSN);
             System.out.println("Number: " + e.number);
			System.out.println("---------------------");
		 }
    
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
    }

private static Vector<Employee> extracted(ObjectInputStream in)
		throws IOException, ClassNotFoundException {
	return (Vector<Employee>)in.readObject();
}
}