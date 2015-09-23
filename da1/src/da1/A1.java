package da1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args){
		int flag=0;
		try {
			char[] h=new char[500];
			Scanner read = new Scanner(new File("read.txt"));
			while(read.hasNextLine()){
				flag=0;
				h=read.nextLine().toCharArray();
				for (int i=0;i<h.length;i++){
						if(i==0){
							System.out.print((char)((int) h[i]-32));
							}
						else if(h[i]=='.'){
							System.out.print(h[i]);
							flag=1;
						}else if(h[i]!=' '&&flag==1){
							System.out.print((char)((int) h[i]-32));
							flag=0;
						}else{
							System.out.print(h[i]);
						}
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
