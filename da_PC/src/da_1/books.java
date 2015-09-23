package da_1;

import java.util.Comparator;

public class books {

	String Name,Author,Id;
	double Price;
}
class ids implements Comparator<books>{ 
	
	public int compare(books b1, books b2) {
		int x=0,y=0;
		for (int i = 0; i <b1.Id.length(); i++) 
			x+=(int)b1.Id.charAt(i);
		for (int i = 0; i <b2.Id.length(); i++) 
			y+=(int)b2.Id.charAt(i);
		if(x < y)
			return 1; 
		else 
			return -1; 	
		}
}