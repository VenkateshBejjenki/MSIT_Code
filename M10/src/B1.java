import java.util.*;

/*
 * Create a Java class Point (x,y) with x and y coordinates.

    Create a line class. The line class has two points ((x1, y1), (x2, y2)) has a method length ().
    Create triangle class. The triangle class has three lines or sides ( [(x1,y1),(x2,y2)], [(x2,y2),(x3,y3)] , [(x3,y3),(x1,y1)]) and should have a method area() to find the area of the triangle.
    Create right angular (Has a right angle (90°)) , equilateral triangles (Three sides equal) by inheriting triangle class. 

    Use “Pythagoras” theorem to compute right angle triangle. refer here
    These triangles should have a method to find the area() by using suitable equation for the type of triangular.
    Instantiate the line and triangle classes with suitable data and print the line length and triangle area.
    For the right angular and equilateral triangles print the area by using super class method and the own method. 
 * */
class line{
	public double length (int x1,int x2,int y1,int y2){
		return Math.sqrt(Math.pow((x1+x2),2)+Math.pow((y1+y2),2));
	}
}
class triangle extends line{
	double len1,len2,len3;
	triangle(int x1,int y1,int x2,int y2,int x3,int y3){
		this.len1=length( x1, x2, y1, y2);
		this.len2=length(x2, x3, y2, y3);
		this.len3=length(x3,  x1,y3, y1);
	}
	public void area(){
		System.out.println(len1+" "+len2+" "+len3);
		
	}
}
class Rightangle extends triangle{

	Rightangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3);
	}
	public void area(){
		if(Math.pow(len1, 2)+Math.pow(len3, 2)==Math.pow(len2, 2)){
			System.out.println("Area of Rightangle triangle is "+(len1*len3/2));
		}
		
	}
}
class equlateralTriangle extends triangle{

	equlateralTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3);
	}
	public void area(){
		if(len1==len2&&len2==len3){
			System.out.println("Area of EqulateralTriangle is "+(Math.sqrt(3)*len1*len1/4));
		}
	}
	
}

public class B1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Each point of a triangle\n");
		int x1,x2,x3,y1,y2,y3,i=1;
		System.out.println("Enter the points (x"+i+" "+"y"+ i++ +")");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter the points (x"+i+" "+"y"+ i++ +")");
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter the points (x"+i+" "+"y"+ i++ +")");
		x3=sc.nextInt();
		y3=sc.nextInt();
		
		triangle t=new triangle(x1,y1,x2,y2,x3,y3);
		t.area();
		
		Rightangle tri = new Rightangle(x1,y1,x2,y2,x3,y3);
		tri.area();
		//tri.CheckRightangle();
		
		equlateralTriangle tri1 = new equlateralTriangle(x1,y1,x2,y2,x3,y3);
		tri1.area();
		//tri1.CheckEq();
	}

}
