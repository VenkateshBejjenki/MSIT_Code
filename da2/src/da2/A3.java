package da2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class read{
	Scanner read;
	String h=null;
	Vector<String> v=new Vector<String>();
	Vector<String> read(String file){
		try {
			read = new Scanner(new File(file));
			while(read.hasNextLine()){
				StringTokenizer st = new StringTokenizer(read.nextLine());
				while (st.hasMoreTokens()) {  
					v.add(st.nextToken());  
			     } 
			}
			return v;
		} catch (FileNotFoundException e) {e.printStackTrace();}
		return v;
	}
	void print(Vector<String> b){
		for(int i=0;i<b.size();i++)
			System.out.println(b.get(i));
	}
}

public class A3 {
	public static void main(String[] args) {
		
		read r1=new read();
		Vector<String> v1=r1.read("one.txt");
		//r1.print(r1.read("one.txt"));
		
		System.out.println();
		
		read r2=new read();
		Vector<String> v2=r2.read("two.txt");
		//r2.print(r2.read("two.txt"));
		
		int count=0;
		int x;
		if(v1.size()>v2.size())
			 x=v2.size();
		else
			x=v1.size();
		for(int i=0;i<x;i++){
				if(v2.get(i).toString().equalsIgnoreCase(v1.get(i))){
					count++;
				}
		}
		
		double per=((count*100)/x);
		System.out.println(per+"%");
		
	}
}
