/*
 Program:-Write a java program to assign 10 int values to the array numbers and print the index of the given value?  
 Author:-Rajesh Kumar Sheela
 */
public class A2 {
	public static void main(String[] args) {
		int[] array= new int[10];
		for(int i=0;i<10;i++)
			array[i]=i;
		
		array[5]=10;
		int value=10;
		for(int i=0;i<10;i++){
			if(array[i]==value)
				System.out.println("The element "+value+" is at index "+i);
		}
			

	}

}
