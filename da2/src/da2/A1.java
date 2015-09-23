package da2;
import java.util.Scanner;


class user{
	String name;
	double[] marks=new double[6];
	String DOB;
	double GPA=0;
	int halt;
	double gpa(){
		for(int i=0;i<6;i++){
			if(marks[i]>=90&&marks[i]<100)
				GPA+=3.5;
			else if(marks[i]>=80&&marks[i]<=89)
				GPA+=3.49;
			else if(marks[i]>=70&&marks[i]<=79)
				GPA+=2.49;
			else if(marks[i]>=60&&marks[i]<=69)
				GPA+=1.49;
			else
				GPA+=0;
		}
		return Math.round((((GPA/6))*100)/100);
	}
}

class sort{
	user[] sort(user array[]){
			user swap=new user();
			int n=3;
			for (int c = 0; c < ( n - 1 ); c++) {
			      for (int d = 0; d < n - c - 1; d++) {
			        if (array[d].GPA<array[d+1].GPA)
			        {
			          swap       = array[d];
			          array[d]   = array[d+1];
			          array[d+1] = swap;
			        }
			      }
			    }
			return array;
			}
	 
}
public class A1 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		Scanner text=new Scanner(System.in);

		user[] s=new user[6];
		for(int k=0;k<3;k++){
			s[k]=new user();
			System.out.println("Enter name");
			s[k].name=sn.nextLine();
			System.out.println("Enter the dob");
			s[k].DOB=sn.nextLine();
			System.out.println("Enter marks");
			for(int t=0;t<6;t++){
				s[k].marks[t]=text.nextDouble();
			}
			s[k].halt=(int )(Math.random() * 100000 + 1);
			s[k].GPA=s[k].gpa();
		}
		sort s_t=new sort();
		user[] u=s_t.sort(s);
		int flag=0;
		for(int h=0;h<2;h++){
			if(u[h].GPA==u[h+1].GPA){
				for(int t=0;t<6;t++){
					if(u[h].marks[t]<u[h+1].marks[t]){
						u[h]=u[h+1];
						break;
					}
				}
			}
			System.out.println(u[h].name+" had got admission with gpa "+u[h].GPA);
			
		}
		
	

	}

}
