import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
	Program:-Write a Java program to read the content from above created file the ‘book.txt’, display it on the console.
  
 	Author :- @Rajesh Kumar Sheela
 
 */
public class Task2 {

	public static void main(String args[]) {
		String file_name="/home/rajeshkumarsheela/DOC-s/JAVA_Msit/M25/Library/book.txt";
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(file_name));
			books b=(books) os.readObject();
			System.out.println(b.name);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
