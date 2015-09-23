/*
 Program:- Print the following format using nested loops    
 Author:-Rajesh Kumar Sheela
 */
public class C1 {
	public static void main(String[] args) {
		for(int i=0;i<8;i++){	//should be iterate for 8 times
			if(i%2==0)
				System.out.print(" ");		//printing white space
			for(int j=0;j<8;j++){
				if(j%2==0)
					System.out.print("#");		//printing # and * base in j
				else
					System.out.print(" *");
			}
			System.out.print("\n");
		}

	}

}
