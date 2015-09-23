/*
 * Author :- Rajesh Kumar Sheela
 * 
 * */
abstract class Shapes{
	void area(){};
	void perimeter(){};
}


class Triangle extends Shapes{
	int b,h,a;
	Triangle(int a,int b,int h){
		this.b=b;
		this.a=a;
		this.h=h;
	}
	
}
class IsoscelesTriangle extends Triangle{
	
	IsoscelesTriangle(int a, int b, int h) {
		super(a, b, h);
	}
	void area(){
		System.out.println((0.5*b*h));
	}
	void perimeter(){
		System.out.println(2*a+b);
	}
	
}
class EquilateralTriangle extends Triangle{
	
	EquilateralTriangle(int a, int b, int h) {
		super(a, b, h);
	}
	void area(){
		System.out.println((Math.sqrt(3)/4)*b*b);
	}
	void perimeter(){
		System.out.println(3*a);
	}
	
}


class Quadrilateral extends Shapes{
	int b,h,a;
	

}
class Rectangle extends Quadrilateral{

	Rectangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	void area(){
		System.out.println(a*b);
	}
	void perimeter(){
		System.out.println(2*(a+b));
	}
	
}
class Square extends Quadrilateral{

	Square(int a){
		this.a=a;
	}
	void area(){
		System.out.println(a*a);
	}
	void perimeter(){
		System.out.println(4*a);
	}
	
}class Rhombus extends Quadrilateral{

	Rhombus(int p,int q){
		this.a=p;
		this.b=q;
	}
	
	void area(){
		System.out.println(a*b/2);
	}
	void perimeter(){
		System.out.println(4*a);
	}
	
}



class Circle extends Shapes{
	int r;
	Circle(int r){
		this.r=r;
	}
	void area(){
		System.out.println(Math.PI*r*r);
	}
	void perimeter(){
		System.out.println(2*Math.PI*r);
	}
}


public class A1 {

	public static void main(String[] args) {
		System.out.println("IsoscelesTriangle");
		Shapes sp = new Triangle(10,20,15);
		sp=new IsoscelesTriangle(10,20,15);
		sp.area();
		sp.perimeter();
		System.out.println("EquilateralTriangle");
		sp=new EquilateralTriangle(10,10,10);
		sp.area();
		sp.perimeter();
		System.out.println("Circle");
		sp=new Circle(10);
		sp.area();
		System.out.println("Rectangle");
		sp=new Rectangle(10, 20);
		sp.area();
		sp.perimeter();
		System.out.println("Square");
		sp=new Square(5);
		sp.area();
		sp.perimeter();
		System.out.println("Rhombus");
		sp=new Rhombus(10,20);
		sp.area();
		sp.perimeter();
	}

}
