package lab6.q4;

public class Rectangle {
   
    double length;
    double breadth;
    
    public Rectangle(double length, double breadth){
        
        this.length = length;
        this.breadth = breadth;
    }
    
    public void area() {
       System.out.println("Area of the Rectangle = " + (this.length * this.breadth));
    }
    
    public void perimeter() {
       System.out.println("Perimeter of the Rectangle = " + 2 * (this.length + this.breadth));
    }
    
}
