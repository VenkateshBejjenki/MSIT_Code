/*
 Program:-2. Write a Java program to find out how many time the given word is repeated in the given sentence?
				Input:- Hi java, Hello Java, Java Program, Java is OO language.
				        Java
				Output:-4  
 Author:-Rajesh Kumar Sheela
 */
public class B2 {
	public static void main(String[] args) {
		
		String ss="Hi java, Hello java, java Program, java is OO language";
		String find="java";
		int lastIndex = 0;
	    int count =0;
	    while(lastIndex != -1){
	    	 lastIndex = ss.indexOf(find,lastIndex);
	    	 System.out.println(lastIndex); 
	           if( lastIndex != -1){
	                 count++;
	                 lastIndex+=find.length();
	           }
	    }
	    System.out.println(count);

	}

}
