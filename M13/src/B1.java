interface Operator{
	int performOperation(int num1, int num2);
}
class Add implements Operator 
     {
         private String opString;
              Add(char x) {
                 opString = "+";
             }
         public int performOperation(int num1, int num2) {
             return num1 + num2;
         }
          public String getOperation() {
          return opString;
         }
     }

class Sub implements Operator 
{
    private String opString;
         Sub() {
            opString = "-";
        }
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
     public String getOperation() {
     return opString;
    }
}

class Div implements Operator 
{
    private String opString;
         Div() {
            opString = "/";
        }
    public int performOperation(int num1, int num2) {
        return num1 / num2;
    }
     public String getOperation() {
     return opString;
    }
}

class Mul implements Operator 
{
    private String opString;
         Mul() {
            opString = "*";
        }
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
     public String getOperation() {
     return opString;
    }
}
public class B1 {
	public static void main(String[] argsv){
		Operator op=new Add('+');
		System.out.println(op.performOperation(10, 20)+" +");
		op=new Sub();
		System.out.println(op.performOperation(20, 10)+" -");
		op=new Mul();
		System.out.println(op.performOperation(10, 20)+" *");
		op=new Div();
		System.out.println(op.performOperation(20, 10)+" /");
	}
	
}
