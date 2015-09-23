/*
 Program:-Write a Java program to display the words which contains digits in the given sentence?
			Input:- java, j2se, jre, swings, jdk1.5, j2me, jsf, jsp
			output:- j2se jdk1.5 j2me  
 Author:-Rajesh Kumar Sheela
 */
public class B4 {
	public static void main(String[] args) {
		String sa="java j2se jre swings jdk1.5 j2me jsf jsp";
		System.out.println(sa);
		char[] aa=new char[6];
		int flag=0,k=0;
		for(int i=0;i<sa.length();i++){
			if(sa.charAt(i)!=' '){
				aa[k++]=sa.charAt(i);
				//System.out.println(k);
			}
			else{
				for(int j=0;j<k;j++){
						if((int)(aa[j])>=48&&(int)(aa[j])<=57){
							//System.out.println(sa.charAt(i));
							flag=1;
							break;
							
						}
				}
				if(flag==1){
					
					System.out.println(aa);
					flag=0;
				}
				k=0;
				for(int g=0;g<6;g++)
					aa[g]='\0';
				
			}
			
		}

	}

}
