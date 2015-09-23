/*
 Program:- Print the following format using nested loops    
 Author:-Rajesh Kumar Sheela
 */
public class C3 {
	public static void main(String[] args) {
		for(int i=0;i<=8;i++){	//should be iterate for 8 times
			for(int j=i;j>0;j--){		//Based on on i j should be iterate
				System.out.print(j+" ");	//Printing according to value of i
				}
			System.out.print("\n");
		}

	}

}
