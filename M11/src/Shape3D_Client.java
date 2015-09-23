/*
 * 1. Using an inheritance hierarchy, design a Java program to model 3-dimensional shapes (square pyramid, sphere, rectangular prism, cube, cylinder, circular cone). Make a top level shape class with methods for getting the area and the volume (+ methods toString and equals). Next, build classes and subclasses for the above 3dimensional shapes. make sure that you place common behavior in superclasses whenever possible. Also, use abstract classes as appropriate. Add methods to subclasses to represent unique behavior particular to each 3-dimensional shape. Write the definitions of these classes and a client program showing them in use. 
 * 
 *Author :- Rajesh Kumar Sheela
 *
 */

// Super class Shape3D: for three-dimensional shapes. 
 class Shape3D { 
    public double getArea(){  return 0.0;}; 
    public double getVolume(){  return 0.0;}; 
    public String toString(){ return " ";}; 
    public boolean equals(Object obj){ return false;}; 
}

// Class SquarePyramid. extends Shape3D 
// Represents a pyramid with a square as its base. 
 class SquarePyramid extends Shape3D { 
    private double length; 
    private double height;

    public SquarePyramid() { 
        length = 0; 
        height = 0; 
    } 
    public SquarePyramid(double l, double h) { 
        length = l; 
        height = h; 
    }

    public double getLength() { 
        return length; 
    }

    public double getHeight() { 
        return height; 
    }

    public double getArea() {
    	
		return (length*length)+2*length*Math.sqrt((length*length/4)+height*height); 
  
    }

    public double getVolume() {
    	
		return ((length*length)*height/3); 
    }

    public String toString() { 
        return "For this square pyramid the base has the length = " + length + " and the height = " + height; 
    }

    public boolean equals(Object obj) { 
        if (obj instanceof SquarePyramid) { 
            SquarePyramid other = (SquarePyramid) obj; 
            return length == other.length && height == other.height; 
        } 
        else 
            return false; 
    } 
}

// Class Sphere. extends Shape3D 
// Represents a perfect sphere.

 class Sphere extends Shape3D { 
    private double radius;

    public Sphere() { 
        radius = 0; 
    }

    public Sphere(double r) { 
        radius = r; 
    }

    public double getRadius() { 
        return radius; 
    }

    public double getArea() { 
        return (4*Math.PI*Math.pow(radius, 2));
    }

    public double getVolume() { 
    	return (4*Math.PI*Math.pow(radius, 3)/3);
    }

    public String toString() { 
        return "The radius of this sphere = " + radius; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
    	if (obj instanceof Sphere) { 
    		Sphere other = (Sphere) obj; 
            return true; 
        } 
        else 
            return false;
    } 
}

// Class RectangularPrism. extends Shape3D 
// Represents a three-dimensional rectangular shape.

 class RectangularPrism extends Shape3D { 
    private double length; 
    private double width; 
    private double height;

    public RectangularPrism() { 
      // write code here 
    }

    public RectangularPrism(double l, double w, double h) { 
      // write code here 
    	this.length=l;
    	this.height=h;
    	this.width=w;
    }

       public double getLength() { 
      // write code here 
    	   return length;
    }

    public double getWidth() { 
       // write code here
    	return width;
    }

     public double getHeight() { 
        return height; 
    }

    public double getArea() { 
        // write code here 
    	return (2*(length*width+height*length+height*width));
    	
    }

    public double getVolume() { 
       // write code here 
    	return length*width*height;
    }

    public String toString() { 
        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
    	if(obj instanceof Shape3D)
    		return true;
    	else
    		return false;
    
    } 
}

// Class Cube, subclass of RectangularPrism 
// Represents a perfect cube.

 class Cube extends RectangularPrism { 
	 double length;
    public Cube() { 
    // write code here 
    }

    public Cube(double size) { 
    // write code here
    	this.length=size;
    }
    public double getArea(){
    	return 6*length*length;
    	
    }
    
    public double getVolume(){
    	return Math.pow(length, 3);
    	
    }
    
    public String toString() { 
        return "For this cube all sides = " + super.getLength(); 
    } 
}



//Client to test them all! 
public class Shape3D_Client { 
    public static final int MAX = 6; 
    public static void main(String[] args) { 
        Shape3D[] shapes = new Shape3D[MAX]; 
// create all objects withe respective consturctors
// display 
        for(int i=0;i<6;i++)
        	shapes[i]=null;
        
        shapes[0]=new SquarePyramid(10,20);
        System.out.println( shapes[0].getArea());
        System.out.println(shapes[0].getVolume());
        System.out.println(shapes[0].toString());
        System.out.println(shapes[0].equals(shapes[0]));
        
        shapes[1]=new Sphere(10);
        System.out.println( shapes[1].getArea());
        System.out.println(shapes[1].getVolume());
        System.out.println(shapes[1].toString());
        System.out.println(shapes[1].equals(shapes[1]));
        
        shapes[2]=new RectangularPrism(10,20,37);
        System.out.println( shapes[2].getArea());
        System.out.println(shapes[2].getVolume());
        System.out.println(shapes[2].toString());
        System.out.println(shapes[2].equals(shapes[2]));
        
        shapes[3]=new Cube(10);
        System.out.println( shapes[3].getArea());
        System.out.println(shapes[3].getVolume());
        System.out.println(shapes[3].toString());
        System.out.println(shapes[3].equals(shapes[3]));


       
    } 
}