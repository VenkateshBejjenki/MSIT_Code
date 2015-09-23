/*
 * 1.Implement Vector list using Java Collections.
 * Author :- Rajesh Kumar Sheela
 * 
 */
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class vector_list {
	public static void main(String[] argsv){
		Vector<String> vm= new Vector<String>();
		vm.add("rajesh");
		vm.add("Kumar");
		vm.add("Sheela");
		
		System.out.println("Enumeration\n");
		Enumeration e =vm.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		System.out.println("\nIterator\n");
		Iterator itr = vm.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("\nListIterator\n");
		ListIterator le=vm.listIterator();
		while(le.hasNext()){
			System.out.println(le.next());
		}
		
		
	}
}
