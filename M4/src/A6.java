/*
 Program:-Write a java program to assign 10 int values to the array numbers1 and 5 int values to the array numbers2, remove numbers2 elements in numbers1 array?   
 Author:-Rajesh Kumar Sheela
 */
public class A6 {
	public static void main(String[] args) {
		int c=10;
		int[] array2= new int[5];
		int[] array1= new int[c];
		
		for(int i=0;i<c;i++)
			array1[i]=i+1;
		
		for(int i=0;i<5;i++)
			array2[i]=(i+1)*2;
		
		for(int i:array1)
			System.out.print(i);
		
		System.out.print("\n");
		for(int i:array2)
			System.out.print(i);
		System.out.print("\n");
		
		int i,flag=0,n=10;
		
		for(i=0;i<10;i++){
			flag=0;
			for(int j=0;j<5;j++){
				if(array1[i]==array2[j]){
					flag=1;
					n--;
				}
			}
			if(flag==1){
				for(int k=i;k<10-(i+1);k++){
					array1[k]=array1[k+1];
				}
			}
		}
		System.out.print("\nFinal Array size "+n+"\n");
		for( i=0;i<n;i++)
			System.out.print(array1[i]);
	}

}
