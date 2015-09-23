package da2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		String h=null;
		String search="rajesh";
		char[] def=new char[1000];
		Scanner read;
		Hashtable<Integer,String> map=new Hashtable<Integer, String>();
		int count=0;
		try {
			read = new Scanner(new File("read.txt"));
			while(read.hasNextLine()){
				h=read.nextLine();
				count=0;
				def=h.toCharArray();
				for(int i=0;i<h.length()-1;i++){
					if(def[i]==search.charAt(1)&&def[i+1]==search.charAt(2)){
						count++;
					}
				}
				System.out.println(search+" count "+count);
				map.put(count,h);
			}
			for(Map.Entry m:map.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  } 
		} catch (FileNotFoundException e) {e.printStackTrace();}

		
	}
}
