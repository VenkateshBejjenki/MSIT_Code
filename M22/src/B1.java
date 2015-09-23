import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * Program :- i.Create a Student Hash Table to store n number of students with respect to their registration number. 
  ii.Take registration number as input and remove respective student details.
  
  Author :- Rajesh Kumar Sheela
  */
public class B1 {

	public static void main(String[] args) {
		
		
		/*stb.put(2, "rajesh");
		stb.put(1, "kumar");
		stb.put(3, "Sheela");
		
		stb.remove(9);*/
		System.out.println("Enter how many elements do you want to store");
		Scanner n=new Scanner(System.in);
		int num_key=n.nextInt();
		
		Hashtable<Integer, String> stb=new Hashtable<Integer, String>();

		
		for(int i=0;i<num_key;i++){
			System.out.println("Enter the key and pair value");
			stb.put(n.nextInt(),n.nextLine());
		}
		
		System.out.println("Enter the key value to remove");
		int y=n.nextInt();
	
		
		if(stb.containsKey(y))
				stb.remove(y);
		else
			System.out.println("cannot delete");
		
	for(Map.Entry m:stb.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
