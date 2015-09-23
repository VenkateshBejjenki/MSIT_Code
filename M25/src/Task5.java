import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;


public class Task5 {

	public static void main(String[] args){
		try {
			ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("Students.txt"));
			Vector<students> v=new Vector<students>();
			v=(Vector<students>)os1.readObject();
			students ss=new students();
			//System.out.println(v.size());
			for(int i=0;i<v.size();i++){
				ss=v.get(i);
				System.out.println("Name:- "+ss.Name);
				System.out.println("Phone Number:- "+ss.phone_no);
				System.out.println("Roll Number:- "+ss.Roll_no);
				System.out.println("IT Marks:- "+ss.IT_marks);
				System.out.println("SS Marks:- "+ss.SS_marks);
				System.out.println("---------------------");
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
