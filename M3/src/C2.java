/*
 Program:- Print the following format using nested loops    
 Author:-Rajesh Kumar Sheela
 */
public class C2 {
	public static void main(String[] args) {
		int i,j;
		for(i=8;i>0;i--){	//should be iterate for 8 times
			for(j=i;j>0;j--){		//Based on on i j should be iterate
				System.out.print("*");
				}
			System.out.print("\n");
		}

	}

}
