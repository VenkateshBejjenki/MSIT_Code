/*
 * Program:-Write a class called circle as shown in the following skeleton code. It contains:
 * Author:- Rajesh Kumar SHeela
 
 */
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
    public Circle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
  public Circle(double r) {
      radius = r;
      color = "red";
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   
   public static void main(String[] args) {
		
		Circle TestCircle1=new Circle();
		Circle TestCircle2=new Circle(10);
		
		System.out.println("Area of circle without parameters "+TestCircle1.getArea());
		System.out.println("Radius of circle without parameters "+TestCircle1.getRadius());
		System.out.println();
		System.out.println("Area of circle with parameters "+TestCircle2.getArea());
		System.out.println("Radius of circle with parameters "+TestCircle2.getRadius());
		
		
		
		
	}

}

