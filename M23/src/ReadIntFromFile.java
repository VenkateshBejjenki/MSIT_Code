import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadIntFromFile
{
 public static void main(String[] args) {
 String strFilePath = "/home/rajeshkumarsheela/ips";
   try
    {
      //create FileInputStream object
      FileInputStream fin = new FileInputStream(strFilePath);
     /*
       * To create DataInputStream object, use
       * DataInputStream(InputStream in) constructor.
       */
      DataInputStream din = new DataInputStream(fin);
      /*
        * To read a Java integer primitive from file, use
        * byte readInt() method of Java DataInputStream class.
        *
        * This method reads 4 bytes and returns it as a int value.
        */
       int i = din.readInt();
       System.out.println("int : " + i);
       /*
         * To close DataInputStream, use
         * void close() method.
         */
         din.close();
      }
    catch(FileNotFoundException fe)
    {
      System.out.println("FileNotFoundException : " + fe);
    }
    catch(IOException ioe)
    {
      System.out.println("IOException : " + ioe);
    }
  }
}