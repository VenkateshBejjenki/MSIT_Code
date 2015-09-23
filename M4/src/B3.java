/*
 Program:-3. Write a Java program to reverse the given sentence except first letter in the word?
			Input:-  public static void main()
			Output:- pcilbu scitat vdio m)(nia  
 Author:-Rajesh Kumar Sheela
 */
public class B3 {
	public static void main(String[] args) {
		String ss="public static void main() ";
		char[] aa=new char[6];
		System.out.println(ss);
		int k=0,l;
		//System.out.println(ss.length());
		for(int i=0;i<ss.length();i++){
			if(ss.charAt(i)!=' '){
				aa[k++]=ss.charAt(i);
			}else{
				l=k-1;
				for(int j=0;j<k;j++){
					if(j==0)
					System.out.print(aa[j]);
					else{
						System.out.print(aa[l--]);
					}
				}
				System.out.print(" ");
				k=0;
				aa[5]='\0';
				
			}
		}
		
		
			
		

	}

}
