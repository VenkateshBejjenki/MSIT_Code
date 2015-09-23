/*
 Program:-Write a Java program called PrintDayInWord, which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "day" is 0, 1, ..., 6, respectively. Otherwise, it shall print “Not a valid day”.   
 Author:-Rajesh Kumar Sheela
 */
public class A2 {
	public static void main(String[] args) {
		int day = 5;		//given value
        String monthString;
        switch (day) {			//Starting switch case
	        case 0:  monthString = "Sunday";
	        		 break;
            case 1:  monthString = "Monday";
                     break;
            case 2:  monthString = "Tuesday";
                     break;
            case 3:  monthString = "Wednesday";
                     break;
            case 4:  monthString = "Thirsday";
                     break;
            case 5:  monthString = "Friday";
                     break;
            case 6:  monthString = "Saterday";
                     break;
            default: monthString = "Invalid Date";
                     break;
        }
        System.out.println(monthString);

	}

}
