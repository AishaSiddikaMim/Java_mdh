package lab6.q4;

import java.util.Scanner;

public class LAB6Q4 {

    public static void main(String[] args) {
        
        double length;
        double breadth;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length = ");
        length = input.nextDouble();
        System.out.println("Enter breadth = ");
        breadth = input.nextDouble();
        
        Rectangle rect = new Rectangle(length, breadth);
        rect.area();
        rect.perimeter();
        
        Square squ = new Square(length, length);
        squ.area();
        squ.perimeter();
    }
    
}
