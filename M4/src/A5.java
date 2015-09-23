/*
 Program:- Write a java program to assign 10 int values to the array numbers and remove the given values to the array?  
 Author:-Rajesh Kumar Sheela
 */
public class A5 {
	public static void main(String[] args) {
		int[] array= new int[11];
		for(int i=0;i<10;i++)
			array[i]=i;
		
		for(int i=0;i<10;i++)
			System.out.print(array[i]);
		int x=5,i,flag=0,n=10;
		for(i=0;i<10;i++){
			if(array[i]==x){
				flag=1;
				n--;
			}
			if(flag==1){
				array[i]=array[i+1];
			}
		}
		System.out.print("\n");
		for( i=0;i<n;i++)
			System.out.print(array[i]);
		//System.out.println("Given number is '"+x+"' and its index value is '"+i+"' it is replace and finale value is '"+array[i]+"'");
	}

}
