import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
	Program:-Write a Java program to create a directory with the name Library using the predefined File class. Create a file inside this directory with the name ‘book.txt’. Write some programming book names into the file. * 
 
 	Author :- @Rajesh Kumar Sheela
 
 */
class books implements Serializable{
	String name;
}
public class Task1 {

	 public static void main(String args[]) {
	      String dirname = "Library";
	      File d = new File(dirname);
	      d.mkdirs();
	      String file_name="/home/rajeshkumarsheela/DOC-s/JAVA_Msit/M25/Library/book.txt";
	      try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file_name));
			books b=new books();
			b.name="Linux";
			os.writeObject(b);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	      System.out.println("Done");
	  }
}
