
public class test2 {
	public static void main(String[] args) {
		String name = "Tan Ah Teck"; // String is double-quoted
	      char gender = 'm';           // char is single-quoted
	      boolean isMarried = true;    // true or false
	      byte numChildren = 8;        // Range of byte is [-127, 128]
	      short yearOfBirth = 1945;    // Range of short is [-32767, 32768]. Beyond byte
	      int salary = 88000;          // Beyond the ranges of byte and short
	      long netAsset = 8234567890L; // Need suffix 'L' for long. Beyond int
	      double weight = 88.88;       // With fractional part
	      float gpa = 3.88f;           // Need suffix 'f' for float
	      
	      System.out.println(name);
	      System.out.println(gender);
	      System.out.println(isMarried);
	      System.out.println(numChildren);
	      System.out.println(yearOfBirth);
	      System.out.println(salary);
	      System.out.println(netAsset);
	      System.out.println(weight);
	      System.out.println(gpa);
	}

}
