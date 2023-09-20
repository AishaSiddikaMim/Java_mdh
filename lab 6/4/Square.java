package lab6.q4;

public class Square extends Rectangle{
   
    public Square(double length, double breadth) {
       
        super(length, breadth);
    }
    
    public void area() {
       System.out.println("Area of the square = " + (this.length * this.length));
    }
    
    public void perimeter() {
       System.out.println("Perimeter of the square = " + 2 * (this.length + this.length));
    }
   
    
}
