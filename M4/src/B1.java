/*
 Program:-1. Write a Java program to convert lower case letters to upper case letters and upper case letters to lower case letters in a given sentence?
			 Input:- Hello World JAVA Program
			 Output:- hELLO wORLD java pROGRAM   
 Author:-Rajesh Kumar Sheela
 */

public class B1 {
	public static void main(String[] args) {
		String st="Hello World JAVA Program";
		System.out.println(st);
		for(int i=0;i<st.length();i++){
			//System.out.print(st.charAt(i));
			if(st.charAt(i)==' ')
				System.out.print(' ');
			if((int)st.charAt(i)>=97&&(int)st.charAt(i)<=122)
				System.out.print(Character.toUpperCase(st.charAt(i)));
			else if((int)st.charAt(i)>=65&&(int)st.charAt(i)<=90)
				System.out.print(Character.toLowerCase(st.charAt(i)));
		}
		
	}
}
