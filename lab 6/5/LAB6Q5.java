package lab6.q5;

import java.util.Scanner;

public class LAB6Q5 {

    public static void main(String[] args) {
       
        double length;
        double breadth;
        
        Rectangle[] rectangle = new Rectangle[10];
        Square[] square = new Square[10];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 10 ; i++){
             
        System.out.println("Enter length = ");
        length = input.nextDouble();
        System.out.println("Enter breadth = ");
        breadth = input.nextDouble();
        
        rectangle[i] = new Rectangle(length, breadth);
        square[i] = new Square(length, breadth);
        
        rectangle[i].area();
        rectangle[i].perimeter();
        square[i].area();
        square[i].perimeter();
        
        }
        
    }
    
}
