package lab7.qa;

import java.util.Scanner;

public class LAB7QA {

    public static void main(String[] args) {
        
        Area area = new Area();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Press (1) for calculating Rectangle Area");
        System.out.println("Press (2) for calculating Square Area");
        System.out.println("Press (3) for calculating Circle Area");
        
        int value = input.nextInt();
        
        if (value == 1)
        {
            double length, breadth;
            System.out.print("Enter Length = ");
            length = input.nextDouble();
            System.out.print("Enter Breadth = ");
            breadth = input.nextDouble();
            area.RectangleArea(length, breadth);
            area.getArea();
        }
        
        else if (value == 2)
        {
            double side;
            System.out.print("Enter Side = ");
            side = input.nextDouble();
            area.SquareArea(side);
            area.getArea();
        }
        
        else if (value == 3)
        {
            double radius;
            System.out.print("Enter Radius = ");
            radius = input.nextDouble();
            area.CircleArea(radius);
            area.getArea();
        }
        
        else
        {
            System.out.println("Incorrect Entry");
        }
    }
    
}

abstract class Shape{

    double[] area = new double[3];

    public double[] getArea() {
        return this.area;
    }

    public void setArea(double[] area) {
        this.area = area;
    }
    
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    
    @Override
    public double RectangleArea(double length, double breadth){
        this.area[0] = (length * breadth);
        System.out.println("Area = " + this.area[0]);
        return this.area[0];
    }
    
    @Override
    public double SquareArea(double side){
        this.area[1] = (side * side);
        System.out.println("Area = " + this.area[1]);
        return this.area[1];
    }
    
    @Override
    public double CircleArea(double radius){
        this.area[2] = (3.1416 * radius * radius);
        System.out.println("Area =  " + this.area[2]);
        return this.area[2];
    }
    }
    

