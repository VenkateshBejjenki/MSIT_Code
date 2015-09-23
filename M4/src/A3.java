/*
 Program:-Write a java program to assign 10 int values to the array numbers and swap the 1st half to 2nd half?  
 Author:-Rajesh Kumar Sheela
 */
public class A3 {
	public static void main(String[] args) {
		int[] array= new int[10];
		for(int i=0;i<10;i++)
			array[i]=i;
		System.out.println("Before Swaping");
		for(int i=0;i<10;i++)
			System.out.print(array[i]);
		
		int temp;
		System.out.println("\nAfter Swaping");
		for(int i=0,y=5;i<5;i++){
			temp=array[i];
			array[i]=array[y];
			array[y]=temp;
			y++;
		}
		for(int i=0;i<10;i++)
			System.out.print(array[i]);

	}

}
