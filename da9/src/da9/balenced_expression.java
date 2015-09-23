package da9;

import java.util.Scanner;

public class balenced_expression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		stack_exp st=new stack_exp(s.length());
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='<'){
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='>'){
				if(s.charAt(i)=='}'&&st.peek()=='{'){
					st.pop();
				}else if(s.charAt(i)==')'&&st.peek()=='('){
					st.pop();
				}else if(s.charAt(i)==']'&&st.peek()=='['){
					st.pop();
				}else if(s.charAt(i)=='>'&&st.peek()=='<'){
					st.pop();
				}
			}
				
		}
		//st.displayTheStack();
		if(st.isEmpty())
			System.out.println("expression is balanced");
		else
			System.out.println("expression is not balanced");
		
	}

}
