package da2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class A2_test {

	public static void main(String[] args) {
		String h=null;
		String search="rajesh";
		char[][] def=new char[1000][100];
		Scanner read;
		Vector<String> map=new Vector<String>();
		int count=0,i=0,j=0,k=0,flag=0;
		try {
			read = new Scanner(new File("read.txt"));
			while(read.hasNextLine()){
				h=read.nextLine();
				i=0;j=0;k=0;count=0;flag=0;
				while(i<h.length()){
					if(h.charAt(i)!=' '){
						def[j][k++]=h.charAt(i);
					}else{
						j++;
						k=0;
					}
					i++;
				}// 2d array is done
				
				for(int n=0;n<j;n++){
					flag=0;
					for(int o=0,t=0;t<def[n].length;t++){
							if(search.charAt(o++)==def[n][t])
								flag++;
							if(o>=search.length())
								break;
						}
					if(flag==search.length()){
						++count;
					}
				}
				//System.out.println(search+" count "+count);
				map.add(count+" of word "+search+"<--->"+h);
			}
			Collections.sort(map);
			for(int q=0;q<map.size();q++)
				System.out.println(map.get(q));
		} catch (FileNotFoundException e) {e.printStackTrace();}

		
	}
}
