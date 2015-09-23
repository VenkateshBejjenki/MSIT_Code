/*
 Program:-Write a java program to assign 10 int values to the array numbers and find out the minimum and maximum values?  
 Author:-Rajesh Kumar Sheela
 */
public class A4 {
	public static void main(String[] args) {
		int[] array= new int[11];
		for(int i=0;i<10;i++)
			array[i]=i+1;
		
		int temp = 0,temp2=array[0];
		for(int i=0;i<10;i++){
			if(array[i]>array[i+1])
				temp=array[i];
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(array[i]<array[j]){
					if(temp2>array[i])
						temp2=array[i];
				}
			}
				
		}
		
		System.out.println(temp+"is max and "+temp2+" is mini");
	}

}
