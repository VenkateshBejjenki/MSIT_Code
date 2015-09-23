import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Task3 {

	public static void main(String[] args){
		ObjectOutputStream os;
		try {
			os = new ObjectOutputStream(new FileOutputStream("Task3.txt"));//input
			books[] b=new books[3];
			
			for(int i=0;i<3;i++){
				b[i]=new books();
				b[i].name="Linux";
				os.writeObject(b[i]);
			}
			os.close();
			ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("Task3.txt"));//output
			
			for(int i=0;i<3;i++){
				b[i]=(books) os1.readObject();
				System.out.println(b[i].name);
			}
			os1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
