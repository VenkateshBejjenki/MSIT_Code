package da3;

class febo{
	febo(int x){
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		 for(int i=2;i<x;++i)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
	}
}

public class feb {

	public static void main(String[] argvs){
		febo f=new febo(10);
	}
}
