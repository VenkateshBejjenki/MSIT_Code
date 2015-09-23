package da_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class sort_books {

	public static void main(String[] argvs){
		LinkedList<books> b=new LinkedList<books>();
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		Scanner oo=new Scanner(System.in);
		books bk=null;
		for (int i = 0; i < 6; i++) {
			bk=new books();
			System.out.println("Enter the book details (name,id,author,price)");
			bk.Name=sc.nextLine();
			bk.Author=sc.nextLine();
			bk.Id=sc.nextLine();
			bk.Price=in.nextDouble();
			b.add(bk);
		}
		Collections.sort(b,new ids());
		for (int i = 0; i <b.size(); i++) {
			bk=b.get(i);
			System.out.println(bk.Name+"\t"+bk.Author+"\t"+bk.Price+"\t"+bk.Id);
		}
	}
}
