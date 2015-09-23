import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Program :- Write a Java program to demonstrate the file reading and writing using FileInputStream and FileOutputStream
	@Rajesh Kumar Sheela
*/
public class Task3 {

	public static void main(String[] args){
		FileOutputStream fw=null;
		FileInputStream fr=null;
		try {
			fw=new FileOutputStream("task3.txt");
			for(int i=1;i<10;i++){
				fw.write(i);
			}
		} catch (FileNotFoundException e){e.printStackTrace();}
		  catch (IOException e) {e.printStackTrace();}
		try {
			fr=new FileInputStream("task3.txt");
			int i;
			while((i=fr.read())!=-1){
				System.out.println(i);
			}
		} catch (FileNotFoundException e){e.printStackTrace();} 
		  catch (IOException e) {e.printStackTrace();}
	}
	
}
