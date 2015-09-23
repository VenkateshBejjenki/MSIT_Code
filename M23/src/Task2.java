
import java.io.*;
import java.util.*;


public class Task2 {

	public static void main(String[] args) throws IOException  {
			FileInputStream fn=new FileInputStream("non-prime.txt");
			DataInputStream dn=new DataInputStream(fn);
			ArrayList lst=new ArrayList();
			ArrayList prm=new ArrayList();
			 
			//all prime between 1 to 500
			int flag=1;
				for(int i1=2;i1<=500;i1++){
					flag=1;
					for(int j=2;j<i1;j++){
						if(i1%j==0){
							flag=0;
							break;
						}
					}
					if(flag==1){
						//k++;
							//System.out.println(i1);	
						prm.add(i1);	
					}
				}
				Iterator itr_prm=prm.iterator();
			int i=0,k=0,x=1,m=0;
			try{
			while((i=dn.readInt())!=-1){

					  while(itr_prm.hasNext()){
						  
						  m=(Integer) itr_prm.next();
						  System.out.println(m+" "+i);
						  if(i%m==0){
							  lst.add(m);
							 
						  }
					  }  
				
				
			}
			
		}catch(Exception e){System.out.println(e.getMessage());}
			
			// which prints all prime factor's
			/*Iterator itr=lst.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
				  
			  } */ 
			//System.out.println("Final Count is "+k);
		
	}
}

