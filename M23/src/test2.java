
import java.io.*;
import java.util.*;


public class test2 {

	public static void main(String[] args)  {
			FileInputStream fn = null;
			try {
				fn = new FileInputStream("non-prime.txt");
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}//read file 
			DataInputStream dn=new DataInputStream(fn);
			
			FileOutputStream fout = null;
			try {
				fout = new FileOutputStream("non-prime1.txt");
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}//create new file
			DataOutputStream din=new DataOutputStream(fout);
			
			FileInputStream fn1 = null;
			try {
				fn1 = new FileInputStream("non-prime1.txt");
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}//read new file
			DataInputStream dn1=new DataInputStream(fn1);
			
			PrimeFactors p=new PrimeFactors();
			//all prime between 1 to 500
			int flag=1;
			int i;
				try{
					while((i=dn.readInt())!=-1){
						System.out.println("Value is "+i);
						din.writeInt(i);
						for (Integer integer : p.primeFactors(i)) {
						      System.out.println(integer);
						      din.writeInt(integer);
						    }
					}
					din.close();
			}catch(Exception e){System.out.println(e.getMessage());}
				
				
				//printing from new file that is dumped
				i=0;
				try {
					while((i=dn1.readInt())!=-1){
						System.out.println(i);
					}
				} catch (IOException e) {e.printStackTrace();}
	}
}
class PrimeFactors {
	   List<Integer> primeFactors(int number) {
	    int n = number;
	    List<Integer> factors = new ArrayList<Integer>();
	    for (int i = 2; i <= n; i++) {
	      while (n % i == 0) {
	        factors.add(i);
	        n /= i;
	      }
	    }
	    return factors;
	  }
}
	  
