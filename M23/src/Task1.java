import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Program:- Write a program that iterates over the first 500 natural numbers and write all the non-prime numbers to a file called "non-prime.txt". 
 * 
 * Author :- @Rajesh Kumar Sheela
 */
public class Task1 {

	public static void main(String[] args) throws IOException {
		int flag=1,k=0;
		FileOutputStream fout=new FileOutputStream("non-prime.txt");
		DataOutputStream din=new DataOutputStream(fout);
	try{
			for(int i=1;i<=500;i++){
				flag=1;
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag=0;
						break;
					}
				}
				if(flag==0){
					k++;
						System.out.println(i);	
						din.writeInt(i);
				}
			}
			
			din.close();
			System.out.println("Final Count is "+k);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}

	}

}
